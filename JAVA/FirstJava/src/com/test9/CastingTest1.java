package com.test9;

class Car1 {
	 String color;
	 int door;
	 void drvie() {
		 System.out.println("drive, Brrr");
	 }
	 void stop() {
		 System.out.println("stop!");
	 }
}
class FireEngine extends Car1{
	void water() {
		System.out.println("water");
	}
}
class Ambulance extends Car1 {
	void siren() {
		System.out.println("siren~~~~");
	}
}
class CastingTest1{
	public static void main(String args[]) {
		Car1 car = null;
		Car1 car2 = null;
		FireEngine fe = new FireEngine();
		FireEngine fe2 = null;
		Ambulance am = new Ambulance();
		Ambulance am2 = new Ambulance();
		
		fe.water();
		car = fe; // car=(Car)fe;에서 형변환이 생략된 형태다. 자손타입 -> 조상타입
//		car.water(); Car타입의 참조변수로는  water()를 호출 할 수 없다.
		fe2 =(FireEngine)car; //자손타입 <- 조상타입
		fe2.water();
		
		am.siren();
		car2 = am ;
		am2 = (Ambulance)car2;
		am2.siren();
		
		
	}
}
