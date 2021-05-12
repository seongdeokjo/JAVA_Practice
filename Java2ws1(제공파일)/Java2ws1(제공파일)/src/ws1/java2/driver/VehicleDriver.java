package ws1.java2.driver;
//구동 클래스
import ws1.java2.controller.*;

public class VehicleDriver {
	public static void main(String[] args) {
		VehicleManager vm = new VehicleManager();
		vm.displayVehicles(">> 재고 목록 <<");
		vm.sortByModelName("오름차순 정렬");
		
	}
}
