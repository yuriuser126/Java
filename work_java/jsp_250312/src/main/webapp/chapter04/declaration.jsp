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
	 String str = "Hello, Java Server Pages";
//메서드 만들었다.
	public String getString(){
		return str;
	}
%>
<%
	out.print(getString());
%>
	<%--
	
	String getString(String data){
		return data;
	}

	--%>
	<%--
	out.print(getString("Hello, Java Server Pages"));
	--%>
</body>
</html>