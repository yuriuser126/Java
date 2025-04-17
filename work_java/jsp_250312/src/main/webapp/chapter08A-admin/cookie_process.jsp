<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%-- getparameter 파라미터 값 받음 --%>
<%-- 아이디 비밀번호 인증되면 userid의 쿠키값으로 설정 
........아직 애매합니다.???????????--%>
<%-- sendReadirect 이용해서 welcome .jsp 파일 이동--%>

<%
//파라미터값 받기
	String c_id = request.getParameter("id"); 
	 String c_pw = request.getParameter("passwd"); 

//비교 합니다.
//if문에서 아이디값 비밀번호값을 직접입력 같으면 실행
if(c_id.equals("admin")
		&& c_pw.equals("admin1234"))
{
	Cookie cookie_id = new Cookie("userID",c_id);
	//1년동안 쿠키 사용
	//2단계 : 쿠키 속성 설정
	cookie_id.setMaxAge(365*24*60*60);
	cookie_id.setPath("/");
	response.addCookie(cookie_id);
	//3단계 : 쿠키 추가
	
	//쿠키 만들고 이동됨
	response.sendRedirect("welcome.jsp");

} else{
	//아이디 비밀번호 틀리면 메세지 추가
	out.print("아이디와 비밀번호를 확인해주세요.");
}
%>





</body>
</html>




