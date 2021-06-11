package com.test2;
// class 접근자 
// public = 모든 패키지에서 사용가능
// default = 같은 패키지안에서만 사용가능 
public class MyClass {
	public int add(int a, int b) {
		return a + b;
	}
	int add(int a, int b, int c) {
		return a + b;
	}
	private String add(String s, String t) {
		return s + t;
	}
	private void testMethod() {
		add("안녕하세요","이순신");
	}
}
