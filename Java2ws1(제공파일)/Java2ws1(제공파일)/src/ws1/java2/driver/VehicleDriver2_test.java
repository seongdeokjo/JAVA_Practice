package ws1.java2.driver;

import java.util.Scanner;

//구동 클래스
import ws1.java2.controller.VehicleManager;

public class VehicleDriver2_test {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		VehicleManager vm = new VehicleManager();
		// vm.displayVehicles1();
		int menu = 0;
		
		
		while (menu != 9) {
			String name1;
			print();
			menu = scan.nextInt();
			switch (menu) {
			case 1 :
				vm.displayVehicles2();
				break;
			case 2 :
				break;
			case 3 :
				System.out.println("삭제할 modelName을 검색하세요.");
				name1 = scan.next();
				
				System.out.println("정말 삭제하시겠습니까? 1.yes 2.no");
				int input = scan.nextInt();
				scan.hasNextLine();
				switch(input) {
				case 1:
					vm.delete(name1);
					System.out.println(name1+" 가 삭제되었습니다.");
					break;
				case 2:
					System.out.println("삭제되지 않았습니다.");
					continue;
				}
				
			case 4 :
				vm.sortBymodelName("오름차순 정렬");
				break;
			case 9 : 
				System.out.println("프로그램 종료");
				break;
//				vm.displayVehicles1();
			}
		}
	}

	public static void print() {
		System.out.println();
		System.out.println("##################<메뉴>###################");
		System.out.println("	 <1.show vehicle>		     ");
		System.out.println(" 	 <2.add vehicle>			 ");
		System.out.println(" 	 <3.delete vehicle>			 ");
		System.out.println(" 	 <4.sort vehicle>			 ");
		System.out.println(" 	 <9.stop vehicle>	 		 ");
		System.out.print(">> 메뉴 : ");
	}
}
