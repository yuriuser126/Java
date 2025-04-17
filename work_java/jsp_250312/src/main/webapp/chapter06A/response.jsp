<%@page import="java.util.Calendar"%>
<%@page import="java.util.Date"%>
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
			response.setIntHeader("Refresh", 5);
			Calendar calendar = Calendar.getInstance();
			int hour = calendar.get(Calendar.HOUR_OF_DAY);
			int minute = calendar.get(Calendar.MINUTE);
			int second = calendar.get(Calendar.SECOND);
			//Calendar calendar = Calendar.getInstance();
			
			String am_pm;
			
			
//			if(calender.get(Calender.AM_PM)==0){
			if(calendar.get(Calendar.AM_PM)==0){
				//0일떄 오전
				am_pm="AM";
			}else {
				am_pm="PM";
				
			}
			
			String CT = hour+":"+minute+":"+second+am_pm;
			out.print("현재 시간은"+CT+"<br>");
		%>
		
		<a href="response_data.jsp">Google 홈페이지로 이동하기</a>
		

		

</body>
</html>

<%--
<p>현재 시간은 <%=Calendar.getInstance().getTime() %></p>

				<jsp:include page="response_data.jsp"></jsp:include>
--%>