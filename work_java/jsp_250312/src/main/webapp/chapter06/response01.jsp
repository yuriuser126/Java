<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%-- 원래 서블릿때저거 했었다. jsp ;사용 --%>
	<form method="post" action="response01_process.jsp">
	<p>아 이 디 :<input type="text" name="id" ></p>
	<p>비밀번호 :<input type="text" name="passwd" ></p>
	<p><input type="submit" name="전송" ></p>
	</form>
</body>
</html>