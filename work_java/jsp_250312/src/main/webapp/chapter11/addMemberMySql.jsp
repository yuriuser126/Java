<%@page import="java.sql.SQLException"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Driver"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%! 
	Connection conn = null;
	Statement stmt = null;
	ResultSet rs = null;

	String url = "jdbc:mysql://localhost:3306/jspdb";
	String user = "root";
	String password = "1234";
	//String sql : 조회쿼리 oracle에서 확인하고 가지고 와야한다. 세미콜론

%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<body>
	<%
	//넘어온값 받는거 한꺼번에 QueryString.java에서 가지고옴
	String id="", pw="", name="", vclass="", phone1="", phone2="", phone3="";
	id = request.getParameter("id");
	pw = request.getParameter("pw");

	//String aaa = URLEncoder.encode(request.getParameter("name"), "UTF-8");
	//name = request.getParameter("name");
	name = request.getParameter("name");
	//out.println(aaa);
	
	vclass = request.getParameter("mclass");
	phone1 = request.getParameter("phone1");
	phone2 = request.getParameter("phone2");
	phone3 = request.getParameter("phone3");
	
	//쿼리결과가 나오는곳
	//druvermanager 임포트
	try{
		conn = DriverManager.getConnection(url, user, password);
		stmt = conn.createStatement();
		//쿼리 결과는  ResultSet 으로담는다
		//rs = stmt.executeQuery(sql);
		StringBuffer insertQuery = new StringBuffer();
		
		//insertQuery 조합
		insertQuery.append("insert into member values('");
		insertQuery.append(id+"','");
		insertQuery.append(pw+"','");
		insertQuery.append(name+"','");
		insertQuery.append(vclass+"','");
		insertQuery.append(phone1+"-"+phone2+"-"+phone3+"')");
		
		//조합한쿼리확인
		out.print(insertQuery);
		//타입이 인트라서, executeUpdate 메소드 : insert 할때 사용됨
		int re = stmt.executeUpdate(insertQuery.toString());
		
		//인서트 성공시 re = 1건이다.
		if(re == 1 ){
			%>
				추가 성공
				<br>
				<a href="addFormMySql.html">추가 작업</a>
				<a href="viewMemberMySql.jsp">조회 작업</a>
				
			<% 
		} else {
			%>
				<font color="red">추가 실패 ㅜ.ㅜ</font>
			<% 
		}
		
	}catch(SQLException ex){
		out.print("데이터 베이스 연결이 실패했습니다.");
		out.print(ex.getMessage());
	}finally{
		try{
			if(rs != null){rs.close();}
			if(stmt != null){stmt.close();}
			if(conn != null){conn.close();}	
		}catch(SQLException se){
			se.printStackTrace();
		}
	}
	%>
</body>
</html>