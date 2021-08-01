package member.service;

import java.sql.Connection;
import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import member.dao.MemberDao;
import member.util.ConnectionProvider;
import member.util.JdbcUtil;

public class MemberDeleteCommandImpl implements Command {
	
	public int deleteMember(HttpServletRequest request) {
		int result = 0;
		Connection conn = null;
		MemberDao dao = null;
		
		String code = request.getParameter("memberCode");
		
		try {
			conn = ConnectionProvider.getConnection();
			dao = MemberDao.getInstance();
			
			result = dao.delMember(conn,code);
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
				JdbcUtil.close(conn);
		}
		return result;
	}

	@Override
	public String getPage(HttpServletRequest request, HttpServletResponse response) {
		request.setAttribute("result", deleteMember(request));
		
		return "/WEB-INF/views/deleteMember.jsp";
	}

}
