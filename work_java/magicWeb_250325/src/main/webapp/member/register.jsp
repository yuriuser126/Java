
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

    
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
	<script src="script.js" type="text/javascript"></script>
</head>
<body>
<table  border="1" align="center">
<form name="reg_frm" method="post" action="registerOk.jsp">
		<tr height="50">
			<td colspan="2" align="center">
				<h1>회원 가입 신청</h1><br>
				'*'표시 항목은 필수 입력 항목입니다.
			</td>
		</tr>
		<tr height="30">
			<td width="80">User ID</td>
			<td>
			<input name = "mem_uid" type="text" size="20">*
			</td>
		</tr>
		<tr height="30">
			<td width="80">암호</td>
			<td>
			<input name = "mem_pwd" type="password" size="20">*
			</td>
		</tr>
		<tr height="30">
			<td width="80">암호 확인</td>
			<td>
			<input name = "pwd_check" type="password" size="20">*
			</td>
		</tr>
		<tr height="30">
			<td width="80">이   름</td>
			<td>
			<input name = "mem_name" type="text" size="20">*
			</td>
		</tr>
			<tr height="30">
			<td width="80">E-mail</td>
			<td>
			<input name="mem_email" type="text" size="30">*
			</td>
		</tr>
		<tr height="30">
			<td width="80">주  소</td>
			<td>
			<input name="mem_address" type="text" size="40">
			</td>
		</tr>

		<td colspan="2" align="center">
			<input type="button" value="등록" onclick="check_ok()">
			<input type="reset" value="다시입력">
			<input type="button" value="가입안함"  onclick="location='login.jsp'">
			</td>
		</tr>
</form>

	<!-- 	button이랑 submit이랑 뭔차이 -->

</table>

</body>
</html>