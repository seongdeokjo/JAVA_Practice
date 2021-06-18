package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class JDBCTestDeptDML {

	public static void main(String[] args) {
		
		//���� ��ü : ���� ������ ������.
		Connection conn = null;
		//sql�� ���� �� �޼ҵ� ���� -> sql executeQuery(), executeUdate()
		Statement stmt = null;
		// executeQuery() ��ȯŸ�� -> select�� ���(ǥ)�� ��� ��ü
		ResultSet rs = null;
		//Statement -> PrepardeStatement :���� ����
		PreparedStatement pstmt = null;
		
		Scanner scan = new Scanner(System.in);
		
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
			
			//Ʈ����� ����
			conn.setAutoCommit(false);
			
			
			System.out.println("�μ� ���� �Է� �����մϴ�.");
			System.out.println("�μ� �̸��� �Է����ּ���.");
			String dname = scan.nextLine();
			System.out.println("�μ���ġ�� �Է����ּ���.");
			String loc = scan.nextLine();
				
			//3.sql ó��
			//����ڿ��� ������ �޾� �μ� �����͸� �Է��ϴ� ���α׷��� ������
			
			String sql = "insert into dept01 values (DEPT01_DEPTNO_SEQ.nextval, ?,?)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1,dname);
			pstmt.setString(2, loc);
			
			int result = pstmt.executeUpdate();
			
			if(result > 0) {
				System.out.println("�ԷµǾ����ϴ�.");
			}else {
				System.out.println("�Է� ����!");
			}
	
			//Ʈ����� �Ϸ�(����)
			conn.commit();
			
			
			
		} catch (ClassNotFoundException e) {
			System.out.println("����� Ŭ������ ã�� ����!");
			
			e.printStackTrace();
		} catch (SQLException e) {
		//	System.out.println("������ ���̽� ���� ����!");
			e.printStackTrace();
		}finally {
			//4. close()
			if(pstmt != null) {
				try {
					pstmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			
			if(rs != null) {
				try {
					rs.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			
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