package ws1.java2.driver;
import java.util.Scanner;
//���� Ŭ����
import ws1.java2.controller.VehicleManager;
public class VehicleDriver {
	public static void main(String[] args) {
		VehicleManager vm = new VehicleManager();
		Scanner scan = new Scanner(System.in);
		// vm.displayVehicles1();
		String name1;
		vm.displayVehicles2();
		System.out.println("������ �̸��� �ۼ����ּ���.>>");
		name1 = scan.nextLine();
		vm.delete(name1);
		vm.sortBymodelName("�������� ����");
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