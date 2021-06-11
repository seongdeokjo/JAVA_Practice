package com.sample;
class Animal { //상위 클래스
	void breathing() {
		System.out.println("Animal Breathig");
	}
}
class Dog extends Animal { //하위 클래스
	void baking() {
		System.out.println("Dog barking");
	}
}
class Cat extends Animal{//하위 클래스 / 형제 :Dog 클래스
	void meowing() {
		System.out.println("Cat Meowing");
	}
}
public class Sample04 {
	public static void main(String[] args) {
		Dog m = new Dog();
		m.breathing();
		m.baking();
		Cat m1 = new Cat();
		m1.breathing();
		m1.meowing();
	}
}
