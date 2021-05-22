package com.test1;
class Car {
	String company = "현대";
	String name ;
	String color;
	int maxSpeed;
	Car(){
		
	}
	Car(String name){ // 
		this(name,"은색",200); // 클래스의 다른 생성자를 호출하기 위해 this()코드를 사용하여 name은 생성자를 통하여 초기화하고 
								// color,maxSpeed는 생성자 내부에서 임의의 값 또는 계산된 값으로 초기화 시킨다.
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
		Car car3 = new Car("suv","파랑");
		System.out.println("car3.company+car3.name+car3.color="+car3.company+car3.name+car3.color);
		Car car4 = new Car("suv","파랑",250);
		System.out.println("car4.company+car4.name+car4.color="+car4.company+car4.name+car4.color+car4.maxSpeed);
	}

}
