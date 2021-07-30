package member.controller;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import member.command.Command;
import member.command.InvaildCommandImpl;

public class FrontController extends HttpServlet {
	private Map<String,Command> commands = new HashMap<String,Command>();
	
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProcess(request, response);
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProcess(request, response);
	}
	
	private void doProcess(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String commandUri = request.getRequestURI();
		
		if(commandUri.indexOf(request.getContextPath()) == 0) {
			commandUri = commandUri.substring(request.getContextPath().length());
		}
		
		String viewPage = "/index.jsp";
		Command command = null;
		
		command = commands.get(commandUri);
		if(command == null) {
			command = new InvaildCommandImpl();
		}
		viewPage = command.getPage(request,response);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher(viewPage);
		dispatcher.forward(request, response);
	}

	@Override
	public void init(ServletConfig config) throws ServletException {
		// 설정 파일의 경로 가져오기
		String configFile = config.getInitParameter("config");
		
		Properties prop = new Properties();
		FileInputStream fis = null;
		
		// 설정 파일의 시스템 경로 가져오기
		String configPath = config.getServletContext().getRealPath(configFile);
		
		try {
			fis = new FileInputStream(configPath);
			prop.load(fis);
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		Iterator<Object> itr = prop.keySet().iterator();
		
		while(itr.hasNext()) {
			String command = (String)itr.next();
			String commandClassName = prop.getProperty(command);
			
			//클래스 이름으로 해당 클래스의 인스턴스 생성
			try {
				Class commandClass = Class.forName(commandClassName);
				Command commandObj = (Command)commandClass.newInstance();
				
				commands.put(command, commandObj);
				
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} catch (InstantiationException e) {
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				e.printStackTrace();
			}
			
		}
	}
}