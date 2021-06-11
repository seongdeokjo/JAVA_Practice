package com.test2;

public class HKTire extends Tire {

	public HKTire(String location, int maxRotation) {
		super(location, maxRotation);
	}
	//재정의 메소드
	public boolean roll() {
		++accumulatedRotation;
		if(accumulatedRotation < maxRotation) {
			System.out.println(location+"Hk Tire 수명:"+(maxRotation - accumulatedRotation)+ "회");
			return true;
		}else {
			System.out.println("***"+ location+"HKTire펑크***");
			return false;
		}
	}
	
}
