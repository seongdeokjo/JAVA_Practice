package ws1.java2.driver;
//���� Ŭ����
import ws1.java2.controller.*;


public class VehicleDriver {
	public static void main(String[] args) {
		VehicleManager vm = new VehicleManager();
		vm.displayVehicles(">> ��� ��� <<");
		
		vm.sortByModelName("�������� ����");
		
	
	}
}
