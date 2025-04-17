<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

    
    <jsp:useBean class="question.TwoArray" id="twoArray"></jsp:useBean>
    <jsp:setProperty property="num" name="twoArray"/>
    
    <%
    out.print( twoArray.getNum()+"*"+twoArray.getNum()+ "는 <br>"
    		+twoArray.process()
    		);
    
    %>