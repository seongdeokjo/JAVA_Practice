package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class JDBCTestDeptDML3 {

	public static void main(String[] args) {
		
		//연결 객체 : 연결 정보를 가진다.
		Connection conn = null;
		//sql을 실행 할 메소드 제공 -> sql executeQuery(), executeUdate()
		Statement stmt = null;
		// executeQuery() 반환타입 -> select의 결과(표)를 담는 객체
		ResultSet rs = null;
		//Statement -> PrepardeStatement :성능 개선
		PreparedStatement pstmt = null;
		
		Scanner scan = new Scanner(System.in);
		
		try {
			//1. 드라이버 로드
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("드라이버 로드 성공!");
			//2. 연결 -> 중요  여러번 사용해볼것 !
			String jdbcUrl = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "hr";
			String pw = "tiger";
			
			conn = DriverManager.getConnection(jdbcUrl, user, pw);
			System.out.println("데이터베이스 연결 성공!!");
			
			//트랜잭션 설정
			conn.setAutoCommit(false);
			
			//사용자에게 정보를 받아 데이터를 수정
			// 10 dev seoul ==> " "
			System.out.println("부서 데이터의 수정을 시작합니다.");
			System.out.println("10 dev seoul 형식으로 데이터를 입력해 주세요");
			String input = scan.nextLine();
			
			// String[]
			String[] inputs = input.split(" ");
			
//			for(String str : inputs) {
//				System.out.println(str);
//			}
			String sql ="update dept01 set dname =?, loc = ? where deptno =?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1,inputs[1]);
			pstmt.setString(2, inputs[2]);
			pstmt.setInt(3, Integer.parseInt(inputs[0]));
			
			int result = pstmt.executeUpdate();
			
			if(result >0) {
				System.out.println("수정되었습니다.");
			}else {
				System.out.println("찾으시는 부서가 존재하지 않습니다.");
			}
					
			//트랜잭션 완료(성공)
			conn.commit();
			System.out.println("커밋 완료!");
				
		} catch (ClassNotFoundException e) {
			System.out.println("드라비어 클래스를 찾지 못함!");
			
			e.printStackTrace();
		} catch (SQLException e) {
		//	System.out.println("데이터 베이스 연결 실패!");
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
					System.out.println("데이터 베이스를 종료합니다.");
					e.printStackTrace();
				}
			}	
		}
	}
}