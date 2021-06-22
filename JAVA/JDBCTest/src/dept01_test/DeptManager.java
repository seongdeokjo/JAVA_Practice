package dept01_test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

public class DeptManager {
	
	private DeptDao dao;
	private Scanner scan;
	
	public DeptManager(DeptDao dao) {
		this.dao = dao;
		scan = new Scanner(System.in);
	}
	
	//전체 리스트 출력 메소드
	// DAO 에서 데이터 리스트를 받고 출력 처리
	void deptList() {
		//Connection 객체 생성 -> 트랜잭션 처리
		Connection conn = null;
		
		//2.연결
		String jdbcUrl = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "hr";
		String pw = "1234";
		
		try {
			conn = DriverManager.getConnection(jdbcUrl,user,pw);
			
			List<Dept> list = dao.getDeptList(conn);
			
			System.out.println("부서 정보 리스트");
			System.out.println("=================================");
			System.out.println("부서 번호\t 부서 이름\t 부서 위치");
			System.out.println("=================================");
			
			for(Dept dept : list) {
				System.out.printf("%d \t %s \t %s \n",
						dept.getDeptno(),
						dept.getDname(),
						dept.getLoc());
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	// 데이터 입력
	// 사용자에게 Scanner 클래스로 입력 받아 -> dao insertDept() 메소드로 저장
	void inputData() {
		//Connection 객체 생성-> 트랜잭션 처리
		Connection conn = null;
		
		//2.연결
		String jdbcUrl = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "hr";
		String pw = "1234";
		
		try {
			conn = DriverManager.getConnection(jdbcUrl, user, pw);
			
			System.out.println("부서 정보를 입력합니다.");
			System.out.println("부서이름 부서위치 형식으로 입력해주세요.");
			System.out.println("예시) dev seoul");
			
			String inputData = scan.nextLine();
			String[] deptData = inputData.split(" ");
			
			Dept dept = new Dept(0,deptData[0],deptData[1]);
			
			int result = dao.insertDept(conn, dept);
			
			if(result > 0) {
				System.out.println("입력되었습니다.");
			}else {
				System.out.println("입력 실패!");
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	// 데이터 수정
	// 사용자로부터 데이터를 받아 수정 -> dao editDept() 메소드 이용
	void editData() {
		
		//Connection conn 객체 생성 -> 트랜잭션 처리
		Connection conn = null;
		
		//2. 연결
		String jdbcUrl = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "hr";
		String pw = "1234";
		
		try {
			conn = DriverManager.getConnection(jdbcUrl, user, pw);
			
			System.out.println("부서 정보를 수정합니다.");
			System.out.println("부서번호 부서이름 부서위치 형식으로 입력해주세요.");
			System.out.println("입력된 부서번호의 부서이름과 부서위치가 수정됩니다.");
			
			String editData = scan.nextLine();
			String[] eData = editData.split(" ");
			
			Dept dept = new Dept(Integer.parseInt(eData[0]),eData[1],eData[2]);
			
			int result = dao.editDept(conn, dept);
			
			if(result > 0) {
				System.out.println("수정되었습니다.");
			}else {
				System.out.println("수정 실패!!");
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	// 데이터 삭제
	// 사용자로부터 부서번호를 입력받아 부서정보를 삭제
	
	void deleteData() {
		//Connection conn 객체 생성 -> 트랜잭션 처리
		Connection conn =null;
		
		//2. 연결
		String jdbcUrl = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "hr";
		String pw = "1234";
		try {
			conn = DriverManager.getConnection(jdbcUrl, user, pw);
			
			deptList();
			
			System.out.println("삭제를 원하시는 부서번호를 입력해주세요.");
		    int deptno = Integer.parseInt(scan.nextLine());
		    
		    int result = dao.deleteDept(conn, deptno);
		    
		    if(result > 0) {
		    	System.out.println("삭제되었습니다.");
		    }else {
		    	System.out.println("해당 부서의 정보가 없습니다.");
		    }
		} catch (SQLException e) {
			e.printStackTrace();
		}	
	}
}