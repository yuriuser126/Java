<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%!
//변수 하나 메소드하나 변수 1증가
	int pageCount=0;
    void addCount(){
	pageCount++;
}
%>

<%
//메소드 호출
	addCount();
%>

<p>이 사이트 방문은
<%=
//새로고침할때마다 카운트 올라가게끔
	pageCount
%>
</p>