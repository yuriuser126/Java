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
			String value = request.getQueryString();
			out.print("전송된 요청 파라미터 : " + value);
			%>

</body>
</html>