package test2;

public class Sample03 {

	public static void main(String[] args) {
		Car car = new Car();
		Car car2 = null;
		FireEngine fe = null;
		
		car.drive();
//		fe = (FireEngine)car; //상위 class car의 객체가 생성되었기 때문에 
//		fe.drive();
		car2 = fe;
		car2.drive();
		

	}

}
