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

	// 차량 정보 리스트 출력
	public void carList() {
		Connection conn = null;

		// 2.연결
		String jdbcUrl = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "hr";
		String pw = "tiger";

		try {
			conn = DriverManager.getConnection(jdbcUrl, user, pw);

			List<Car> list = dao.getCarList(conn);

			System.out.println("자동차 정보 리스트");
			System.out.println("------------------------------------------------------------------");
			System.out.println("차코드 \t 차번호 \t 차이름 \t 차크기 \t 탑승인원 \t 연식 \t 연료 \t");
			System.out.println("------------------------------------------------------------------");

			for (Car car : list) {
				System.out.printf("%d \t %s \t %s \t %s \t %d \t %d \t %s \n", 
						car.getCarcode(), 
						car.getCarnumber(),
						car.getCarname(),
						car.getCarsize(), 
						car.getCarseat(), 
						car.getCaryear(), 
						car.getFuel());
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	// 차량 등록
	public void inputCar() {
		Connection conn = null;

		// 2.연결

		String jdbcUrl = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "hr";
		String pw = "tiger";

		try {
			conn = DriverManager.getConnection(jdbcUrl, user, pw);

			System.out.println("차 정보를 입력합니다.");
			System.out.println("차번호 차이름 차크기 탑승인원 연식 연료 0 형식으로 입력해주세요.");
			System.out.println("예시) 123456 sonata middle 5 2020 휘발유 0");
			String inputData = scan.nextLine();
			String[] carData = inputData.split(" ");
			// car 생성자 : car 테이블
			Car car = new Car(
					0, 
					carData[0], 
					carData[1], 
					carData[2], 
					Integer.parseInt(carData[3]),
					Integer.parseInt(carData[4]),
					carData[5],
					carData[6]
							);

			int result = dao.insertCar(conn, car);

			if (result > 0) {
				System.out.println("새로운 차량이 등록되었습니다.");
			} else {
				System.out.println("등록이 실패되었습니다.");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	// 차량 삭제
	public void deleteCar() {
		Connection conn = null;

		// 2.연결

		String jdbcUrl = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "hr";
		String pw = "tiger";

		try {
			conn = DriverManager.getConnection(jdbcUrl, user, pw);

			carList();

			System.out.println("삭제를 원하는 차량 번호를 입력하세요.");
			int carreg = Integer.parseInt(scan.nextLine());

			int result = dao.deleteCar(conn, carreg);

			if (result > 0) {
				System.out.println("차량이 삭제되었습니다.");
			} else {
				System.out.println("차량의 정보가 없습니다.");
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	// 자동차 대여
public	void rentCar() {
		Connection conn = null;
		
		String OOP1 = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "hr";
		String pw = "tiger";
		
		try {
			conn = DriverManager.getConnection(OOP1,user,pw);
			availableList();
			System.out.println("대여할 차량번호 입력");
			String carnumber = scan.nextLine();
			System.out.println("대여할거면  1 을 입력");
			String rent = scan.nextLine();
			//2021 06.24
		//예외 처리 추가 1이외에 다른 데이터가 들어올시 예외처리 
		//문제점 : 차번호 입력시 db에 없는 값이 들어와도 대여완료가 출력
						
			if(rent.equals("1")) {
			int result = dao.rentCar(conn, rent, carnumber);
						
				if(result > 0) {
					System.out.println("대여가 완료 되었습니다.");
				}else {
					System.out.println("번호를 다시 입력하세요.");
				} 
			}else {
				System.out.println("반드시 1을 입력하세요.");
				return;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	// 자동차 반납
public	void returnCar() {
		Connection conn = null;
		
		String OOP1 = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "hr";
		String pw = "tiger";
		
		try {
			conn = DriverManager.getConnection(OOP1,user,pw);
			rentList();
			System.out.println("반납할 차량번호 입력");
			String carnumber = scan.nextLine();
			System.out.println("반납할거면 0 을 입력");
			String rent = scan.nextLine();
			
			if(rent.equals("0")) {
				int result = dao.returnCar(conn, rent, carnumber);
		
				if(result > 0) {
					System.out.println("반납 완료");
				} else  {
					System.out.println("반납 실패");
				}
			}else {
				System.out.println("반드시 0을 입력하세요.");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	// 렌트 중인 차량 목록
	//데이터 삭제
	// 사용자한테 idx입력받아 데이터삭제
	
	
public	void rentList() {
		Connection conn = null;
		String OOP1 = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "hr";
		String pw = "tiger";
		
		
		try {
			conn = DriverManager.getConnection(OOP1, user, pw);
			
			List<Car> Clist = dao.rentList(conn);
			
			System.out.println("렌트 중인 차량 목록");
			System.out.println("------------------");
			System.out.println("코드번호\t차번호\t차이름 \t차크기\t탑승인원 \t연식\t연료");
			System.out.println("--------------------------------------------------");
			
			for(Car car : Clist) {
				System.out.printf("%d\t%s\t%s\t%s\t%d\t%d\t%s\n",
				car.getCarcode(),
				car.getCarnumber(),
				car.getCarname(),
				car.getCarsize(),
				car.getCarseat(),
				car.getCaryear(),
				car.getFuel());
			}
			
			System.out.println("------------------------------------------");
							
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

	// 이용 가능 차량 목록
	
public	void availableList() {
		Connection conn = null;
		String OOP1 = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "hr";
		String pw = "tiger";
				
		try {
			conn = DriverManager.getConnection(OOP1, user, pw);
			
			List<Car> Clist = dao.availableList(conn);
			
			System.out.println("대여 가능 차량 목록");
			System.out.println("--------------------------------------------------");
			System.out.println("코드번호\t차번호\t차이름 \t차크기\t탑승인원 \t연식\t연료");
			System.out.println("--------------------------------------------------");
			
			for(Car car : Clist) {
				System.out.printf("%d\t%s\t%s\t%s\t%d\t%d\t%s\n",
				car.getCarcode(),
				car.getCarnumber(),
				car.getCarname(),
				car.getCarsize(),
				car.getCarseat(),
				car.getCaryear(),
				car.getFuel());
			}
			
			System.out.println("--------------------------------------------------");
							
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
}