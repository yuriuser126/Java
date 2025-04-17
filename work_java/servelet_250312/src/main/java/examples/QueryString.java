package examples;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/QueryString")
public class QueryString extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		doget만 사용
		response.setContentType("text/html;  charset=utf-8");
		PrintWriter out = response.getWriter();
		String id="", name="", vclass="", phone1="", phone2="", phone3="";
		//원하는곳에 id를 사용할수 있게한다
		//html에 넘어온 값을 받은거다.
		id = request.getParameter("id");
		name = request.getParameter("name");
		vclass = request.getParameter("class");
		phone1 = request.getParameter("phone1");
		phone2 = request.getParameter("phone2");
		phone3 = request.getParameter("phone3");
		
		//out쪽 화면쪽
		//변수를 이용해서 아래태그에 값들 배치
		//</b> : 강조
		out.println("<html>");
		out.println("<head>");
		out.println("</head>");
		out.println("<body>");
		out.println("당신이 입력한 정보(get방식) 입니다. <br> 아이디 : <b>");
		out.println(id);
		out.println("</b>이름 : <b>");
		out.println(name);
		out.println("</b>구분 : <b>");
		out.println(vclass);
		out.println("</b>전화번호 : ");
		out.println(phone1);
		out.println("-");
		out.println(phone2);
		out.println("-");
		out.println(phone3);
		out.println("</body>");
		out.println("</html>");
		
	}


}
