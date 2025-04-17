<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
		<center>
			<h4>'구구단 출력하기'</h4>
		</center>


		<jsp:forward page="foward_data.jsp">
			<jsp:param value="5" name="five"/>
		</jsp:forward>
		
	
		

</body>
</html>

<%--
5를들고간다 five이라는 이름으로
		<jsp:param value=Math.pow(5,2) name="five"/>
	5 의 제곱 :<%= Math.pow(5,2) %>

--%>