<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<center>[세션 값을 얻어오는 예제 get Attribute]</center>
	<hr>얻어온 세션값은 다음과 같습니다.
	<hr>
	
	<%
	//session은 내장 객체이다.
	//Objcet로 받는다 : 타입
	//getAttribute 메소드는 세션이름으로 값을 가져온다 ~
	
		Object obj_getdata = session.getAttribute("Testing");
	
	//String 타입으로 다운캐스팅
		String str_getdata = (String)obj_getdata;
	
	//강제변환해도됨
	//parsint이것도 됨 - 요게좀더 서버속도는 좋은듯?
	//auto unboxing
	//Object타입을 int타입 변수로 받음
		int int_primitive = (Integer)session.getAttribute("Mydata");
	//Mydata : set설정에서 이름 같아야 한다.
	
	out.print("설정된 세션값[1]=> "+str_getdata+"<br><br>");
	out.print("설정된 세션값[2]=> "+int_primitive+"<br><br>");
	
	%>
	
	<% %>

</body>
</html>