package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCTestEMP {

	public static void main(String[] args) {
		
		//���� ��ü : ���� ������ ������.
		Connection conn = null;
		//sql�� ���� �� �޼ҵ� ���� -> sql executeQuery(), executeUdate()
		Statement stmt = null;
		// executeQuery() ��ȯŸ�� -> select�� ���(ǥ)�� ��� ��ü
		ResultSet rs = null;
		//Statement -> PrepardeStatement :���� ����
		PreparedStatement pstmt = null;
		
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
			//��� ��ȣ, ����̸�, ����, sal, �μ��̸�, �μ���ġ
			
			//1. Statement
			stmt = conn.createStatement();
			
			//2. sql �ۼ� 
			String sql = "select e.empno, e.ename, e.job, e.sal, d.dname, d.loc from dept d, emp e where d.deptno = e.deptno";
		
			//3. ResultSet ��ü�� ������ �ޱ�
			rs = stmt.executeQuery(sql);		
			
			//4. ���
			while(rs.next()) {
				System.out.println(rs.getInt(1)+"\t"+rs.getString(2));
			}
			
			
			
			
	
			
			
			
			
		} catch (ClassNotFoundException e) {
			System.out.println("����� Ŭ������ ã�� ����!");
			
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("������ ���̽� ���� ����!");
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