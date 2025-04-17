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
<%!
//실습문제-4C-1

public String calDate(){
Calendar cal = Calendar.getInstance();
return cal.get(Calendar.YEAR)+"-"
			+(cal.get(Calendar.MONTH)+2)+"-"
			+cal.get(Calendar.DATE);
}

public String calDate2(){
Calendar cal = Calendar.getInstance();
return cal.get(Calendar.YEAR)+"-"
			+(cal.get(Calendar.MONTH)+2)+"-"
			+cal.get(Calendar.DATE);
}

public String calDate3(){
Calendar cal = Calendar.getInstance();
return cal.get(Calendar.YEAR)+"-"
			+(cal.get(Calendar.MONTH))+"-"
			+(cal.get(Calendar.DATE)-3);
}


	


%>

한달후 날짜 <%=calDate()%>
두달후 날짜 <%=calDate2()%>
3일전 날짜 <%=calDate3()%>


</body>
</html>