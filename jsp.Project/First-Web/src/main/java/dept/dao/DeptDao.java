package dept.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import dept.domain.Dept;
import jdbc.util.JdbcUtil;

public class DeptDao {
	
	//싱글톤 패턴
	// 1.인스턴스 생성을 막는다.
	private DeptDao() {}
	//2.클래스 내부에서 인스턴스 생성
	private static DeptDao dao = new DeptDao();
	//3.외부에서 참조값을 반환 받을 수 있는 메소드
	public static DeptDao getInstance() {		
		return dao==null? new DeptDao(): dao;	
	}
	// dept 부서 조회
	public List<Dept> getDetpList(Connection conn) {
		List<Dept> deptList = null;

		Statement stmt = null;
		ResultSet rs = null;
		// 3.Statement
		try {
			stmt = conn.createStatement();
			// sql
			String sqlSelect = "select * from dept";

			// 4.ResultSet
			rs = stmt.executeQuery(sqlSelect);

			// 5.List<Dept> <- 결과
			deptList = new ArrayList<Dept>();

			while (rs.next()) {
				// List에 객체 추가
				deptList.add(makeDept(rs));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JdbcUtil.close(rs);
			JdbcUtil.close(stmt);
		}
		return deptList;
	}
	
	public int insertDept(Connection conn, Dept dept) {
		
		int resultCnt = 0;
		PreparedStatement pstmt = null;
		
		// PreparedStatement
		String sqlInsert = "insert into dept values(?, ?, ?)";
		try {
			pstmt = conn.prepareStatement(sqlInsert);
			pstmt.setInt(1, dept.getDeptno());
			pstmt.setString(2, dept.getDname());
			pstmt.setString(3, dept.getLoc());
			
			// insert -> int 
			resultCnt = pstmt.executeUpdate();
		
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			if(pstmt != null) {
				JdbcUtil.close(pstmt);
			}
		}		
		return resultCnt;
	}
	
	public int deleteDept(Connection conn, int deptno) {
		
		int resultCnt = 0;
		PreparedStatement pstmt = null;
		
		try {
		String sqlDelete = "delete from dept where deptno=?";
		pstmt = conn.prepareStatement(sqlDelete);
		pstmt.setInt(1,deptno);
		
		resultCnt = pstmt.executeUpdate();
		
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			if(pstmt != null) {
				JdbcUtil.close(pstmt);
			}
		}
		return resultCnt;
	}
	
	public Dept selectByDeptno(Connection conn, int deptno) {
		Dept dept = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		String sqlSelect = "select * from dept where deptno=?";
		try {
			pstmt = conn.prepareStatement(sqlSelect);
			
			pstmt.setInt(1,deptno);
			
			rs = pstmt.executeQuery();
			
			if(rs.next()){
				dept = makeDept(rs);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			if(rs != null) {
				JdbcUtil.close(rs);
			}
			if(pstmt != null) {
				JdbcUtil.close(pstmt);
			}
		}	
		return dept;
	}
	
	public int updateDept(Connection conn, Dept dept) {
		int resultCnt = 0;
		
		PreparedStatement pstmt = null;
		String sqlUpdate ="update dept set dname=?, loc=? where deptno=?";
		
		try {
			pstmt = conn.prepareStatement(sqlUpdate);
			pstmt.setString(1, dept.getDname());
			pstmt.setString(2, dept.getLoc());
			pstmt.setInt(3,dept.getDeptno());
			
			resultCnt = pstmt.executeUpdate();
		
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			if(pstmt != null) {
				JdbcUtil.close(pstmt);
			}
		}
		return resultCnt;
	}
	
	private Dept makeDept(ResultSet rs) throws SQLException {
		Dept dept = new Dept();
		dept.setDeptno(rs.getInt("deptno"));
		dept.setDname(rs.getString("dname"));
		dept.setLoc(rs.getString("loc"));
		
		return dept;
	}
	
	
	
}


