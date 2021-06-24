package carT;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;


public class CarDao {

	private CarDao() {	
	}
	//클래스 내부 인스턴스
	static private CarDao Cdao= new CarDao();
	// 반환 처리
	public static CarDao getInstance() {
		return Cdao;
	}

	//데이터 검색

	//매개변수Connection 객체 Statement를 만들기위해
	ArrayList<Car> getCarList(Connection conn){

		ArrayList<Car> Clist = null;

		//DB select결과를 Clist에저장
		Statement Cstmt = null;
		ResultSet Crs = null;


		try {
			Cstmt = conn.createStatement();

			String sql = "select * from Car order by idx";

			// 결과받기
			Crs = Cstmt.executeQuery(sql);

			Clist = new ArrayList<>();
			//데이터를 Car 객체로 생성 (list)
			while(Crs.next()) {
				Clist.add(new Car(Crs.getInt(1),
						Crs.getString(2),
						Crs.getString(3),
						Crs.getString(4),
						Crs.getInt(5),
						Crs.getInt(6),
						Crs.getString(7),
						Crs.getString(8)
						));
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {

			if(Crs != null) {
				try {
					Cstmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return Clist;
	}
	// 데이터 저장
	// 사용자에게 받은데이터 -> Car 객체

	int insertCar(Connection conn, Car car) {

		int result = 0;
		// 전달받은 데이터를 테이블에 저장(결과 값 반환)

		PreparedStatement pstmt = null;

		try {
			String sql = 
					"insert into Car values (car_cCode_SEQ.nextval,?,?,?,?,?,?,0)";

			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, car.getCarnumber());
			pstmt.setString(2, car.getCarname());
			pstmt.setString(3, car.getCarsize());
			pstmt.setInt(4, car.getCarseat());
			pstmt.setInt(5, car.getCaryear());
			pstmt.setString(6, car.getFuel());
			
			result = pstmt.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if(pstmt != null) {
				try {
					pstmt.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}


		return result;
	}

	
	// 데이터 수정
	
	int editCar(Connection conn, Car car) {
		
		int result = 0;
		
		//전달받은 Car객체의 데이터로 테이블에 저장 -> 결과값 반환
		PreparedStatement Cpstmt = null;
		try {
		String sql = 
				"update car set carnumber=?,carname=?,carsize=?,carseat=?,caryear=?,fuel=? ";		
	
			Cpstmt = conn.prepareStatement(sql);
			Cpstmt.setString(1, car.getCarnumber());
			Cpstmt.setString(2, car.getCarname());
			Cpstmt.setString(3, car.getCarsize());
			Cpstmt.setInt(4, car.getCarseat());
			Cpstmt.setInt(5, car.getCaryear());
			Cpstmt.setString(6, car.getFuel());
			
			result = Cpstmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if(Cpstmt != null) {
				try {
					Cpstmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return result;
	}
	
	// 테이블 데이터 삭제
	// 사용자한테 코드번호 받아서 처리
	int deleteCar(Connection conn, int carnumber) {
		
		int result = 0;
		
		// 데이터베이스 처리
		PreparedStatement Cpstmt = null;
		
		
		String sql = "delete from Car where carnumber=?";
		
		try {
			Cpstmt = conn.prepareStatement(sql);
			Cpstmt.setInt(1, carnumber);
			
			result = Cpstmt.executeUpdate();			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if(Cpstmt != null) {
				try {
					Cpstmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}				
			}
		}		
		return result;
	}

	// 자동차 대여
	int rentCar(Connection conn, String rent, String carnumber) {
		// 원래는 boolean 타입을 사용하여 차량번호만 받아 대여 상태를 표시하고 싶었지만
		// sql에서 boolean타입을 처리하는법과 대여 메소드를 만드는 법을 해결하지 못하여
		// 사용자에게 0 과1 을 입력 받음으로 자동차의 대여현황이 변화는 방법으로 선회하였습니다.
		int result = 0;

		//전달받은 Car객체의 데이터로 테이블에 저장 -> 결과값 반환
		PreparedStatement Cpstmt = null;
		try {
			String sql = 
					"update car set rent=? where carnumber=? ";	 // 

			Cpstmt = conn.prepareStatement(sql);
			Cpstmt.setString(1, rent);
			Cpstmt.setString(2, carnumber);

			result = Cpstmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if(Cpstmt != null) {
				try {
					Cpstmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return result;
	}

	// 자동차 반납
	int returnCar(Connection conn, String rent, String carnumber) {

		int result = 0;

		//전달받은 Car객체의 데이터로 테이블에 저장 -> 결과값 반환
		PreparedStatement Cpstmt = null;
		try {
			String sql = 
					"update car set rent=? where carnumber=? ";		

			Cpstmt = conn.prepareStatement(sql);
			Cpstmt.setString(1, rent);
			Cpstmt.setString(2, carnumber);

			result = Cpstmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if(Cpstmt != null) {
				try {
					Cpstmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return result;
	}

	// 렌트 중인 차량 목록
	ArrayList<Car> rentList(Connection conn){

		ArrayList<Car> Clist = null;

		//DB select결과를 Clist에저장
		Statement Cstmt = null;
		ResultSet Crs = null;


		try {
			Cstmt = conn.createStatement();

			String sql = "select * from Car where rent = '1' order by carcode";

			// 결과받기
			Crs = Cstmt.executeQuery(sql);
			Clist = new ArrayList<>();
			//데이터를 Car 객체로 생성 (list)
			while(Crs.next()) {
				Clist.add(new Car(Crs.getInt(1),
						Crs.getString(2),
						Crs.getString(3),
						Crs.getString(4),
						Crs.getInt(5),
						Crs.getInt(6),
						Crs.getString(7),
						Crs.getString(8)));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if(Crs != null) {
				try {
					Cstmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return Clist;
	}

	ArrayList<Car> availableList(Connection conn){

		ArrayList<Car> Clist = null;

		//DB select결과를 Clist에저장
		Statement Cstmt = null;
		ResultSet Crs = null;

		try {
			Cstmt = conn.createStatement();

			String sql = "select * from Car where rent = '0' order by carcode";

			// 결과받기
			Crs = Cstmt.executeQuery(sql);

			Clist = new ArrayList<>();
			//데이터를 Car 객체로 생성 (list)
			while(Crs.next()) {
				Clist.add(new Car(Crs.getInt(1),
						Crs.getString(2),
						Crs.getString(3),
						Crs.getString(4),
						Crs.getInt(5),
						Crs.getInt(6),
						Crs.getString(7),
						Crs.getString(8)));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {

			if(Crs != null) {
				try {
					Cstmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return Clist;
	}
	
	
}

