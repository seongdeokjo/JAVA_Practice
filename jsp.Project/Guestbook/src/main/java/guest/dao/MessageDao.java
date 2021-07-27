package guest.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

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
	
	// 메시지 작성
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

	// 전체 게시물의 개수
	public int selectAllCount(Connection conn) {
		int totalCount = 0;
		Statement stmt = null;
		ResultSet rs = null;
		
		try {
			String sqlSel ="select count(*) from guestbook_message";
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sqlSel);
			if(rs.next()) {
				totalCount = rs.getInt(1);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			JdbcUtil.close(rs);
			JdbcUtil.close(stmt);
		}
		
		return totalCount;
	}
	//작성된 게시글을 지정된 값 만큼 보여주기 위한 기능
	public List<Message> selectMessageList(Connection conn, int firstRow, int messageCountperPage) {
		List<Message> messageList = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		String sqlSel ="select * from guestbook_message order by regdate desc limit ?,?";
		try {
			pstmt = conn.prepareStatement(sqlSel);
			pstmt.setInt(1, firstRow);
			pstmt.setInt(2, messageCountperPage);
			
			rs = pstmt.executeQuery();
			messageList = new ArrayList<Message>();
			
			while(rs.next()) {
				messageList.add(new Message(
							rs.getInt(1),
							rs.getString(2),
							rs.getString(3),
							rs.getString(4),
							rs.getTimestamp(5)
						));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			JdbcUtil.close(rs);
			JdbcUtil.close(pstmt);
		}
		return messageList;
	}
	// mid로 저장되어있는 message 반환
	public Message selectByMid(Connection conn, int mid) {
		Message message = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		String sqlSel = "select * from guestbook_message where messageid = ?";
		try {
			pstmt = conn.prepareStatement(sqlSel);
			pstmt.setInt(1, mid);
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				message = new Message();
				message.setMemssageid(rs.getInt(1));
				message.setGuestname(rs.getString(2));
				message.setPassword(rs.getString(3));
				message.setMessage(rs.getString(4));
				message.setRegdate(rs.getTimestamp(5));
				
//				message = new Message(
//							
//							rs.getInt(1),
//							rs.getString(2),
//							rs.getString(3),
//							rs.getString(3),
//							rs.getTimestamp(4)
//						);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			JdbcUtil.close(rs);
			JdbcUtil.close(pstmt);
		}
		return message;
	}
	// 인덱스를 받아 해당 게시글 삭제하는 메서드
	public int deleteMessage(Connection conn, int mid) {
		int result = 0;
		PreparedStatement pstmt = null;
		
		String sqlDel ="delete from guestbook_message where messageid = ?";
		try {
			pstmt = conn.prepareStatement(sqlDel);
			pstmt.setInt(1, mid);
			
			result = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			JdbcUtil.close(pstmt);
		}	
		return result;
	}
	
	
	
	
	
	
	
}