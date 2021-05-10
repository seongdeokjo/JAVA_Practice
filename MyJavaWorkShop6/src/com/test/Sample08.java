package com.test;
class Car3 {
	String color;
	String gearType;
	int door;
	Car3() {
		this("white","auto", 4);
	}
	Car3(Car3 c) {
		color = c.color;
		gearType = c.gearType;
		door = c.door;
	}
	Car3(String color, String gearType, int door) {
		this.color = color;
		this.gearType = gearType;
		this.door = door;
	}
}
public class Sample08 {

	public static void main(String[] args) {
		Car3 c1 = new Car3();
		Car3 c2 = new Car3(c1);
		System.out.println(c1.color + c1.gearType+ c1.door);
		System.out.println(c2.color + c2.gearType+ c2.door);
		
		c1.door = 100;
		System.out.println(c1.color + c1.gearType+ c1.door);
		System.out.println(c2.color + c2.gearType+ c2.door);
		

	}

}
