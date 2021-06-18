package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCTest {

	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null;
		try {
			//1. ����̹� �ε�
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("����̹� �ε� ����!");
			//2. ���� -> �߿�  ������ ����غ��� !
			String jdbcUrl = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "hr";
			String pw = "tiger";
			
			conn = DriverManager.getConnection(jdbcUrl, user, pw);
			System.out.println("�����ͺ��̽� ���� ����!!");
				
			//3.sql ó��
			stmt = conn.createStatement();
			
			
		} catch (ClassNotFoundException e) {
			System.out.println("����� Ŭ������ ã�� ����!");
			
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("������ ���̽� ���� ����!");
			e.printStackTrace();
		}finally {
			//4. close()
			if(stmt != null) {
				try {
					stmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			
			
			if(conn != null) {
				try {
					conn.close();
				} 	catch (SQLException e) {
					System.out.println("������ ���̽��� �����մϴ�.");
					e.printStackTrace();
				}
			}	
		}
	}
}