<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
        <%
request.setCharacterEncoding("UTF-8");
%>
<!-- 한글처리 -->
<%
String pageNum =	request.getParameter("pageNum");

	int b_id = Integer.parseInt(request.getParameter("b_id"));
%>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
	<script src="board.js" type="text/javascript"></script>
</head>
<body>
	<center>
		<h1>글 삭 제 하 기</h1>
<!-- 		show.jsp 로 부터 받은 글번호를 delete_ok.jsp 로 넘겨준다. -->
		<form name="del_frm" method="post" action="delete_ok.jsp?b_id=<%= b_id %>&pageNum=<%= pageNum %>">
			<table>
				<tr height="50">
					<td colspan="2" align="left">
						<b>
							>> 암호를 입력하세요.<<
						</b>
					</td>
				</tr>
				<tr height="50">
					<td width="80">
						암&nbsp;&nbsp;호
					</td>
					<td>
						<input type="password" name="b_pwd" size="12" maxlength="12">
					</td>
				</tr>
				<tr height="50">
					<td colspan="2" align="center">
						<input type="button" value="글삭제" onclick="delete_ok()">
						&nbsp;&nbsp;&nbsp;
						<input type="reset" value="다시작성">
						&nbsp;&nbsp;&nbsp;
						<input type="button" value="글목록" onclick="location.href='list.jsp?pageNum=<%= pageNum %>'">
					</td>
				</tr>
			</table>
		</form>
	</center>
</body>
</html>





