package ws1.java2.controller;

import ws1.java2.entity.*;

public class VehicleManager {

	Vehicle[] vehicleArr;
	

	public VehicleManager() {
		//이메서드안에서 초기화되게 분리 
		vehicleArr = new Vehicle[7];
		vehicleArr[0] = new Airplane("보잉747", 1300, 300, 4);
		vehicleArr[1] = new Airplane("F-15", 1600, 1, 1);
		vehicleArr[2] = new Car("그랜저", 180, 5, 10);
		vehicleArr[3] = new Car("스파크", 130, 4, 15);
		vehicleArr[4] = new Car("스타렉스", 150, 10, 11);
		vehicleArr[5] = new Ship("크루즈2", 30, 400, 35000);
		vehicleArr[6] = new Ship("노틸러스", 25, 150, 15000);
	}

	public void displayVehicles(String input) {
		System.out.println(input);
		
		for (int i = 0; i < vehicleArr.length; i++) {
			vehicleArr[i].displayInfo(); //오버라이드된 메소드가 출력됨 
			vehicleArr[i].setAvailable(true);
		}

		System.out.println();
	}
	//배열에 저장되어 있는 modelname 의 오름차순으로 정렬을 수행하도록 
	//이중 for문을 사용해 코드를 작성한다. 
	public void sortByModelName(String name) {
		System.out.println(name);
		vehicleArr = new Vehicle;
		
		for (int i = 0; i < vehicleArr.length(); i++) {
			for(int j = i+1; j < vehicleArr.length; j++) {
				if(vehicleArr[i] < vehicleArr[j]) {
					
				}
			}
		}

		System.out.println();

	}
}
