package member.command;

import java.sql.Connection;
import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import member.dao.MemberDao;
import member.util.ConnectionProvider;
import member.util.JdbcUtil;

public class MemberListCommandImpl implements Command {

	public void getList(HttpServletRequest request) {
		Connection conn = null;
		MemberDao dao = MemberDao.getInstance();

		try {
			// jdbcUrl
			conn = ConnectionProvider.getConnection();

			// 6. 결과 데이터 request 의 속성에 저장 -> 데이터 공유(전달)
			request.setAttribute("result", dao.selectList(conn));

		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JdbcUtil.close(conn);
		}

	}

	@Override
	public String getPage(HttpServletRequest request, HttpServletResponse response) {
		getList(request);
		return "/WEB-INF/views/list_view.jsp";
	}

}
