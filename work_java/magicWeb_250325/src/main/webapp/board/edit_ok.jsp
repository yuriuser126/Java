<%@page import="com.jspsmart.upload.File"%>
<%@page import="com.jspsmart.upload.SmartUpload"%>
<%@page import="magic.board.BoardDBBean"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
request.setCharacterEncoding("UTF-8");
%>
<jsp:useBean class="magic.board.BoardBean" id="board"></jsp:useBean>
<jsp:setProperty property="*" name="board"/>
<!-- 한글처리 -->


<%
//파일 업로드 처리
	SmartUpload upload = new SmartUpload();
//	업로드할 파일이 있으면 비움
	upload.initialize(pageContext);
//	업로드 준비
	upload.upload();
	String fName="";
	int fileSize=0;
	
	File file = upload.getFiles().getFile(0);

	
	if(!file.isMissing()){
		fName = file.getFileName();
		file.saveAs("/upload/"+file.getFileName());
		fileSize = file.getSize();
	}
%>

<%
//파일업로드 처리
// 	파일 업로드 처리
	board.setB_name(upload.getRequest().getParameter("b_name"));
	board.setB_email(upload.getRequest().getParameter("b_email"));
	board.setB_title(upload.getRequest().getParameter("b_title"));
	board.setB_content(upload.getRequest().getParameter("b_content"));
	board.setB_pwd(upload.getRequest().getParameter("b_pwd"));

	
	
	board.setB_fname(fName);
	board.setB_fsize(fileSize);
	//파일업로디ㅡ 여기까지

String pageNum =	request.getParameter("pageNum");

	int b_id = Integer.parseInt(request.getParameter("b_id"));
//	String b_pwd = request.getParameter("b_pwd");
// java에서 리퀘스트해서 메소드에있는거 호출
	
	BoardDBBean db = BoardDBBean.getInstance();
	//int re = db.deleteBoard(b_id, b_pwd);
	int re = db.editBoard(board);

	if(re == 1){//글목록이동
		//비밀번호 일치로 글목록 이동
// 		response.sendRedirect("list.jsp");
		response.sendRedirect("list.jsp?pageNum="+pageNum);
	}else if(re == 0){
		//비밀번호 틀림
%>
		<script>
			alert("비밀번호가 맞지 않습니다.");
			history.go(-1);
		</script>
<%
	}else if(re == -1){
		//수정 실패
%>
		<script>
			alert("수정에 실패하였습니다.");
			history.go(-1);
		</script>
<%
	}
%>






