<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.SQLException"%>
<%@page import="javax.servlet.jsp.tagext.TryCatchFinally"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%! Connection conn=null;
	Statement stmt=null;
	ResultSet rs=null;

	String url = "jdbc:mysql://localhost:3306/jspdb";
	String user = "root";
	String password = "1234";
	String sql ="select id, pw, name, class, tel from member";
%>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table width="400" border="1">
	<tr>
	<td>아이디</td>
	<td>이름</td>
	<td>등급</td>
	<td>전화번호</td>
	</tr>
	<%
		try{
			conn = DriverManager.getConnection(url, user, password);
			stmt = conn.createStatement();
			rs =stmt.executeQuery(sql);
			while(rs.next()){
				%>
					<td>
					<a href="updateMemberMySql.jsp?id=<%= rs.getString("id") %>">
						<%= rs.getString("id") %>
					</a>
					</td>
					<td><%= rs.getString("name") %></td>
				<td><% int n_class = rs.getInt("class");
				if(n_class ==1){
					out.print("일반회원");
				}else{
					out.print("교수님");
					
				}%></td> 
					<td><%= rs.getString("tel") %></td>
				</tr>
				<%
				
			}			
		}catch(SQLException ex){
			out.print("데이터 베이스 연결이 실패했습니다.");
			out.print(ex.getMessage());
			
		}finally{
			//처음 쓴것을 마지막에 닫아줌
			try{
			if(rs != null){rs.close();}
			if(stmt != null){stmt.close();}
			if(conn != null){conn.close();}
			}catch(SQLException se){
				se.printStackTrace();
				}
			}
	%>
	</table>
</body>
</html>