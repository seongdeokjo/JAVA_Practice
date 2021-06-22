package dept01_test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class DeptDao {
	// crud : create, read, update, delete
	
	//싱글톤 패턴 : 여러개의 인스턴스를 생성하지 못하도록 하는 디자인 패턴
	// 1.외부 클래스 또는 인스턴스에서 해당 인스턴스를 생성하지 못하도록 처리
	
	private DeptDao() {
	}
	
	//2. 클래스 내부에서 인스턴스를 만들고
	 static private DeptDao dao = new DeptDao();
	 
	 //3. 메소드를 통해서 반환 하도록 처리
	 public static DeptDao getInstance() {
		 return dao;
	 }
	 
	 // 1. 전체 데이터 검색 기능
	 // 반환 타입 List<Dept>
	 // 매개변수 - Connection 객체 : Statement
	 // read
	 ArrayList<Dept> getDeptList(Connection conn) {
		 
		 ArrayList<Dept> list = null;
		
		 Statement stmt = null;
		 ResultSet rs = null;
		 
		 try {
			stmt = conn.createStatement();
			String sql = "select * from dept order by deptno";
			
			//결과 받아오기
			rs = stmt.executeQuery(sql);
			
			list = new ArrayList<>();
			
			//데이터를 Dept 객체로 생성 -> list에 저장
			while(rs.next()) {
				Dept d = new Dept(rs.getInt(1),rs.getString(2),rs.getString(3));
				
				list.add(d);
				
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
	 
	 //2. Dept 테이블에 데이터 저장하는 메소드
	 // 반영 횟수 반환
	 // 사용자로부터 데이터 받기 -> Dept 객체
	 // create
	 
	 int insertDept(Connection conn, Dept dept) {
		 int result = 0;
		 
		 //전달받은 Dept 객체의 데이터로 Dept 테이블에 저장 -> 결과 값을 반환
		 
		 PreparedStatement pstmt = null;
		 
		 String sql = "insert into dept values (DEPT01_DEPTNO_SEQ.nextval, ? , ?)";
		 try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, dept.getDname());
			pstmt.setString(2, dept.getLoc());
			
			result = pstmt.executeUpdate();
			
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
	 
	 //3. DEPT 테이블의 데이터 수정 메소드
	 // 반영된 행의 개수 반환
	 // 사용자로부터 데이터를 받아서 처리 -> Dept 객체
	 // update
	 
	 int editDept(Connection conn, Dept dept) {
		 
		 int result = 0;
		 
		 //전달받은 Dept 객체의 데이터로 Dept 테이블에 저장 -> 결과 값을 반환
		 PreparedStatement pstmt = null;
		 
		 String sql = "update dept set dname = ?, loc = ? where deptno = ?";
		 try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, dept.getDname());
			pstmt.setString(2, dept.getLoc());
			pstmt.setInt(3, dept.getDeptno());
			
			result = pstmt.executeUpdate();
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
	 
	 
	 //4.Dept 테이블의 데이터를 삭제
	 // 삭제된 행의 개수 반환
	 // 사용자로부터 deptno 받아서 처리
	 // delete
	 
	 int deleteDept(Connection conn, int deptno) {
		 int result = 0;
		 
		 //데이터 베이스 처리 sql
		 PreparedStatement pstmt = null;
		 
		 String sql = "delete from dept where deptno = ?";
		 
		 
		 try {
			pstmt = conn.prepareStatement(sql);
			
			 pstmt.setInt(1, deptno);
			 
			 result = pstmt.executeUpdate();
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