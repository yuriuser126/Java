<%@page import="magic.member.MemberBean"%>
<%@page import="magic.member.MemberDBBean"%>
<%@page import="magic.member.MemberDBBean2"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
//로그인 페이지에 name 해주어서 request로 불렀다.
	String id = request.getParameter("mem_uid");
	String pwd = request.getParameter("mem_pwd");

	MemberDBBean manager = MemberDBBean.getInstance();
	int check =  manager.userCheck(id, pwd);
	MemberBean mb = manager.getMember(id);
	
	if (mb == null) {//회원이 없다.
		%>
			<script>
				alert("존재하지 않는 회원");
				history.go(-1);
			</script>
		<%
	} else {//회원 있다.
// 		name 을 이름으로 받겠다
		 String name=mb.getMem_name();
		 //check 를 사용
		 //초기값 -1, 비밀번호가 일치하면 1 불일치하면 0
		if (check ==1) {
			//세션에 사용자 정보추가
			session.setAttribute("uid", id); //회원아이디			
			session.setAttribute("name", name); //회원이름		
			
			session.setAttribute("Member", "yes"); //회원여부
					//Member를 사용한다. 멤버가 아닌사람은 들어가지 못하도록
			
			
			//메인으로 보낸다. 응답한다.
			response.sendRedirect("main.jsp");
		
		} else if(check == 0) {//비밀번호가 맞지 않다.
			%>
			<script>
				alert("비밀번호가 맞지 않습니다.");
				history.go(-1);
			</script>
		<%
		}
		 
		else {//아이디가 불일치다.(로직상 경우에 맞지않음)>타질않는다.
			%>
				<script>
					alert("아이디가 맞지 않습니다.");
					history.go(-1);
// 					location.href="login.jsp";
				</script>
			<%
		}
	}
%>
