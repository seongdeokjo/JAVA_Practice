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
	//��ü ����Ʈ ��� �޼��� 
	//DAO ���� ������ ����Ʈ�� �ް� ��� ó��
	void deptList() {
		// Connection ��ü ���� -> Ʈ����� ó��
		Connection conn = null;
		
		//2. ���� -> �߿�  ������ ����غ��� !
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
	//������ �Է�
	
	//������ ����
	
	//������ ����
	
}
