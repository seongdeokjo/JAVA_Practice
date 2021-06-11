package com.test2;

public class CarSample {

	public static void main(String[] args) {
		Car car = new Car();
		
		for(int i = 1; i <10; i++) {
			int problemLocation = car.run();
			
			switch(problemLocation) {
			case 1:
				System.out.println("앞 왼쪽 HKTrie로 교체");
				car.frontLeftTire = new HKTire("앞 왼쪽",15);
				break;
			case 2 :
				System.out.println("앞 오른쪽 kumhoTire로 교체");
				car.frontRightTire = new KumhoTire("앞 오른쪽",13);
				break;
			case 3 :
				System.out.println("뒤 왼쪽 HKTire로 교체");
				car.backLeftTire = new HKTire("뒤 왼쪽",14);
				break;
			case 4 :
				System.out.println("뒤 오른쪽 KumhoTire로 교체");
				car.backRightTire = new KumhoTire("뒤 오른쪽",17);
				break;
			}
			System.out.println("--------------------------------");
		}
	}

}
