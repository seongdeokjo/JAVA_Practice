package manager;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import car.*;

public class CarManage {
	
	private ManagerDao dao;
	private Scanner scan;
	
	public CarManage(ManagerDao dao) {
		this.dao = dao;
		scan = new Scanner(System.in);
	}
	//차량 정보 리스트 출력 
	void carList() {
		Connection conn = null;
		
		//2.연결 
		String jdbcUrl = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "hr";
		String pw = "tiger";
		
		try {
			conn = DriverManager.getConnection(jdbcUrl, user, pw);
		
			List<CarInfo> list = dao.getCarList(conn);
			
			System.out.println("자동차 정보 리스트");
			System.out.println("------------------------------------------------------------------");
			System.out.println("차번호 \t 차연식 \t 탑승인원 \t 연료 \t 차량이름 \t 차량종류 \t 차량번호");
			System.out.println("------------------------------------------------------------------");
			
			for(CarInfo car : list) {
				System.out.println("%d \t %d \t %d \t %s \t %s \t %s \t %d");
//				,car.getCarcode();
//				car.getCarYear();
//				car.getCarseat();
//				car.getCarFuel();
//				car.getCarName();
//				car.getCarSize();
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	
	//차량 등록
	void inputCar() {
		Connection conn = null;
		
		//2.연결
		
		String jdbcUrl = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "hr";
		String pw = "tiger";
		
		try {
			conn = DriverManager.getConnection(jdbcUrl, user, pw);
			
			System.out.println("차 정보를 입력합니다.");
			System.out.println("차연식 탑승인원 연료 차량이름 차량종류 차량번호 형식으로 입력해주세요.");
			System.out.println("예시) 2021 4 휘발유 그랜저 중 111111 ");
			String inputData = scan.nextLine();
			String[] carData = inputData.split(" ");
			//carInfo 생성자 : car 테이블
//			CarInfo car = new CarInfo(0,carData[0],carData[1],carData[2],carData[3],carData[4],carData[5]);
			
//			int result = dao.insertCar(conn, car);
	
//			if(result > 0) {
//				System.out.println("새로운 차량이 등록되었습니다.");
//			}else {
//				System.out.println("등록이 실패되었습니다.");
//			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
	}
	
	//차량 삭제
	void deleteCar() {
		Connection conn = null;
		
		//2.연결
		
		String jdbcUrl = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "hr";
		String pw = "tiger";
		
		try {
			conn = DriverManager.getConnection(jdbcUrl, user, pw);
		
			carList();
			
			System.out.println("삭제를 원하는 차량 번호를 입력하세요.");
			int carreg = Integer.parseInt(scan.nextLine());
			
			int result = dao.deleteCar(conn, carreg);
			
			if(result > 0) {
				System.out.println("차량이 삭제되었습니다.");
			}else {
				System.out.println("차량의 정보가 없습니다.");
			}
		
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
}
