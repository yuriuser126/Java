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
<%-- expr01.jsp -4A-2 실습문제 
Calendar calendar = Calendar.getInstance(); 

오류 뭔지 모르겟다
public String 에서 자꾸 오류가 난다
--%>

<%!

	
	 //public String calDate(){
	public String calDate(){
		
	
		Calendar cal = Calendar.getInstance();
		//날짜의 옆에 +1
		cal.add(Calendar.DATE, 1); 
		
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.DAY_OF_MONTH);
		int days = cal.get(Calendar.DATE);
		
		return year+"-"+month+"-"+days;
		}
		

%>

내일 <%=calDate()%>



		<%--
			response.setIntHeader("Refresh", 5);
			Calendar calendar = Calendar.getInstance();
			int year = calendar.get(Calendar.YEAR);
			int month = calendar.get(Calendar.DAY_OF_MONTH);
			int day = calendar.get(Calendar.DATE);
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
			
			String CT =year+"/"+month+"/"+(day+1) + hour+":"+minute+":"+second+am_pm;
			out.print("내일 날짜는"+CT+"<br>");
		--%>
</body>
</html>