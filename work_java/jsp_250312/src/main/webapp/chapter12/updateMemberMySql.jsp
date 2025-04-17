<%@page import="javax.naming.NamingException"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="javax.sql.DataSource"%>
<%@page import="javax.naming.InitialContext"%>
<%@page import="javax.naming.Context"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.SQLException"%>
<%@page import="javax.servlet.jsp.tagext.TryCatchFinally"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%! Connection conn=null;
	DataSource ds=null;
	PreparedStatement pstmt=null;
	ResultSet rs=null;
%>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<%
		try{
			Context ctx=  new InitialContext();
			ds = (DataSource)ctx.lookup("java:comp/env/jdbc/mysql");
			conn = ds.getConnection();

			StringBuffer selectQuery = new StringBuffer();
			String id = request.getParameter("id");
			selectQuery.append("select name, class, tel from member where id=?");
			
			pstmt = conn.prepareStatement(selectQuery.toString());
			pstmt.setString(1, id);
			rs = pstmt.executeQuery();
			
			if(rs.next()){ 
				%>
				<form method="post" action="updateProcessMySql.jsp">
				아이디:<input type="text" name="id" value="<%= id %>"><br>
				이름:<input type="text" name="name" value="<%= rs.getString("name") %>"><br>
				회원등급:<input type="text" name="mclass" value="<%= rs.getString("class") %>"><br>
				전화번호:<input type="text" name="tel" value="<%= rs.getString("tel") %>"><br>
				<input type="submit" value="수정">
				<a href="viewMemberMySql.jsp">목록보기</a>
				
				</form>
				<%
			}else{
				%>
					<font color="red">아이디 없음</font>
					<a href="viewMemberMySql.jsp">목록보기</a>
			<%		
				}
		}catch(NamingException ne){
			ne.printStackTrace();		
		}catch(SQLException ex){
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