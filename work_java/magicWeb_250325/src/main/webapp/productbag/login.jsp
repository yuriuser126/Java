<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<!-- <meta charset="UTF-8"> -->
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name = "viewport" content="width=device-width", initial-scale="1">
<link rel="stylesheet" href="css/bootstrap.css">
<title>Login</title>
<style type="text/css">
#loginform{

	border: 1px solid black;
	text-align: center;
}
#h1{
	font-weight: bold;
}
</style>
</head>
<body>
<h1>Login</h1>
<form method="post" action="login_result.jsp" name="form1">
	
	<table id="loginform">
		<tr>
			<td>아이디</td>
			<td><input name="id" type="text" placeholder="아이디입력"></td>
		</tr>
		<tr>
			<td>비밀번호</td>
			<td><input name="pw" type="password" placeholder="비밀번호입력"></td>
		</tr>
		<tr>
			<td colspan="2"><input type="submit" value="로그인"></td>
		</tr>
	</table>
</form>

</body>
</html>