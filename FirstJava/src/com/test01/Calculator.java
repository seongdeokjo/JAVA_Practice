package com.test01;
public class Calculator {
	public long add(int a, int b) {
		return((long)a + b);
	}
	public long sub(int a, int b) {
		return((long)a - b);
	}
	public long multi(int a, int b) {
		return((long)a * b);
	}
	public  double divide(int a, int b) {
			return((double)a / b);
	}
	public double circleRadius(double r) { //원의 둘레
		return 2 * Math.PI * r;
	}
	public double circleArea(double r) { // 원의 넓이 
		return Math.PI * r * r;
	}
}