<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<p></p>
	<center><h3>[표현식(expression)에 관한 예제]</h3></center>
	<hr>
	<%!
		 String str = "안녕하세요!";
	int a= 5, b=-5;
		
	//최대값 구하는거
		public int abs(int n)
		{
			if(n<0){
				n=-n;
			}
			return n;
		}
	
	%>
	<%= str  %>
	<br>
	<%= a  %> 의 절대값은 => <%= abs(a) %>
	<br>
	<%= b  %>의 절대값은 => <%= abs(b) %>
	
	<%--
	out.print(str+"<br>");
	out.print(a+"의 절대값은 =>"+abs(a)+"<br>");
	out.print(b+"의 절대값은 =>"+abs(b)+"<br>");
	--%>
</body>
</html>