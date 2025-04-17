<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%!
//복습 4A-1
int a =337;  %>

<%!
	public int getInt(){
		return a;
		}

%>
<%out.print(getInt());%>

</body>
</html>