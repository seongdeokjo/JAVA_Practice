package manager;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import carT.*;
import memberT.*;

public class ManagerDao {
	//1.외부 클래스 또는 인스턴스에서 해당 클래스로 인스턴스를 생성하지 못하도록 처리
	private ManagerDao() {
	}
	//2. 클래스 내부에서 인스턴스를 만들고
	static private ManagerDao mDao = new ManagerDao();
	private Connection conn;
		
	//3. 메소드를 통해서 반환 하도록 처리
	public static ManagerDao getInstance() {
		return mDao;
	}	
	
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
		
			while(rs.next()) {
				list.add(
					new Member(rs.getInt(1),
							rs.getString(2),
							rs.getString(3),
							rs.getString(4),
							rs.getString(5),
							rs.getString(6),
							rs.getString(7))
				);	
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
	 //멤버의 정보 입력
	 int insertMember(Connection conn, Member member) {
			
			int result = 0;
			
			//전달받은 Member 객체의 데이터로 Member 테이블에 저장 -> 결과값을 반환
			PreparedStatement pstmt = null;
			
				
				try {
					String sql = "insert into member values(MEMBER_membercode_SEQ.nextval, ?, ?, ?, ?, ?, ?)";
					pstmt = conn.prepareStatement(sql);
					pstmt.setString(1, member.getId());
					pstmt.setString(2, member.getPw());
					pstmt.setString(3, member.getName());
					pstmt.setString(4, member.getCarreg());
					pstmt.setString(5, member.getEmail());
					pstmt.setString(6, member.getAddress());
					
					result = pstmt.executeUpdate();
				
				} catch (SQLException e) {
					e.printStackTrace();
				} finally {
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
	 ArrayList<Car> getCarList(Connection conn) {
		 ArrayList<Car> list = null;
		 
		 Statement stmt = null;
		 ResultSet rs = null;
		 
		 String sql = "select * from car order by carnumber";
		 
		 try {
			stmt = conn.createStatement();
			
			rs = stmt.executeQuery(sql);
			
			list = new ArrayList<>();
			
			while(rs.next()) {
			list.add(
				new Car(rs.getInt(1),
						rs.getString(2),
						rs.getString(3),
						rs.getString(4),
						rs.getInt(5),
						rs.getInt(6),
						rs.getString(7),
						rs.getString(8))
			);
			}
						
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
	 int insertCar(Connection conn, Car car) {
		 int result = 0;
		 
		 PreparedStatement pstmt = null;
		 
		 // sequence 생성 
		 String sql = "insert into car values(car_carcode_SEQ.nextVal,?,?,?,?,?,?,?)";
		 
		 try {
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, car.getCarnumber());
			pstmt.setString(2, car.getCarname());
			pstmt.setString(3, car.getCarsize());
			pstmt.setInt(4, car.getCarseat());
			pstmt.setInt(5, car.getCaryear());
			pstmt.setString(6, car.getFuel());
			pstmt.setString(7,car.getRent());
			
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
	int deleteCar(Connection conn, int carnumber) {
		int result = 0;
		
		PreparedStatement pstmt = null;
		
		String sql = "delete from car where carnumber = ?";
		
		try {
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setInt(1, carnumber);
			
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