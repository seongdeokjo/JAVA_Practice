package com.test1;
class Car {
	String company = "����";
	String name ;
	String color;
	int maxSpeed;
	Car(){
		
	}
	Car(String name){ // 
		this(name,"����",200); // Ŭ������ �ٸ� �����ڸ� ȣ���ϱ� ���� this()�ڵ带 ����Ͽ� name�� �����ڸ� ���Ͽ� �ʱ�ȭ�ϰ� 
								// color,maxSpeed�� ������ ���ο��� ������ �� �Ǵ� ���� ������ �ʱ�ȭ ��Ų��.
	}
	Car(String name,String color){
		this(name,color,250);
	}
	Car(String name, String color, int maxSpeed) {
		this.name = name;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
}
public class Sample08 {

	public static void main(String[] args) {
		Car car1 = new Car();
		System.out.println("car1.company ="+car1.company);
		System.out.println();
		Car car2 = new Car("suv");
		System.out.println("car2.company+car2.name="+car2.company+car2.name);
		Car car3 = new Car("suv","�Ķ�");
		System.out.println("car3.company+car3.name+car3.color="+car3.company+car3.name+car3.color);
		Car car4 = new Car("suv","�Ķ�",250);
		System.out.println("car4.company+car4.name+car4.color="+car4.company+car4.name+car4.color+car4.maxSpeed);
	}

}
