<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>


<%
	Cookie[] cookies = request.getCookies();
//setMaxAge(0); -> 기간 0 삭제

//	cookies[i].setMaxAge(0);
		//cookies[i].setPath("/");
		//세개가 세트다 삭제
		//response.addCookie(cookies[i]);
	for(int i= 0; i<cookies.length; i++){
		out.print(i+"번째 쿠키의 이름=>"+cookies[i].getName()+" 삭제<br>");
		cookies[i].setMaxAge(0);
		cookies[i].setPath("/");
		//삭제 정보를 추가
		response.addCookie(cookies[i]);
	}
%>