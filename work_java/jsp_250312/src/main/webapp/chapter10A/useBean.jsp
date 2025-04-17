<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%--<jsp:useBean class="Circle" id="circle"></jsp:useBean> --%>
<jsp:useBean class="area.Circle" id="circle"></jsp:useBean>

<%--   useBean 액션 태그에 Circle 클래스 사용하도록 작성  X --%>
<%--   <h4> 태그에 ‘원의 면적출력하기’ 를 작성   O --%>
<%--   숫자10에대해Circle 클래스의process() 메소드 호출하여 원의 면적 출력  X --%>


<h4>원의 면적 출력하기</h4>


<%
	 int num=10;
	out.print("반지름이 10인 원의 면적은 " + circle.process(num));
%>



<%--   반지름이 10인 원의 면적은 X --%>