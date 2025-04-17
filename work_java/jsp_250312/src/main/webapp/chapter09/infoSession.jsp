<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<center>[세션 값을 얻어오는 예제 infoSession]</center>
	<hr>

	
	<%
		//getId() = 세션 고유의 id를 가져온다
		String str_id = session.getId();
		//getLastAccessedTime() : 클라이언트로 마지막으로 요청 보낸 시간을 long형태로 반환(밀리세컨드)
		long last_time = session.getLastAccessedTime();
		//getCreationTime() : 세션이 만들어진 시간(밀리세컨드)
		long  create_time = session.getCreationTime();
		
		//머문시간 분단위
		//웹사이트에 머문시간(분)
		long time_used = (last_time - create_time ) / 60000;
		
		//머문시간 초단위
		//웹사이트에 머문시간(초)
		//getMaxInactiveInterval() : 세션 유지시간(기본은30분) -> 초단위
		int inactive = session.getMaxInactiveInterval() / 60;
		
		//처음 생성 되었으면true 이전에 생성되었으면 false 반환
		boolean b_new= session.isNew();
		
		//아래는 표현식으로 표현했다.
	%>
	
	[1]세션 ID는 [<%=str_id %>]입니다.<br><hr>
	[2]웹사이트에 머문시간은 [<%=time_used %>]분입니다.<br><hr>
	[3]세션 유효시간은 [<%=inactive %>]분입니다.<br><hr>
	[4]세션이 새로 만들어졌나요?  <br>
	
	<%
		if(b_new){
			out.print("예!! 새로운 세션을 만들었습니다.");
		} else{
			out.print("아니오!! 새로운 세션을 만들지 않았습니다.");
			
		}
	%>

</body>
</html>