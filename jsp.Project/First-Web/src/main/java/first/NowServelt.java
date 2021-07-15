package first;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/now2")
public class NowServelt extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		System.out.println("get 요청");
		
		resp.setContentType("text/html; charset=utf-8");
		
		PrintWriter writer = resp.getWriter();
		writer.println("<html>");
		writer.println("<head><title>NowServelt</title></head>");
		writer.println("<body>");
		writer.println("<h1>"+new Date()+"</h1>");
		writer.println("</body>");
		
		writer.close();
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) {
		System.out.println("post로 요청");
	}
}
