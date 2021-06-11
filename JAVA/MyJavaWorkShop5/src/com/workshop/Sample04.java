package com.workshop;
class Dog {
	String name;
	String color;
	void barking() {
		System.out.println("이름이"
						+ name + "이고 색깔이" 
						+ color + "인 강아지가 짖는다.");
	}
}
public class Sample04 {

	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.name = "메리";
		dog.color = "흰색";
		dog.barking();
		Dog dog2 = dog;
		dog2.barking();
		
	}
}
