package dept;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;

public class DeptMain {

	public static void main(String[] args) {
		Connection conn = null;
		//1. ����̹� �ε�
		try {
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
		
			System.out.println("����̹� �ε� ����!");
			
			//2. ���� -> �߿�  ������ ����غ��� !
			String jdbcUrl = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "hr";
			String pw = "tiger";
			
			conn = DriverManager.getConnection(jdbcUrl, user, pw);
			System.out.println("�����ͺ��̽� ���� ����!!");
			
			
			DeptDao dao = new DeptDao();
			
			List<Dept> list = dao.getDeptList(conn);
			
			for(Dept dept : list) {
				System.out.println(dept);
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
	}
}
}
