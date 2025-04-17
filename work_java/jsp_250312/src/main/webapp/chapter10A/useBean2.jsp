<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<jsp:useBean class="question.GuGuDan" id="guGuDan"></jsp:useBean>

<%--   useBean 액션 태그에 GuGuDan 클래스 사용하도록작성  X --%>
<%--   <h4> 태그에 ‘구구단 출력하기’ 를 작성--%>
<%--   숫자5에대해GuGuDan클래스의process() 메소드 호출하여 구구단 출력--%>


<h4>구구단 출력하기</h4>


<%
	 int num=5;
		for(int i=1; i<10;i++){
			//out.print("구구단 출력하기 " + GuGuDan.process(num));
			//아이디랑 같게해서 출력 !!!!!!!
			// 변수 두개애
			out.print("구구단 출력하기 " + num + "*"+i+"="+guGuDan.process(num,i)+"<br>");
			
		}
%>



