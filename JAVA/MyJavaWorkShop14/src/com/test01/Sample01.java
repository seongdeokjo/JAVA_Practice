package com.test01;

import java.util.*;

class Animal {
	void breathing() {
		System.out.println("Animal");
	}
}
class Dog extends Animal {
	void breathing() {
		System.out.println("Dog");
	}
}
public class Sample01 {
	static void testMethod(List<? extends Animal> list) {
		for(Animal a : list) {
			a.breathing();
		}
	}
	public static void main(String[] args) {
		testMethod(new ArrayList<Animal>());
		List<Dog> dog = new ArrayList<Dog>();
		dog.add(new Dog());
		dog.add(new Dog());
		testMethod(dog);
		List<Animal> animal = new ArrayList<>();
		animal.add(new Dog());
		animal.add(new Animal());
		
	}
}
