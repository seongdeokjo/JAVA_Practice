package com.workshop;
class Dog2 {
	String name;
	String color;
	void barking() {
		System.out.println("�̸���"
						+ name + "�̰� ������" 
						+ color + "�� �������� ¢�´�.");
	}
}
public class Sample08 {
	public static void main(String[] args) {
		Dog2 dog = new Dog2();
		Dog2 dog2 = new Dog2();
		Dog2 dog3 = new Dog2();
		
		Dog2[] dogs = new Dog2[3];
		dogs[0] = new Dog2();// 
		System.out.println(dogs[0].name);
		Dog2[] dogs2 = {
				new Dog2(),
				new Dog2(),
				new Dog2()
		};
		
		

	}
}
