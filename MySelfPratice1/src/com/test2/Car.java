package com.test2;

public class Car {
	Tire frontLeftTire = new Tire("앞 왼쪽",6);
	Tire frontRightTire = new Tire("앞 오른쪽",2);
	Tire backLeftTire = new Tire("뒤 왼쪽",3);
	Tire backRightTire = new Tire("뒤 오른쪽",4);
	// 모든 타이어를 1회 회전시키기 위해 각 tire 객체의 roll()메소드를 호출, false리턴하는 roll()이 있을경우 
	// stop() 메소드를 호출하고 해당 타이어 번호를 리턴
	int run() {
		System.out.println("[자동차가 달립니다.]");
		if(frontLeftTire.roll() == false) {
			stop();
			return 1;
		}
		if(frontRightTire.roll() == false) {
			stop();
			return 2;
		}
		if(backLeftTire.roll() == false) {
			stop();
			return 3;
		}
		if(backRightTire.roll() == false) {
			stop();
			return 4;
		}
		return 0;
	}
	void stop() {
		System.out.println("[자동차가 멈춥니다.]");
	}
}
