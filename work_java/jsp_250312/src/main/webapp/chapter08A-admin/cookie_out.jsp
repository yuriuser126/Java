<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%-- 설정된 모든 쿠키 명 해제 - 삭제가 맞다--%>
<%-- sendRedirect 이용 cookie.jsp 이동--%>
<% 

Cookie[] cookies = request.getCookies();
		//setMaxAge(0); -> 기간 0 삭제
		//cookies[i].setMaxAge(0);
		//cookies[i].setPath("/");
		//세개가 세트다 삭제
	for(int i= 0; i<cookies.length; i++){
		cookies[i].setMaxAge(0);
		cookies[i].setPath("/");
		//삭제 정보를 추가
		response.addCookie(cookies[i]);
		//마무리 cookies[i] cookies 객체
	}
//자동 이동시킨다.
	response.sendRedirect("cookie.jsp");

%>



</body>
</html>