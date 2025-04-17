<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>


<jsp:useBean class="question.Asterisk" id="asterRisk"></jsp:useBean>
<jsp:setProperty property="num" name="asterRisk"/>




<%

out.print("입력된 정수가"+asterRisk.getNum()+"는 <br>"
				+asterRisk.process()
				);

%>