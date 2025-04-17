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
	String url = "jdbc:oracle:thin:@localhost:1521:xe";
	String user ="scott";
	String password ="tiger";
	String sql ="select id, pw, name, class, tel from member2";
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
<%-- 				<tr>
					<td><%= rs.getString("id") %></td> --%>
					<td>
					<!--데이터 넘기는 방법  -->
					<!--1.해당키(ex>아이디)만 넘길때  -->
					<!--1번을 실무에서 많이 사용: 수정(클릭하는 시점을 반영)  -->
					<!-- 아이디 가지고 가서 조회 -->
					<!-- select~where id=?  -->
					
					<!--2.모든 데이터 넘길때  -->
					<!-- ?id= &name= &tel= -->
					<a href="updateMemberOracle22.jsp?id=<%= rs.getString("id") %>">
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