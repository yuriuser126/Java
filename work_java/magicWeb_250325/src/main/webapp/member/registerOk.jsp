<%@page import="magic.member.MemberDBBean2"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <jsp:useBean class="magic.member.MemberBean2" id="mb"></jsp:useBean>
    <jsp:setProperty property="*" name="mb"/>
<!-- //객체의 프로퍼티 값으로 저장 -->
<!-- 폼 양식에서 전달되는 파라미터값얻어와서 mb 객체의 프로퍼티값으로 저장 -->
    

<%
    MemberDBBean2 manager = MemberDBBean2.getInstance();
    //getInstance 쓰면 객체를 바로 사용할수 있다.

    //아이디는 넘어온 mb객체에 getter id가져옴

    if(manager.confirmID(mb.getMem_uid())==1){
    %>
			 <script>
			 	alert("중복되는 아이디가 존재합니다.");
			 	history.back();
			 </script>
	 <% 
			//뒤로가기
		}else{
			 int re=manager.insertMember(mb);
			 //re return한다.
			 if(re == 1){
				 //인서트가 제대로 된것이다. insert 정상적으로 실행
		// 		 	alert("중복되는 아이디가 존재합니다.");
		 %>
			 	<script>
				alert("회원가입을 축하드립니다.\n회원으로 로그인 해주세요.");
			 	location.href="login.jsp";
			 </script>
			 <%  
	 }else{
		 //인서트가 제대로 된것이다. insert 정상적으로 실행 안됨
		 %>
				 <script>
					alert("회원가입에 실패했습니다.");
				 	location.href="login.jsp";
				 </script>
			<%  
	 }
	 
}
%>

