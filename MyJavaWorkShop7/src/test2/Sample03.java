package test2;

public class Sample03 {

	public static void main(String[] args) {
		Car car = new Car();
		Car car2 = null;
		FireEngine fe = null;
		
		car.drive();
//		fe = (FireEngine)car; //���� class car�� ��ü�� �����Ǿ��� ������ 
//		fe.drive();
		car2 = fe;
		car2.drive();
		

	}

}
