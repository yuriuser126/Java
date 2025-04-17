<%@page import="javax.naming.Context"%>
<%@page import="javax.naming.InitialContext"%>
<%@page import="javax.naming.NamingException"%>
<%@page import="javax.sql.DataSource"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%! 
	Connection conn = null;
	DataSource ds = null;
%>

<%
	try{
		//InitialContext : dbcp 사용하기 위한 객체 생성
		Context ctx =  new InitialContext();
		ds = (DataSource)ctx.lookup("java:comp/env/jdbc/oracle");
		conn= ds.getConnection();
		out.print("DBCP 연동성공");
	}catch(NamingException ne){
		//예외처리
		ne.printStackTrace();
	}finally{
		try{
// 			dbcp 연결된 정보가 있으면 자원 반납
			if(conn != null ) conn.close();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
%>

</body>
</html>