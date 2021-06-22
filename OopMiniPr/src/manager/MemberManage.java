package manager;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import member.*;

public class MemberManage {
	//메소드
	// 회원 정보 관리
	// 조회
	// 삭제
	//등록 ?? 회원가입?
	
	private ManagerDao dao;
	private Scanner scan;
	private Connection conn;
	
	public MemberManage(ManagerDao dao) {
		this.dao = dao;
		scan = new Scanner(System.in);
	}
	//멤버의 db연결 로그인	
	public int login(String mId, String Pw) {
	conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = "select pw from manager where mid = ?";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, mId);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				if(rs.getString(1).contentEquals(Pw)) {
					return 1; //로그인 성공
				}
			}else {
				return 0; // 비밀 번호 불일치
			}
			
			return -1; // 아이디가 없음
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return -2; // db 오류
	}
	
	
	
	
	//회원 리스트 출력 메소드 
	//Dao에서 데이터 리스트를 받고 출력 처리
public	void memberList() {
		
	//Connection 객체 생성 -> 트랜잭션 처리
	 conn = null;
		
	//2.연결
	
	String jdbcUrl = "jdbc:oracle:thin:@localhost:1521:xe";
	String user = "hr";
	String pw = "tiger";
	
	try {
		conn = DriverManager.getConnection(jdbcUrl,user,pw);
		
		List<Member> list = dao.getMemberList(conn);
		
		System.out.println("멤버 정보 리스트");
		System.out.println("-----------------------------------------------------------");
		System.out.println("멤버 번호 \t 멤버 아이디 \t 멤버 비밀번호 \t 멤버 이름 \t 멤버 운전면허 \t 멤버 이메일 \t 멤버 주소");
		System.out.println("-----------------------------------------------------------");
		
		for(Member member : list) {
			System.out.printf("%d \t %s \t %s \t %s \t %d \t %s \t %s"
//					,member.getMembercode();
//					member.getId();
//					member.getPw();
//					member.getName();
//					member.getCarreg();
//					member.getEmail();
//					member.getAddress();
					);
		}
		
		} catch (SQLException e) {
			e.printStackTrace();
		}	
	}
	
	//회원 정보 삭제 메소드
public  void deletMember() {
		conn = null;
		
		String jdbcUrl = "jdbc:oracle:thin:localhost:1521:xe";
		String user = "hr";
		String pw = "tiger";
		
		try {
			conn = DriverManager.getConnection(jdbcUrl, user, pw);
			
			memberList();
			
			System.out.println("삭제를 원하시는 멤버의 코드번호를 입력하세요.");
			int membercode = Integer.parseInt(scan.nextLine());
			
			int result = dao.deleteMember(conn, membercode);
			
			if(result > 0) {
				System.out.println("멤버가 삭제되었습니다.");
			}else {
				System.out.println("해당 멤버의 정보가 없습니다.");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}