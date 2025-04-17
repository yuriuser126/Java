<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%--  input 태그에 text 유형을 이용하여 아이디, 비밀번호 작성 --%>
<%--  form 태그의 action 속성 값은 session_process.jsp 로 작성 --%>

	<form method="post" action="session_process.jsp">
	<p>아 이 디 :<input type="text" name="id" ></p>
	<p>비밀번호 :<input type="text" name="passwd" ></p>
	<p><input type="submit" value="전송" ></p>
	</form>
	


</body>
</html>