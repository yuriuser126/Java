<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body bgcolor="yellow">
		<center>
			<h3>[jsp:foward 액션 태그에 대한 예제]</h3>
		</center>
		<hr>
		이 파일은 yellow02.jsp입니다.<br>
		웹 브라우저에 나타나는 웹페이지는<br>
		<%= request.getParameter("url") %>로 이동 되었습니다.
		<hr>
		<%= request.getParameter("url") %>
		에서 넘어온 메세지 :
		<%= request.getParameter("news") %>
</body>
</html>