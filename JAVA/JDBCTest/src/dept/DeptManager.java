package dept;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;

public class DeptManager {
	
	private	DeptDao dao;
	
	public DeptManager(DeptDao dao) {
		this.dao = dao;
	}
	//전체 리스트 출력 메서드 
	//DAO 에서 데이터 리스트를 받고 출력 처리
	void deptList() {
		// Connection 객체 생성 -> 트랜잭션 처리
		Connection conn = null;
		
		//2. 연결 -> 중요  여러번 사용해볼것 !
		String jdbcUrl = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "hr";
		String pw = "tiger";
		
		try {
			conn = DriverManager.getConnection(jdbcUrl, user, pw);
		List<Dept> list = dao.getDeptList(conn);
		
		
		
		} catch (SQLException e) {
			e.printStackTrace();
		}
			
		
	}
	//데이터 입력
	
	//데이터 수정
	
	//데이터 삭제
	
}
