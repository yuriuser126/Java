<%@page import="javax.naming.NamingException"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="javax.naming.Context"%>
<%@page import="javax.sql.DataSource"%>
<%@page import="javax.naming.InitialContext"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.SQLException"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%!
	Connection conn = null;
    DataSource ds = null;
	PreparedStatement pstmt = null;
    ResultSet rs = null;
    %>
    
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<%
		request.setCharacterEncoding("UTF-8");
	%>

	<%
	//dbcp를 위한 try catch  세트 ~
	try{//세줄세트 -> 한줄 !-!
		/* Context ctx =  new InitialContext();
		ds = (DataSource)ctx.lookup("java:comp/env/jdbc/oracle");
		conn= ds.getConnection(); */
		
		conn = ((DataSource)(new InitialContext().lookup("java:comp/env/jdbc/oracle"))).getConnection();
	}catch(NamingException ne){//dbcp name을 못찾을때 오류
		//예외처리
		ne.printStackTrace();}
		catch(SQLException ex){
		out.print("데이터 베이스 연결이 실패했습니다.");
		out.print(ex.getMessage());
	}
/*  finally{
		try{
			if(rs != null){rs.close();}
			if(pstmt != null){pstmt.close();}
			if(conn != null){conn.close();}	
		}catch(SQLException se){
			se.printStackTrace();
		}  
	} */
	//값을받는건 이렇게 바깥에 둬도 괜찮습니다
	
	
	String id="",  name="", vclass="", tel="";
		id = request.getParameter("id");
		name = request.getParameter("name");
		vclass = request.getParameter("mclass");
		tel = request.getParameter("tel");
		
		out.print("@# id => "+id);
		out.print("@# name => "+name);
		out.print("@# vclass => "+vclass);
		out.print("@# tel => "+tel);
		
		StringBuffer updateQuery = new StringBuffer();
		//자동커밋된다.  where id=? 추가 꼭하기
		updateQuery.append("update member2 set name=?, class=?, tel=? where id=?");
		
		
	try{
		pstmt=  conn.prepareStatement(updateQuery.toString());
		pstmt.setString(1, name); 
		pstmt.setInt(2, Integer.parseInt(vclass));
// 		pstmt.setInt(2, Integer.parseInt(vclass));

// 		업데이트 SQL 처리(데이터가 변경되거나 삭제될수도 있기에 예외처리)
//		4개의 ? 값을 순서대로 값세팅
//varchar2타입은 setstring 메소드 사용
// 		pstmt.setString(2, vclass); oracle 가서 casting (속도저하)
// Int 타입은 setInt 메소드 사용
//미리 캐스팅해서 가지고가는게 좋다.
		
		pstmt.setString(3, tel);
		pstmt.setString(4, id);
		
		//int타입 1이 들어감 1건이 들어간다.
		//정상적으로 수정시 1이 반환됨
		int re = pstmt.executeUpdate();
		
		
		if(re == 1){
			
			%>
			 <%= id %>정보가 수정되었습니다.<br>
			 [<a href="viewMemberOracle.jsp">목록보기</a>]
			<%
		}else{
			%>
			변경 실패.
			<%
			
		}
		
	//업데이트 SQL 처리(데이터가 변경되거나 삭제될수도 있기에 예외처리)
	// 밥먹고와서 수정하는데 정보끌어온상태에서 잠시 다녀온사이에 퇴사하고옴 문제생기는거 처리하는공간
		
		
		}catch(SQLException ex){
			out.print("데이터 베이스 연결이 실패했습니다.");
			out.print(ex.getMessage());
		}
	finally{
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