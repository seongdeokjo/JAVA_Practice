package com.test01;

import java.util.*;

abstract class Animal2 {
	abstract void breathing();
}

class Dog3 extends Animal2 {

	@Override
	void breathing() {
		System.out.println("Dog breathing");
	}

}

class Cat3 extends Animal2 {

	@Override
	void breathing() {
		System.out.println("cat breathing");
	}

}

public class Sample10 {
	// 타입캐스팅에대한 변경을 최소화 하기 위해
	static void printAnimal(List<? extends Animal2> animals) {
		for (Animal2 a : animals) {
			a.breathing();
		}
	}

	public static void main(String[] args) {
		ArrayList<Dog3> dog3 = new ArrayList<>();
		dog3.add(new Dog3());
		dog3.add(new Dog3());
		// printAnimal(dog3);
		ArrayList<Object> obj = new ArrayList<>();
//		printAnimal(obj);
	}

}
