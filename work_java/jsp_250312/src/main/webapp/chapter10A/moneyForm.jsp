<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

   <jsp:useBean class="question.Money" id="money"></jsp:useBean>
   <jsp:setProperty property="num" name="money"/>
   <!--
   //useBean 액션 태그에 Money 클래스 사용하도록작성
   //Money 클래스의 getter 메소드를 사용하여 process() 메소드 호출하여 환산한 돈을 출력
     -->
   
   <%
   
   
   	out.print("입력된 금액이 "+money.getNum()+"는<br>"
   						+money.process()
   						);
   
   %>