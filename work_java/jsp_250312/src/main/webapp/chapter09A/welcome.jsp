<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%
	//설정된세션명userID 값이 null 이면 
	//response 객체의 sendRedirect() 를 이용하여 session_out.jsp 파일로 이동
	//로그아웃을클릭하면설정된세션을해제
	//s_name?


	 if(session.getAttribute("userID") == null ){
		 response.sendRedirect("session_out.jsp");
		 
	
	}
	



%>
	<h4><%= session.getAttribute("userID") %>님 반갑습니다.</h4>
	<a href="session_out.jsp">로그아웃</a>

</body>
</html>