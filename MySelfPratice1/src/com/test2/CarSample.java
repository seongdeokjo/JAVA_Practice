package com.test2;

public class CarSample {

	public static void main(String[] args) {
		Car car = new Car();
		
		for(int i = 1; i <10; i++) {
			int problemLocation = car.run();
			
			switch(problemLocation) {
			case 1:
				System.out.println("�� ���� HKTrie�� ��ü");
				car.frontLeftTire = new HKTire("�� ����",15);
				break;
			case 2 :
				System.out.println("�� ������ kumhoTire�� ��ü");
				car.frontRightTire = new KumhoTire("�� ������",13);
				break;
			case 3 :
				System.out.println("�� ���� HKTire�� ��ü");
				car.backLeftTire = new HKTire("�� ����",14);
				break;
			case 4 :
				System.out.println("�� ������ KumhoTire�� ��ü");
				car.backRightTire = new KumhoTire("�� ������",17);
				break;
			}
			System.out.println("--------------------------------");
		}
	}

}
