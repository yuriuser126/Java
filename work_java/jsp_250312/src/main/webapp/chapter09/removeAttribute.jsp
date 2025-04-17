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
	<center><h3>[세션 값을 삭제하는 예제 removeAttribute]</h3></center>

	
	<%
		String s_name;
		String s_value = "저는 세션이 저장된 첫번째 값이에요. ^o^";
		session.setAttribute("s_name1", s_value);
		
		//저장하려면 setAttribute 사용

		
		s_value = "저는 세션이 저장된 두번째 값이에요. ^o^";
		session.setAttribute("s_name2", s_value);
		
		s_value = "저는 세션이 저장된 세번째 값이에요. ^o^";
		session.setAttribute("s_name3", s_value);
		
		out.print("<hr><h3>--- 세션 값을 삭제하기 전 ---</h3>");
		//몽땅 가지고 오는거
		Enumeration enum_app = session.getAttributeNames();
		int i=0;
		
		//반복문 사용
		
		while(enum_app.hasMoreElements()){
			i++;
			//도는동안 참
			//s_name으로 받아서
			// string으로 next로 출력
			s_name = enum_app.nextElement().toString();
			//값은 캐스팅해서
			s_value = session.getAttribute(s_name).toString();
			
			out.print("<br>얻어온 세션 이름 ["+i+"]"+s_name+"<br>");
			out.print("<br>얻어온 세션 값 ["+i+"]"+s_value+"<br>");
			
		}
		
		//세션 이름이 s_name2인것을 삭제했다.
		session.removeAttribute("s_name2");
		
		out.print("<hr><h3>--- 세션 값을 삭제한 후 ---</h3>");
		//몽땅 가지고 오는거
		enum_app = session.getAttributeNames();
		i=0;
		
		//반복문 사용
		
		while(enum_app.hasMoreElements()){
			i++;
			//도는동안 참
			//s_name으로 받아서
			// string으로 next로 출력
			s_name = enum_app.nextElement().toString();
			//값은 캐스팅해서
			s_value = session.getAttribute(s_name).toString();
			
			out.print("<br>얻어온 세션 이름 ["+i+"]"+s_name+"<br>");
			out.print("<br>얻어온 세션 값 ["+i+"]"+s_value+"<br>");
			
		}
		
		
	%>
	
	<% %>

</body>
</html>