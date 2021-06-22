package manager;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import car.CarInfo;
import member.Member;

public class ManagerDao {
	//1.외부 클래스 또는 인스턴스에서 해당 클래스로 인스턴스를 생성하지 못하도록 처리
	private ManagerDao() {
	}
	//2. 클래스 내부에서 인스턴스를 만들고
	static private ManagerDao mDao = new ManagerDao(); 	
	//3. 메소드를 통해서 반환 하도록 처리
	public static ManagerDao getInstance() {
		return mDao;
	}	
	//매니저의 db연결 로그인	
	//멤버의 정보 조회
	 ArrayList<Member> getMemberList(Connection conn) {
		ArrayList<Member> list = null;
		
		//데이터 베이스의 member 테이블 이용 select 결과를 ->list 에 저장
		Statement stmt = null;
		ResultSet rs = null;
		
		try {
			stmt = conn.createStatement();
			String sql = "select * from member order by membercode ";
		
			//결과 받아오기
			rs = stmt.executeQuery(sql);
			
			list = new ArrayList<>();
			
			//데이터를 member 객체로 생성 -> list에 저장
			// ()안에 member table의 데이터 작성해야함
			Member m = new Member();
			list.add(m);
			
			
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
	//멤버의 정보 삭제
	 int deleteMember(Connection conn, int membercode) {
		 int result = 0;
		 
		 PreparedStatement pstmt = null;
		 
		 String sql = "delete from member where membercode = ?";
		 
		 try {
			 pstmt = conn.prepareStatement(sql);
			 pstmt.setInt(1, membercode);
			 
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
	 
	 //차량 정보 조회
	 ArrayList<CarInfo> getCarList(Connection conn) {
		 ArrayList<CarInfo> list = null;
		 
		 Statement stmt = null;
		 ResultSet rs = null;
		 
		 String sql = "select * from car order by carreg";
		 
		 try {
			stmt = conn.createStatement();
			
			rs = stmt.executeQuery(sql);
			
			list = new ArrayList<>();
			
			CarInfo car = new CarInfo();
			list.add(car);
						
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
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
	 
	//차량 등록
	 int insertCar(Connection conn, CarInfo car) {
		 int result = 0;
		 
		 PreparedStatement pstmt = null;
		 
		 // sequence 생성 
		 String sql = "insert inot car values(?,?,?,?,?,?,?)";
		 
		 try {
			pstmt = conn.prepareStatement(sql);
			
//			pstmt.setInt(1, carInfo.getCarcode());
//			pstmt.setInt(2, carInfo.getYear());
//			pstmt.setInt(3, carInfo.getCarseat());
//			pstmt.setString(4, carInfo.getfuel());
//			pstmt.setString(5, carInfo.getCarname());
//			pstmt.setString(6, carInfo.getCarsize());
//			pstmt.setInt(7, carInfo.getCarnumber());
			
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
	
	//차량 삭제
	int deleteCar(Connection conn, int carcode) {
		int result = 0;
		
		PreparedStatement pstmt = null;
		
		String sql = "delete from car where carcode = ?";
		
		try {
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setInt(1, carcode);
			
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