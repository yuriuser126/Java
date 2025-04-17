<%@page import="java.util.Enumeration"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<center>[세션 값을 얻어오는 예제 get Attribute -2]</center>
	<hr>getattributeNames() 메소드를 사용하여 세션값을 얻어오는 예제입니다.
	<hr>
	
	<%
		String str_validate="현재 페이지는 물론 이전 페이지에서 설정된 세션값들도 나타납니다.";
		session.setAttribute("Validate", str_validate);
		String str_name;
		String str_value;
		//앞에 두개가 살아있으면 세개가 된다.
		//enumuration : 열거형
		Enumeration enum_app= session.getAttributeNames();
		int i=0;
		
		//열거형 써서 반복문

			//hasMoreElements : 열거형 객체가 있으면 참
		
		while(enum_app.hasMoreElements()){
			i++;
			//리턴타입 오브젝트
			//Object를 String으로 변환
			//nextElement apthem : 열거형 값을 가져온다.
			str_name = enum_app.nextElement().toString();
			//리턴타입 오브젝트
			//getAttribute 메소드 : 세션이름으로 값을 가져옴
			str_value = session.getAttribute(str_name).toString();
			
			out.print("<br>얻어온 세션 이름 ["+i+"]"+str_name+"<br>");
			out.print("<br>얻어온 세션 값 ["+i+"]"+str_value+"<br>");
			
			
		}
	%>
	
	<% %>

</body>
</html>