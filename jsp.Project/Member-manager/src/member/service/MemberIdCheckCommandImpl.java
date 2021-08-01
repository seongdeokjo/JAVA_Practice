package member.service;

import java.sql.Connection;
import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import member.dao.MemberDao;
import member.util.ConnectionProvider;

public class MemberIdCheckCommandImpl implements Command {
	String result;
	
	public String idCheck(HttpServletRequest request) {
		//String result = "N";
		String memberId = request.getParameter("mid");
		
		
		int cnt = 0;
		
		Connection conn = null;
		MemberDao dao = null;
		
		try {
			conn = ConnectionProvider.getConnection();
			dao = MemberDao.getInstance();
			
			 cnt = dao.selectByLogin(conn, memberId);
			
			result = cnt > 0 ? "N" : "Y" ;
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		return result;
	}
	
	
	
	@Override
	public String getPage(HttpServletRequest request, HttpServletResponse response) {
		idCheck(request);
		request.setAttribute("result",result);
		return "/WEB-INF/views/idcheck.jsp";
	}

}
