package member.service;

import java.sql.Connection;
import java.sql.SQLException;

import member.dao.MemberDao;
import member.domain.Member;
import member.domain.MemberRequest;
import member.util.ConnectionProvider;
import member.util.JdbcUtil;

public class InsertMemberService {
	
	private InsertMemberService() {}
	private static InsertMemberService service = new InsertMemberService();
	public static InsertMemberService getInstance() {
		return service;
	}
	
	public int addMember(MemberRequest memberRequest) {
		int result = 0;
		Connection conn = null;
		MemberDao dao = null;
		try {
			conn = ConnectionProvider.getConnection();
			dao = MemberDao.getInstance();
			conn.setAutoCommit(false);
			
			Member member = memberRequest.toMember();
			
			result = dao.insertMember(conn, member);
			
			conn.commit();
		} catch (SQLException e) {
			JdbcUtil.rollback(conn);
			e.printStackTrace();
			
		}finally {
			JdbcUtil.close(conn);
		}
		return result;
	}
}