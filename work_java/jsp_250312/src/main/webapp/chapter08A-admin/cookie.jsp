<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%-- input 태그에 text 유형 이용 아이디,비밀번호 작성--%>
<%-- form 태그에 action 유형 cookie_process.jsp 로 작성--%>

	<form method="post" action="cookie_process.jsp">
	<p>아 이 디 :<input type="text" name="id" ></p>
	<p>비밀번호 :<input type="text" name="passwd" ></p>
	<p><input type="submit" value="전송" ></p>
	</form>
	




</body>
</html>

<%--
	<form method="get" action="cookie_process.jsp">
	<p>아 이 디 :<input type="text" name="id" ></p>
	<p>비밀번호 :<input type="text" name="passwd" ></p>
	<p><input type="submit" name="전송" ></p>
	</form>

 --%>