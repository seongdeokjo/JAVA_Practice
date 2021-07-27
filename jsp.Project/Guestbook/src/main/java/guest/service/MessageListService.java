package guest.service;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import guest.dao.MessageDao;
import guest.domain.Message;
import guest.domain.MessageListView;
import guest.jdbc.ConnectionProvider;

public class MessageListService {
	
	//한 페이지에 표현할 메시지의 개수
	private final int messageCountperPage = 3;
	
	private MessageListService() {}
	private static MessageListService service = new MessageListService();
	public static MessageListService getInstance() {
		if(service == null) {
			service = new MessageListService();
		}
		return service;
	}
	
	
	public MessageListView getMessageList(int pageNumber) {
		MessageListView listview = null;
		Connection conn = null;
		MessageDao dao = null;
		
		try {
			conn = ConnectionProvider.getConnection();
			dao = MessageDao.getInstance();
			
			//전체 게시물의 개수 
			int totalMessageCount = dao.selectAllCount(conn);
			System.out.println("전체 메시지 개수: "+ totalMessageCount);
			
			//페이지에 표현할 메시지 객체들 List<Message>
			List<Message> messageList = null;
			
			//시작행의 위치값 limit index 
			int firstRow = (pageNumber - 1) * messageCountperPage;
			messageList = dao.selectMessageList(conn,firstRow,messageCountperPage);
			System.out.println("message List : "+ messageList);
			
			listview = new MessageListView(
					messageList, 
					totalMessageCount,
					pageNumber, 
					messageCountperPage, 
					firstRow,
					0
					);
			
			System.out.println(listview);
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		
		return listview;
	}
}
