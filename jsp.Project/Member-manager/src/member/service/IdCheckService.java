package member.service;

import java.sql.Connection;
import java.sql.SQLException;

import member.dao.MemberDao;
import member.util.ConnectionProvider;

public class IdCheckService {
	private IdCheckService() {}
	private static IdCheckService service = new IdCheckService();
	public static IdCheckService getInstance() {
		return service;
	}
	
	public String idCheck(String memberId) {
		//String result = "N";
		
		int cnt = 0;
		
		Connection conn = null;
		MemberDao dao = null;
		
		try {
			conn = ConnectionProvider.getConnection();
			dao = MemberDao.getInstance();
			
			 cnt = dao.selectByLogin(conn, memberId);
			
			//result = cnt > 0 ? "N" : "Y" ;
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		return cnt > 0 ? "N" : "Y";
	}
}