package com.test2;

public class HKTire extends Tire {

	public HKTire(String location, int maxRotation) {
		super(location, maxRotation);
	}
	//������ �޼ҵ�
	public boolean roll() {
		++accumulatedRotation;
		if(accumulatedRotation < maxRotation) {
			System.out.println(location+"Hk Tire ����:"+(maxRotation - accumulatedRotation)+ "ȸ");
			return true;
		}else {
			System.out.println("***"+ location+"HKTire��ũ***");
			return false;
		}
	}
	
}
