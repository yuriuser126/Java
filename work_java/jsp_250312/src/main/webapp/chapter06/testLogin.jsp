<%@page import="java.net.URLEncoder"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String s_id="hong";
	String s_pw="1234";
	String s_name="홍길동";
	//아이디 비밀번호가 일치하면 mainjsp로 자동이동 
	//자동이동 리드다이렉트 객체 리스폰스
	if(s_id.equals(request.getParameter("id"))
			&& s_pw.equals(request.getParameter("pw")))
	{
		//response.sendRedirect("main.jsp");
		//?-> 값 보내기 변수는 뒤로 보내기. ? 로 연결
				//"main.jsp?name : "main.jsp 로 name 값 넘김
	//	response.sendRedirect("main.jsp?name="+s_name);
		//URLEncoder.encode : 변수에 있는 한글을 인코딩 했다 
		response.sendRedirect("main.jsp?name="+URLEncoder.encode(s_name, "UTF-8"));
		
	} else{
		
		response.sendRedirect("login.html");
	}
%>
<%%>