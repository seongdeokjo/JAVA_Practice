package dept;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class DeptDao {
	// 1. ��ü ������ �˻� ���
	// ��ȯ Ÿ�� List<Dept>
	// �Ű����� - Connection ��ü : Statement
	
	ArrayList<Dept> getDeptList(Connection conn) {
		ArrayList<Dept> list = null;
		//������ ���̽��� Dept���̺� �̿� select ����� -> list ����
		Statement stmt = null;
		ResultSet rs = null;
		try {
			stmt = conn.createStatement();
			String sql = "select * from dept order by deptno";
			
			//��� �޾ƿ���
			rs = stmt.executeQuery(sql);
			
			list = new ArrayList<>();
			
			//�����͸� Dept ��ü�� ���� -> list�� ����
			while(rs.next()) {
				list.add(new Dept(rs.getInt(1),rs.getString(2),rs.getString(3)));
			}
			
			
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
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
		}
		
		
		return list;		
	}

	// 2.Dept ���̺� ������ �����ϴ� �޼ҵ�
	// �ݿ� Ƚ�� ��ȯ 
	// ����ڷ� ���� ������ �ޱ� -> Dept ��ü
	int insertDept(Connection conn, Dept dept) {
		int result = 0;
		
		//���޹��� Dept ��ü�� �����ͷ� Dept ���̺� ���� -> ��� ���� ��ȯ 
		PreparedStatement pstmt = null;
		
		try {
			String sql = "insert into dept values (DEPT01_DEPTNO_SEQ.nextval, ?,?)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, dept.getDname());
			pstmt.setString(2, dept.getLoc());
			
			
			result =pstmt.executeUpdate();
		
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			if(pstmt != null) {
				try {
					pstmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return result;
	}
	
	//3. Dept ���̺��� ������ ���� �޼ҵ�
	// �ݿ��� ���� ���� ��ȯ
	// ����ڷκ��� �����͸� �޾Ƽ� ó�� -> Dept ��ü
	int editDept(Connection conn, Dept dept) {
	int result = 0;
		
		//���޹��� Dept ��ü�� �����ͷ� Dept ���̺� ���� -> ��� ���� ��ȯ 
		PreparedStatement pstmt = null;
		
		try {
			String sql = "update dept set dname =?, loc =? where deptno =? ";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, dept.getDname());
			pstmt.setString(2, dept.getLoc());
			pstmt.setInt(3, dept.getDeptno());
			
			result =pstmt.executeUpdate();
		
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			if(pstmt != null) {
				try {
					pstmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return result;
	}
	
}