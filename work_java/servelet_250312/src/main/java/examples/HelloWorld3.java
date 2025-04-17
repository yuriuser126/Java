package examples;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/HelloWorld3")
public class HelloWorld3 extends HttpServlet {
	private static final long serialVersionUID = 1L;

		protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//			resp.setContentType("text/html");
//			charset=utf-8 : 한글처리
//			resp.setContentType("text/html; charset=utf-8");
//			resp.setContentType("text/html; charset=UTF-8");
//			resp.setContentType("text/html; charset=EUC-KR");
			resp.setContentType("text/html; charset=euc-kr");
			PrintWriter out = resp.getWriter();
			out.println("<html>");
			out.println("<head>");
			out.println("<title>");
			out.println("Hello~");
			out.println("</title>");
			out.println("</head>");
			out.println("<body>");
			out.println("<h1>안녕하세요~!!!</h1>");
			out.println("</body>");
			out.println("</html>");
			
	}


}
