package examples;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/LifeCyle")
public class LifeCyle extends HttpServlet {
	int initCount =1;
	int serviceCount =1;
	int destoryCount =1;
       
	//init ctrl space
	//웹브라우저에서 init 메소드가 첫 실행할때 호출됨
	@Override
	public void init() throws ServletException {
		System.out.println("init 메소드가 첫 실행할때 호출됨  "+initCount++);
	}
	//destory  메소드가 톰캣 종료할때 호출됨
	@Override
	public void destroy() {
		System.out.println("destory 메소드가 톰캣 종료할때 호출됨  "+destoryCount++);
	}
	
	// service 요청 될때마다 호출됨
//	@Override
//	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
//		System.out.println("service 요청 될때마다 호출됨  "+serviceCount++);
//	}
	
	//서비스 메소드가 있으면 호출이 안된다.
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}



}
