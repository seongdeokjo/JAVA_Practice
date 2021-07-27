package guest.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import guest.domain.Message;
import guest.jdbc.JdbcUtil;

public class MessageDao {
	//싱글톤 처리
	private MessageDao() {}
	private static MessageDao dao = new MessageDao();
	public static MessageDao getInstance() {
		if(dao == null) {
			dao = new MessageDao();
		}
		return dao;
	}
	
	
	public int writeMessage(Connection conn, Message message) throws SQLException {
		int result = 0;
		
		PreparedStatement pstmt = null;
		
		String sql = "insert into guestbook_message (guestname,password,message) values(?,?,?)";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, message.getGuestname());
			pstmt.setString(2, message.getPassword());
			pstmt.setString(3, message.getMessage());
			
			result = pstmt.executeUpdate();
		} finally {
			// close
			JdbcUtil.close(pstmt);
		}
		return result;
	}

	
}
