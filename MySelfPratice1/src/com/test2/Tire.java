package com.test2;

public class Tire {
	public int maxRotation; // 최대 회전수[타이어 수명]
	public int accumulatedRotation; // 누적 회전수
	public String location; // 타이어의 위치
	
	public Tire(String location, int maxRotation) {
		this.location = location;
		this.maxRotation = maxRotation;
	}
	public boolean roll() {
		++accumulatedRotation; //누적 회전수1증가
		if(accumulatedRotation<maxRotation) { //정상 회전 (누적<최대)일 경우 실행 
			System.out.println(location+"tire 수명:"+(maxRotation-accumulatedRotation)+"회");
			return true;
		}else { // 펑크 (누적 ==회전) 일 경우 실행 
			System.out.println("***"+ location+"tire펑크***");
			return false;
		}
	}
}
