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
//	String select="board.jsp";
	String select= request.getParameter("pageChange");
	if(select == null){
		select="ooooooo.jsp";
	}
%>
<%--
		String select22= request.getParameter("pageChange");
		if(select22 == null){
			select22="left.jsp";
		}
--%>
	<table border="1" width="1000" height="700">
	
		<tr>
			<td colspan="2">
				<jsp:include page="top.jsp"></jsp:include>
			</td>
		</tr>
		
		<tr>
			<td width="100" height="500">
				<jsp:include page="left.jsp"></jsp:include>
			</td>
			<td >
			<%-- 
				<jsp:include page="notice.jsp"></jsp:include>
				밑에서 변수를 넘긴다.--%>
				<jsp:include page="<%=select %>"></jsp:include>
			</td>
		</tr>
		
			<tr>
			<td colspan="2">
				<jsp:include page="bottom.jsp"></jsp:include>
			</td>
		</tr>
	</table>
</body>
</html>