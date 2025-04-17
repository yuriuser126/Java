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

오류 뭔지 모르겟다아아--%>

<%!


public String calDate(){
Calendar cal = Calendar.getInstance();
return cal.get(Calendar.YEAR)+"-"
			+(cal.get(Calendar.MONTH)+2)+"-"
			+cal.get(Calendar.DATE);
}

	


%>

한달후 날짜 <%=calDate()%>



		<%--
		
		
		
			 public String calDate(){
		Calendar cal = Calendar.getInstance();
		//날짜의 옆에 +1
		cal.add(Calendar.MONTH, 1); 
		
		int year = calendar.get(Calendar.YEAR);
		int month = calendar.get(Calendar.DAY_OF_MONTH);
		int days = calendar.get(Calendar.DATE);
		
		return year+"-"+month+"-"+days;
		}
		
			response.setIntHeader("Refresh", 5);
			Calendar calendar = Calendar.getInstance();
			int year = calendar.get(Calendar.YEAR);
			int month = calendar.get(Calendar.DAY_OF_MONTH);
			int day = calendar.get(Calendar.DATE);
			int hour = calendar.get(Calendar.HOUR_OF_DAY);
			int minute = calendar.get(Calendar.MINUTE);
			int second = calendar.get(Calendar.SECOND);
			//Calendar calendar = Calendar.getInstance();
			

			
			
//	
			String CT =year+"/"+(month+1)+"/"+(day);
			out.print("내일 날짜는"+CT+"<br>");
		--%>
</body>
</html>