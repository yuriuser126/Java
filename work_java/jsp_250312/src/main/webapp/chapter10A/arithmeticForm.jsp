<%@page import="question.Arithmetic"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 
 
 <jsp:useBean class="question.Arithmetic" id="arithmetic"></jsp:useBean>
 <%-- <jsp:setProperty property="a" name="arithmetic1"/>
 <jsp:setProperty property="op" name="arithmetic2"/>
 <jsp:setProperty property="b" name="arithmetic3"/>--%>
 
 <jsp:setProperty property="*" name="arithmetic"/>
    
    <h4>당신이 입력한정보입니다</h4>
    
<!--  useBean 액션 태그에 Arithmetic 클래스 사용하도록 작성
 <h4> 태그에 ‘당신이 입력한정보입니다’ 를작성
 Arithmetic 클래스의 getter 메소드를 사용하여 process() 메소드 호출하여 계산식을 출력

 출력만 -> 대공사  ...-->
    
    <% 
    
    out.print(arithmetic.getA() +"와"
    	+arithmetic.getB() +"의 계산결과는"
    	+ arithmetic.process(arithmetic.getA(), arithmetic.getOp(), arithmetic.getB()));
    
    %>