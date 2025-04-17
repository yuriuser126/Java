<%@page import="javax.naming.NamingException"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="javax.naming.Context"%>
<%@page import="javax.sql.DataSource"%>
<%@page import="javax.naming.InitialContext"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.SQLException"%>
<%@page import="javax.servlet.jsp.tagext.TryCatchFinally"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%!
	Connection conn = null;
    DataSource ds = null;
//     Statement stmt=null;
	PreparedStatement pstmt = null;
    ResultSet rs = null;
    
    
/* dbcq에 들어가있다. 
	String url = "jdbc:oracle:thin:@localhost:1521:xe";
	String user = "scott";
	String password = "tiger";
	String sql = "select id,pw,name,class,tel from member2"; */
    
    %>
    
    
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<%
	try{
		Context ctx =  new InitialContext();
		ds = (DataSource)ctx.lookup("java:comp/env/jdbc/oracle");
		conn= ds.getConnection();
		
		StringBuffer selectQuery = new StringBuffer();
// 		id에 물음표 값이 들어가야한다. 넘겨온값을 받아야하기때문
		String id = request.getParameter("id");
		selectQuery.append("select name,class,tel from member2 where id=?");
// 		dbcp 연결정보객체(conn)을 가지고, preparedStatement 메소드 호출해서
// PreparedStatement 객체 생성해서 쿼리사용
		pstmt=  conn.prepareStatement(selectQuery.toString());
// 		setString 메소드 쿼리파라미터 값을 저장
		pstmt.setString(1, id);
		rs = pstmt.executeQuery();
		
		
/* 	비교	
		conn = DriverManager.getConnection(url, user, password);
		stmt = conn.createStatement();
		rs = stmt.executeQuery(sql); */
		
// 		while(rs.next()){
		if(rs.next()){
			%>
			<form method="post" action="updateProcessOracle.jsp">
				아 이 디 :<input type="text" name="id" value="<%= id %>"><br>
				회원이름 :<input type="text" name="name" value="<%= rs.getString("name") %>"  ><br>
				회원등급 :<input type="text" name="mclass" value="<%=rs.getString("class") %>"><br>
				전화번호 :<input type="text" name="tel" value="<%= rs.getString("tel") %>"><br>
				<input type="submit" value="수정">
				<a href="viewMemberOracle.jsp">목록보기</a>
			</form>
			<% 
		}else{
				%>
				<font color="red">아이디 없3~~</font>
				<a href="viewMemberOracle.jsp">목록보기</a> 
				<% 
			}
		//catch 두개넣어도됨 네임 못찾을때 dbcp name못찾을때 오류
	}catch(NamingException ne){
		//예외처리
		ne.printStackTrace();}
		catch(SQLException ex){
		out.print("데이터 베이스 연결이 실패했습니다.");
		out.print(ex.getMessage());
	}finally{
		try{
			if(rs != null){rs.close();}
			if(pstmt != null){pstmt.close();}
			if(conn != null){conn.close();}	
		}catch(SQLException se){
			se.printStackTrace();
		}
	}
	
	%>


</body>
</html>