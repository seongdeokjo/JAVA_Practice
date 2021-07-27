package member.util;

import java.util.StringTokenizer;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class JDBCListener implements ServletContextListener {

	@Override
	public void contextInitialized(ServletContextEvent sce) {
		System.out.println("리스너 테스트");
		try {
			ServletContext context = sce.getServletContext();
			String drivers = context.getInitParameter("jdbcdriver");
			
			StringTokenizer tokenizer = new StringTokenizer(drivers, ",");
			while(tokenizer.hasMoreTokens()) {
				String jdbcDriver = tokenizer.nextToken();
				
				Class.forName(jdbcDriver);
				System.out.println("드라이버 로드 테스트 성공");
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public void contextDestroyed(ServletContextEvent arg0) {

	}

}
