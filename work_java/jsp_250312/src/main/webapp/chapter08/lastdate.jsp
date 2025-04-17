<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
//쿠키 초기값 널, msg 화면 출력하는 아이
//방문여부 기본은 거짓
	Cookie lastDate=null;
	String msg="";//화면 출력 메세지
	boolean found=false;//처음 방문여부
	//----------------------------
	//캐스팅을 해도되고 
	//하나라도 스트링이 있으면 스트링 타입이 되어서 앞에 붙여놓았다.
	//현재  시간정보 를 위한 값-long타입으로 나온다.밀리세컨
	String newValue = "" + System.currentTimeMillis(); 
	//쿠키정보가져오는거 리퀘스트
	// 객체배열로 받는다
	Cookie[] cookies = request.getCookies();
	
	//조건 : cookies가 값이 있으면
	//cookies.length :  쿠키 몇개인지 알려면 length 사용 
	if(cookies != null){
		out.print("@# cookies.length => "+cookies.length);
		//객체배열이니까 반복문 for 사용
		//for int i 로 지정해야 오류안남
		for(int i=0;i<cookies.length;i++){
			//쿠키의 값을 lastDate로 받는다 
			lastDate = cookies[i];	
			
			// lastDate : 인 이름과 같으면 - 조건
			if(lastDate.getName().equals("lastDateCookie")){
				found =true;
				break;
				//찾으면 나가게 break 사용
			}
		}
		//-------------------------------------------
		//if else 들어감
		//방문객 증가b ->처음방문
		//메세지 출력 + 쿠키를 만들어준다
		//------------------------------------------
		//if/else 처음 방문/아닐때 (lastDate 쿠키 객체에 값이 있음)//
		//----------------------------------------
		
		if(!found){
			msg="처음 방문입니다...";
			//처음 방문일때 lastDateCookie 쿠키 이름으로 시간정보를 저장
			//시간정보 위에 있음
			lastDate =  new Cookie("lastDateCookie",newValue);
		//----------------------------------------
			//아래로 123단계 쿠키 만들기 세트 형식 ~~~
			lastDate.setMaxAge(365*24*60*60);
			lastDate.setPath("/");
			response.addCookie(lastDate);
		} 
		//처음 방문이 아님 (lastDate 쿠키 객체에 값이 있음)
		else {
			//calender 사용?
			//밀리세컨드를 날짜로 할때
			//Date - java.util
			//The constructor Date(String) is deprecated : 나중에 없어질 오류
			//-----------------------------
				//			new Date();
//				String conv = lastDate.getValue();
//--------------------------
				//long타입 캐스팅 해줘야한다. 앞뒤로
				//lastDate 쿠키에 있는 시간정보 값을 long변수로 가져옴
				long conv = Long.parseLong( lastDate.getValue()); 
//Date 객체로 의미있는 시간 정보를 출력
				msg="당신의 마지막 방문: "+new Date(conv);
//--------------------------------------
			////다음 방문을 위한 값 설정
			lastDate.setValue(newValue);
			//lastDate쿠키에 setvalue 값설정할건데 newValue:시간 
			//그니까 시간을 새로 설정한다 이말이다.
			response.addCookie(lastDate);
			//마무리 셋트
		}
	}
%>

<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>


<h2><%=  msg %></h2>
<%
//화면에 보이도록 표현식 사용
%>

</body>
</html>