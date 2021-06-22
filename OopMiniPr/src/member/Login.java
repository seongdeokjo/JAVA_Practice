
package member;
//private Connection conn;
//private PreparedStatement pstmt;
//private ResultSet rs;



  //	login 기능 구현 예제 참고 코드
public class Login {
	
//	public UserDAO() {
//	 	// ...
//	}
//	// 여기서 부터 
//	public int login(String userID, String userPassword) { // 어떤 계정에 대한 실제로 로그인을 시도하는 함수, 인자값으로 ID와 Password를 받아 login을 판단함.
//		String SQL = "SELECT userPassword FROM USER WHERE userID = ?"; // 실제로 DB에 입력될 명령어를 SQL 문장으로 만듬.
//		try {
//			pstmt = conn.prepareStatement(SQL);
//			pstmt.setString(1,  userID);
//			rs = pstmt.executeQuery(); // 어떠한 결과를 받아오는 ResultSet 타입의 rs 변수에 쿼리문을 실행한 결과를 넣어줌 
//			if (rs.next()) {
//				if (rs.getString(1).contentEquals(userPassword)) {
//					return 1; // 로그인 성공
//				}
//				else {
//					return 0; // 비밀번호 불일치
//				}
//			}
//			return -1; // 아이디가 없음
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		return -2; // DB 오류 
//	}
//
//}
}
