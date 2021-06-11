package com.pr6;

public interface MyB {
	default void method1() {
		System.out.println("method1() in MyB");
	}
	static void staticMethod() {
		System.out.println("staticMethod() in MyB");
	}
}
