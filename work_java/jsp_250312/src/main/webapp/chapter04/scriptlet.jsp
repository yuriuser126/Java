<%@page import="java.util.Date"%>
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
			//java.util.Date now = new java.util.Date(); 
			Date now = new Date(); 
			out.print("Today : "+now);
	%>

<%-- 임포트 안하면 오류난다. --%>


<%--
	<%= String date = new Date() %>

		<%=out.print(date) %>

 --%>>



</body>
</html>