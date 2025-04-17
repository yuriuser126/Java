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
//설정된모든세션명을해제
// response 객체의 sendRedirect() 를 이용하여 session.jsp 파일로 이동

	session.invalidate();
//이대로 쓰는 것이다 안에 세션을 집어넣지 않는다.


response.sendRedirect("session.jsp");
%>

</body>
</html>