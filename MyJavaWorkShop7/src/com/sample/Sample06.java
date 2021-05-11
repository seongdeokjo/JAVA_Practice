package com.sample;
class A {
	void aMethod() {
		System.out.println("aMethod in A Class");
	}
}
class B extends A {
	void aMethod() {
		System.out.println("aMethod in B Class");
	}
}
public class Sample06 {
	public static void main(String[] args) {
		B b = new B();
		b.aMethod();

	}
}
