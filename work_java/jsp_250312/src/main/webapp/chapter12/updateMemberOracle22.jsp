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
	/* 서버에 다 들어가있으므로 생략
	String url = "jdbc:oracle:thin:@localhost:1521:xe";
	String user ="scott";
	String password ="tiger";
	  */
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
			ds = (DataSource)ctx.lookup("java:comp/env/jdbc/oracle");
			conn = ds.getConnection();

			StringBuffer selectQuery = new StringBuffer();
			String id = request.getParameter("id");
			selectQuery.append("select name, class, tel from member2 where id=?");
			
			//dbcp연결 정보 객체(conn)을 가지고, preparedStatement 메소드 호출해서
			//preparedStatement 객체 생성해서 쿼리 사용
			pstmt = conn.prepareStatement(selectQuery.toString());
			//setString 메소드 : 쿼리 파라미터 값을 저장
			pstmt.setString(1, id);
			rs = pstmt.executeQuery();
			
			
// 			while(rs.next()){ 
// 	정보 조회중에 퇴사했을 경우 안들고오게 하려고
			if(rs.next()){ 
				%>
				<form method="post" action="updateProcessOracle22.jsp">
				<!--표현식 쓰는 이유 : 그 아이디의 값을 받아옴  -->
				아이디:<input type="text" name="id" value="<%= id %>"><br>
				이름:<input type="text" name="name" value="<%= rs.getString("name") %>"><br>
				회원등급:<input type="text" name="mclass" value="<%= rs.getString("class") %>"><br>
				전화번호:<input type="text" name="tel" value="<%= rs.getString("tel") %>"><br>
				<input type="submit" value="수정">
				<a href="viewMemberOracle.jsp">목록보기</a>
				
				</form>
				<%
			}else{
				%>
					<font color="red">아이디 없음</font>
					<a href="viewMemberOracle22.jsp">목록보기</a>
			<%		
				}
		}catch(NamingException ne){
			ne.printStackTrace();		
		}catch(SQLException ex){
			out.print("데이터 베이스 연결이 실패했습니다.");
			out.print(ex.getMessage());
			
		}finally{
			//처음 쓴것을 마지막에 닫아줌
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