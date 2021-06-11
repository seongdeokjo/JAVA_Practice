package com.pr6;

public interface MyA {
	default void method1() {
		System.out.println("method01() in MyA");
	}
	default void method2() {
		System.out.println("method2() in MYA");
	}
	static void staticMethod() {
		System.out.println("staticMethid() in MyA");
	}
}
