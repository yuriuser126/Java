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
		request.setCharacterEncoding("UTF-8");
	%>

	<%
		try{
			/* Context ctx=  new InitialContext();
			ds = (DataSource)ctx.lookup("java:comp/env/jdbc/oracle");
			conn = ds.getConnection(); */
			conn = ((DataSource)(new InitialContext().lookup("java:comp/env/jdbc/mysql"))).getConnection();
			
			
}catch(NamingException ne){
	ne.printStackTrace();		
		}catch(SQLException ex){
			out.print("데이터 베이스 연결이 실패했습니다.");
			out.print(ex.getMessage());
			
		}/*  finally{
			//처음 쓴것을 마지막에 닫아줌
			try{
			if(rs != null){rs.close();}
			if(pstmt != null){pstmt.close();}
			if(conn != null){conn.close();}
			}catch(SQLException se){
				se.printStackTrace();
				}
			}*/
	
			String id="", name="", vclass="", tel="";
			
			id = request.getParameter("id");
			name = request.getParameter("name");
			vclass = request.getParameter("mclass");
			tel = request.getParameter("tel");
			
			out.print("@# id =>"+id);
			out.print("@# name =>"+name);
			out.print("@# vclass =>"+vclass);
			out.print("@# tel =>"+tel);
			
			StringBuffer updateQuery = new StringBuffer();
			//넘어오는값 아직 모름 ? 로 받음
			//이렇게 하면 전부 들어감. 자동커밋됨	/ where id=?를 해줘야 (이름,등급,전화 등 포함한)1건이 들어간다				
			//updateQuery.append("update member2 set name=?, class=?, tel=?");
			updateQuery.append("update member set name=?, class=?, tel=? where id=?");
			
				try{
					//업데이트 SQL 처리(데이터가 조회 도중에 변경되거나 삭제될 수도 있기에 예외처리)
					pstmt = conn.prepareStatement(updateQuery.toString());
					//? 4개를 순서대로 값을 셋팅
					pstmt.setString(1, name); //VARCHAR2 타입은 setString 메소드 사용
					//vclass int변환 안해주면 oracle가서 casting (속도저하)
					pstmt.setInt(2, Integer.parseInt(vclass)); //Int 캐스팅
					pstmt.setString(3, tel);
					pstmt.setString(4, id);
					int re = pstmt.executeUpdate();//정상적으로 수정시 1이 반환됨
					
					if(re==1){
						%>
						<%=id %>의 정보가 수정되었습니다.<br>
						[<a href="viewMemberMySql.jsp">목록보기</a>]
						<%
					}else{
						%>
						변경실패
						<%
					}
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
						}} 
			%>
			
</body>
</html>