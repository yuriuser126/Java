<%@page import="java.util.Calendar"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<% 
//실습 복습 문제 h01+i01.jsp - 5A-1

 
Calendar cal = Calendar.getInstance();
out.print(cal.get(Calendar.YEAR)+"-"
				+(cal.get(Calendar.MONTH)+1)+"-"
				+(cal.get(Calendar.DATE)+1));


 %>
 

 
 <%@ include file="h01.jsp" %>
 
 <%--  
 
 지시자

 액션태그
  <jsp:include page="h01.jsp"></jsp:include>
 
  --%>

</body>
</html>