<%@page import="magic.member.MemberBean"%>
<%@page import="magic.member.MemberDBBean"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <jsp:useBean class="magic.member.MemberBean" id="member"></jsp:useBean>
    <jsp:setProperty property="*" name="member"/>

    
    <%
//     회원정보를 가지고가서 업데이트(화면에서 넘어옴) ->  이걸로 코드
//---------------------------------------
// where절에있던 회원아이디를 가지고가서 회원정보를 가져옴 - 한명씩
//아이디는 세션에 담아두었다. - 보류
//------------------------------------

		String uid = (String)session.getAttribute("uid");
		member.setMem_uid(uid);

    	MemberDBBean manager = MemberDBBean.getInstance();
		int  re = manager.updateMember(member);
    	
    if(re == 1) {
    	%>
		<script>alert("입력하신대로 회원 정보가 수정되었습니다.");    
		location.href="main.jsp";	
		</script>
    	<%
    } else{
    	%>
		<script>
		alert("수정이 실패되었습니다.");
		history.go(-1);
		</script>    	
    	<%
    }
    %>