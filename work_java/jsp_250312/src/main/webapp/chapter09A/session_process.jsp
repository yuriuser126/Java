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
		// request 객체의 getParameter() 를 이용하여 전송된 요청 파라미터 값을받음
		//아이디와비밀번호가인증되면아이디값을세션명userID의세션값으로설정
		//  response 객체의 sendRedirect() 를 이용하여 welcome.jsp 파일로 이동





	String c_id = request.getParameter("id"); 
	 String c_pw = request.getParameter("passwd"); 

	 if(c_id.equals("admin")
		&& c_pw.equals("admin1234"))
{
		 String s_name;
			session.setAttribute("userID", c_id);
			response.sendRedirect("welcome.jsp");
	


} else{

	out.print("아이디와 비밀번호를 확인해주세요.");
}



%>

</body>
</html>