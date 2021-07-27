package guest.service;

import java.sql.Connection;
import java.sql.SQLException;

import guest.dao.MessageDao;
import guest.domain.Message;
import guest.exception.InvaildPasswordException;
import guest.exception.MessageNotFoundException;
import guest.jdbc.ConnectionProvider;
import guest.jdbc.JdbcUtil;

public class DeleteMessageService {
	//싱글톤 패턴 적용
	private DeleteMessageService() {}
	private static DeleteMessageService service = new DeleteMessageService();
	public static DeleteMessageService getInstance() {
		if(service == null) {
			service = new DeleteMessageService();
		}
		return service;
	}
	
	public int deleteMessage(int mid,String pw) throws SQLException, MessageNotFoundException, InvaildPasswordException  {
		int result = 0;
		Connection conn = null;
		MessageDao dao = null;
		
		try {
			conn = ConnectionProvider.getConnection();
			dao = MessageDao.getInstance();
			//트랜잭션 시작
			conn.setAutoCommit(false);
			
			//전달 받은 mid로 게시물을 검색
			Message message = dao.selectByMid(conn,mid);
			if(message == null) {
				throw new MessageNotFoundException(mid);
			}else {
				//현재 사용자가 입력한 pw와 db mid에 저장된 pw와 값 비교
				if(message.getPassword().equals(pw)) {
					// 삭제
					result = dao.deleteMessage(conn,mid);
					//트랜잭션 성공
					conn.commit();
				}else {
					//비밀번호가 일치하지 않는 경우 
					throw new InvaildPasswordException();
				}
			}
		}catch(SQLException e){
			e.printStackTrace();
			JdbcUtil.rollback(conn);
			throw e;	
		} catch (MessageNotFoundException e) {
			e.printStackTrace();
			JdbcUtil.rollback(conn);
			throw e;
		} catch (InvaildPasswordException e) {
			e.printStackTrace();
			JdbcUtil.rollback(conn);
			throw e;
		}
		finally {
			JdbcUtil.close(conn);
		}
		return result;
	}
	
	
	
}
