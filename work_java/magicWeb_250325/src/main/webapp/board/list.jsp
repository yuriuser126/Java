<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.sql.Timestamp"%>
<%@page import="magic.board.BoardBean"%>
<%@page import="java.util.ArrayList"%>
<%@page import="magic.board.BoardDBBean"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    
request.setCharacterEncoding("UTF-8");
%>
<!-- 한글처리 -->
<%
// 페이지번호들고다닐거다
	String pageNum =	request.getParameter("pageNum");

	if(pageNum == null){
		pageNum = "1";
	}

	BoardDBBean db = BoardDBBean.getInstance();
//	호출된 메소드의 반환 타입으로 받아주면 됨
// 	ArrayList<BoardBean> boardList = db.listBoard();
//위에 파라미터 넣지 않아서 오류남
	ArrayList<BoardBean> boardList = db.listBoard(pageNum);
	int b_id=0, b_hit=0 , b_level=0, b_fsize=0;
	String b_name,b_email,b_title,b_content;
	Timestamp b_date;
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
%>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<center>
		<h1>게시판에 등록된 글 목록 보기</h1>
		<table width="600">
			<tr>
				<td align="right">
<!-- 				글쓰기 취소할수도 있으니까 -->
					<a href="write.jsp?pageNum=<%= pageNum %>">글 쓰 기</a>
				</td>
			</tr>
		</table>
	</center>
	<center>
		<table border="1" width="800" cellspacing="0">
			<tr height="25">
				<td width="40" align="center">번호</td>
				<td width="80" align="center">첨부파일</td>
				<td width="450" align="center">글제목</td>
				<td width="120" align="center">작성자</td>
				<td width="130" align="center">작성일</td>
				<td width="60" align="center">조회수</td>
			</tr>
			<%
// 			보드사이즈 크기만큼 가지고온다????
// 			boardList 에 있는 오라클 데이터를 가져옴
				for(int i=0; i<boardList.size(); i++){
//	 				ArrayList 데이터의 BoardBean 객체를 가져온다.
					BoardBean board = boardList.get(i);
//	 				board 객체에 있는 컬럼의 데이터를 가져온다.
					b_id = board.getB_id();
					b_name = board.getB_name();
					b_email = board.getB_email();
					b_title = board.getB_title();
					b_content = board.getB_content();
					b_date = board.getB_date();
					b_hit = board.getB_hit();
					b_level = board.getB_level();
					b_fsize = board.getB_fsize();
					//가지고와서 화면에 출력한다.
					//마우스를 올렸을때 색 바뀌는거
			%>
			<tr bgcolor="#f7f7f7" 
				onmouseover="this.style.backgroundColor='#eeeeef'"
				onmouseout="this.style.backgroundColor='#f7f7f7'">
				<!-- 			표현식으로 컬럼의 데이터를 출력 -->
				<td align="center"><%= b_id %></td>
				<td>
<!-- 				0보다 큰경우만 표시를 하겠다 그림표시 -->
					<%
						if(b_fsize >0 ){
								%>
									<img src="./images/zip.gif" >
								<% 
						}
					%>
				</td>
				<td>
<!-- 		글번호를 가지고 글내용 보기 페이지로 이동 -->
					 <% 
					 if(b_level > 0){//답변글
						 for(int j=0; j<b_level;j++){//for 기준으로 들여쓰기를 얼마만큼 할것인지 정함
							 %>
								&nbsp;
							 <% 
						 }
// 					 들여쓰기가 적용된 시점 -> 이미지추가
					 %>
					 <img src ="./images/AnswerLine.gif" width="16" height="16">
					 <% 
					 }
					 %>
<%-- 						jsp?b_id=<%= b_id %>&pageNum ?다음은 엔퍼센트& --%>
					<a href="show.jsp?b_id=<%= b_id %>&pageNum=<%= pageNum %>">
						<%= b_title %>
					</a>
				</td>
				<td align="center">
					<a href="mailto:<%= b_email %>">
						<%= b_name %>
					</a>
				</td>
				<td align="center">
				<%--
					<%= b_date %>
					 --%>
					<%= sdf.format(b_date) %>
				</td>
				<td align="center">
					<%= b_hit %>
				</td>
			</tr>
			<%
				}
			%>
		</table>
<!-- 		페이지 넘버 리밋은 4로 출력 -->
		<%= BoardBean.pageNumber(4) %>
	</center>
</body>
</html>












