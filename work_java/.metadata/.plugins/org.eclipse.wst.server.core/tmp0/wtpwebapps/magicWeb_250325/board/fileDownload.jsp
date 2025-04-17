<%@page import="java.io.BufferedOutputStream"%>
<%@page import="java.io.FileInputStream"%>
<%@page import="java.io.BufferedInputStream"%>
<%@page import="java.io.File"%>
<%@page import="magic.board.BoardDBBean"%>
<%@page import="magic.board.BoardBean"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
	//파일번호다
	int bid = Integer.parseInt(request.getParameter("fileN"));
	BoardDBBean db = BoardDBBean.getInstance();
	BoardBean board = db.getFileName(bid);
	
	String fileName="";
	String realFileName="";
	
	//not null 첨부파일이 있으면 뭔갈하겟다
	if(board != null){
		fileName = board.getB_fname();
		realFileName = board.getB_fname();
	}
	
	//실제 업로드 되어있는 경로
 	String saveDirectory =application.getRealPath("/upload");
// 	java.io File

//File.separator : 디렉토리명과 파일명을 연결하는 구분자(운영체제마다 상이할수 있음)
//fileName : 넘버링 처리된 파일명
 	String path =  saveDirectory + File.separator + fileName;

//file : 다운로드 대상 파일이 된다.
	File file= new File(path);
	long length = file.length();
	//jsp 기본 한글처리
	realFileName = new String(realFileName.getBytes("ms949"),	"8859_1");
	
	//response 객체에 필요한 내용을 담아서 전송
	//octet-stream : 기본 Content Type
	response.setCharacterEncoding("application/octet-stream");
	response.setContentLength((int)length);
	//Content-Disposition : 브라우저에 실제 파일명 컨텐츠가 있다고 말함
	response.setHeader("Content-Disposition", "attachment;filename="+realFileName);
	
	//파일 다운로드할때 임시 저장공간을 사용한다.
	BufferedInputStream bis = new  BufferedInputStream(new FileInputStream(file));
	
	//기존파일이 남아있는경우 초기화
	out.clear();
	//다운로드 준비
	out = pageContext.pushBody();
	//다운로드 파일 내보낼때 사용
	BufferedOutputStream bos = new BufferedOutputStream(response.getOutputStream());
	
	
	int data;
	//bis로 읽어서 bos로 쓴다.
	//파일중에 내용을 읽다보면 나오는 -1 > -1을 읽어준다.
	while((data=bis.read()) != -1){
			bos.write(data);
		
	}
	bis.close();
	bos.close();
	
%>