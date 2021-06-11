package com.test3;


class Animal {
	void breathing() {
		System.out.println("Animal breathing");
	}
}
class Dog extends Animal {
	void breathing() {
		System.out.println("Dog breathing");
	}
}
class Cat extends Animal {
	void breathing() {
		System.out.println("Cat breathing");
	}
}
public class Sample06 {

	public static void main(String[] args) {
		Animal[] animals = new Animal[3];
		animals[0] = new Animal();
		animals[1] = new Dog();
		animals[2] = new Cat();
		for(Animal a : animals) {
			a.breathing();
		}
		
	}

}
