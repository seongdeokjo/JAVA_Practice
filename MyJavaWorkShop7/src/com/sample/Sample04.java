package com.sample;
class Animal { //���� Ŭ����
	void breathing() {
		System.out.println("Animal Breathig");
	}
}
class Dog extends Animal { //���� Ŭ����
	void baking() {
		System.out.println("Dog barking");
	}
}
class Cat extends Animal{//���� Ŭ���� / ���� :Dog Ŭ����
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
