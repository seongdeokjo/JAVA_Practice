package ws1.java2.driver;

import java.util.Scanner;

//���� Ŭ����
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
				System.out.println("������ modelName�� �˻��ϼ���.");
				name1 = scan.next();
				
				System.out.println("���� �����Ͻðڽ��ϱ�? 1.yes 2.no");
				int input = scan.nextInt();
				scan.hasNextLine();
				switch(input) {
				case 1:
					vm.delete(name1);
					System.out.println(name1+" �� �����Ǿ����ϴ�.");
					break;
				case 2:
					System.out.println("�������� �ʾҽ��ϴ�.");
					continue;
				}
				
			case 4 :
				vm.sortBymodelName("�������� ����");
				break;
			case 9 : 
				System.out.println("���α׷� ����");
				break;
//				vm.displayVehicles1();
			}
		}
	}

	public static void print() {
		System.out.println();
		System.out.println("##################<�޴�>###################");
		System.out.println("	 <1.show vehicle>		     ");
		System.out.println(" 	 <2.add vehicle>			 ");
		System.out.println(" 	 <3.delete vehicle>			 ");
		System.out.println(" 	 <4.sort vehicle>			 ");
		System.out.println(" 	 <9.stop vehicle>	 		 ");
		System.out.print(">> �޴� : ");
	}
}
