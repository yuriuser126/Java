<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>


<jsp:useBean class="area.Circle2" id="circle"></jsp:useBean>

<!--  property html에 있는 이름 radius 객체는 위에 circle--> 
<jsp:setProperty property="radius" name="circle"/>

<%--    useBean 액션 태그에 Circle2 클래스 사용하도록작성 O --%>
<%--   <h4> 태그에 ‘당신이 입력한정보입니다’ 를작성--%>
<%--   Circle2 클래스의 getter 메소드를 사용하여 process() 메소드 호출하여 원의 면적을 출력--%>

<h4>당신이 입력한정보입니다</h4>


<%
	out.print("반지름이 "+circle.getRadius()+"인 원의 면적은 "
		+circle.process(circle.getRadius()));

	
%>