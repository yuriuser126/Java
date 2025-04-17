<%@page import="question.DivAndRemains"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

    <jsp:useBean class="question.DivAndRemains" id="divAndRemains"></jsp:useBean>
    <jsp:setProperty property="num" name="divAndRemains"/>
    
    <h4>당신이 입력한정보입니다</h4>
    
    <!--  useBean 액션 태그에 DivAndRemains 클래스 사용하도록 작성 -->
    <!--  <h4> 태그에 ‘당신이 입력한정보입니다’ 를작성 -->
    <!--   DivAndRemains 클래스의 getter 메소드를 사용하여
     process() 메소드 호출하여 10의 자리와1의 자리의숫자가동일한여부를출력

 출력만 -> 대공사  ...-->
    
   <% 
   

   	out.print("입력된 정수가"+ divAndRemains.getNum() + "은 "
   	+ divAndRemains.process(divAndRemains.getNum()));
	   

   
   %>