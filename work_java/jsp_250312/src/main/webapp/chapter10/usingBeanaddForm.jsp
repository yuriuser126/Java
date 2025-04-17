<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <!-- Me 치고 ctrl+space 하면 member.MemberBean class에 바로 생성된다  -->
    <!-- jsp 액션태그로 use bean 객체 생성했다.  -->
    <!-- java랑 html 연결할거다.
    -------------------------------------------- -->
    
<jsp:useBean class="member.MemberBean" id="memBean" ></jsp:useBean>


<!----------------------------------------------  
property="id" : 넘어오는  name="id" 를 받아주고  jsp:setProperty 할때 setter로 지정 -->
<!--  넘어오는id 값을 무시하고 value="azaz"적용 
----------------------------------
property="*" : 한번에 매핑 적용하려면 넘어오는 name 과 빈에 프로퍼티가 동일해야함
빈 = 프로퍼티=클래스이름
------------------------------
-->


<jsp:setProperty property="*" name="memBean"/>



<%-- 
<jsp:setProperty property="id" name="memBean"/>
<jsp:setProperty property="name" name="memBean"/>
<jsp:setProperty property="id" name="memBean" value="azaz"/>
<jsp:setProperty property="id2" name="memBean"/>--%>

<!-- id2 setter를 못찾아서 오류 -->
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	당신이 입력한 정보입니다.
	<hr>
	아 이 디 :
	<!-- getter로 동작 이름은 아이디 객체는 memBean -->
	
	<jsp:getProperty property="id" name="memBean"/>
	<br>이름 :
	<jsp:getProperty property="name" name="memBean"/>
	<br>회원구분 :
		<%
			if(memBean.getMclass() ==1 ){
				out.print("일반회원");
			}else {
				out.print("교수님");
			}
		%>	
	<br>전화번호 :
	<jsp:getProperty property="phone1" name="memBean"/>-
	<jsp:getProperty property="phone2" name="memBean"/>-
	<jsp:getProperty property="phone3" name="memBean"/>
	


</body>
</html>