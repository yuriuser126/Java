<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%-- 로그아웃을 클릭하면 설정된 쿠키 삭제--%>

<% 

//String c_id="admin";
//String c_pw="admin1234";
//---------------------------------------
	//객체배열로 만든다.
			Cookie[] cookies = request.getCookies();
		
				for(int i= 0; i<cookies.length; i++){
					if(cookies[i].getName().equals("userID")){
						%>
						<h4> <%= cookies[i].getValue()  %>님 반갑습니다.</h4>
						<% 
					}
				}
				//바깥에서 설정
				%>
				
			
				<a href="cookie_out.jsp">로그아웃</a>

</body>
</html>