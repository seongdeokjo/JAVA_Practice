package ws1.java2.controller;

import ws1.java2.entity.*;
import java.util.Arrays;

public class VehicleManager {

	Vehicle[] vehicleArr;

	public VehicleManager() {
		// �̸޼���ȿ��� �ʱ�ȭ�ǰ� �и�

		vehicleArr = new Vehicle[7];
		vehicleArr[0] = new Airplane("����747", 1300, 300, 4);
		vehicleArr[1] = new Airplane("F-15", 1600, 1, 1);
		vehicleArr[2] = new Car("�׷���", 180, 5, 10);
		vehicleArr[3] = new Car("����ũ", 130, 4, 15);
		vehicleArr[4] = new Car("��Ÿ����", 150, 10, 11);
		vehicleArr[5] = new Ship("ũ����2", 30, 400, 35000);
		vehicleArr[6] = new Ship("��ƿ����", 25, 150, 15000);
	}

	public void displayVehicles(String input) {
		System.out.println(input);

		for (int i = 0; i < vehicleArr.length; i++) {
			vehicleArr[i].displayInfo(); // �������̵�� �޼ҵ尡 ��µ�
			vehicleArr[i].setAvailable(true);
		}

		System.out.println();
	}
<<<<<<< HEAD
	//�迭�� ����Ǿ� �ִ� modelname �� ������������ ������ �����ϵ��� 
	//���� for���� ����� �ڵ带 �ۼ��Ѵ�. 
	public void sortByModelName(String name) {
//		System.out.println(name);
//		vehicleArr = new Vehicle;
//		
//		for (int i = 0; i < vehicleArr.length(); i++) {
//			for(int j = i+1; j < vehicleArr.length; j++) {
//				if(vehicleArr[i] < vehicleArr[j]) {
//					
//				}
//			}
//		}
=======

	// �迭�� ����Ǿ� �ִ� modelname �� ������������ ������ �����ϵ���
	// ���� for���� ����� �ڵ带 �ۼ��Ѵ�.
	public void sortByModelName(String result) {
		System.out.println(result);

		for (int i = 0; i < vehicleArr.length; i++) {
			for (int j = i + 1; j < vehicleArr.length; j++) {

			}
		}
>>>>>>> e63fdffb62c4da06ea739f21cc74794b436ab200

		Arrays.sort(vehicleArr);
		for (Vehicle i1 : vehicleArr) {
			System.out.println("[" + i1.print() + "]");
		}

		System.out.println();

		// for (int i = 0; i < vehicleArr.length(); i++) {
		// for(int j = i+1; j < vehicleArr.length; j++) {
		// if(vehicleArr[i] < vehicleArr[j]) {
		//
		// }
	}
}
// }
//
// System.out.println();

// }
