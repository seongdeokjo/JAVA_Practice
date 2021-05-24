package com.test01;

public class Calculator {
	void add(int a, int b) {
		System.out.println(a + b);
	}
	void sub(int a, int b) {
		System.out.println(a - b);
	}
	void multi(int a, int b) {
		System.out.println(a * b);
	}
	void divide(int a, int b) {
		System.out.println(a / b);
	}
	public double circleRadius(double r) { //원의 둘레
		return 2 * Math.PI * r;
	}
	public double circleArea(double r) { // 원의 넓이 
		return Math.PI * r * r;
	}
}
