package com.test01;
public class Calculator {
	public int add(int a, int b) {
		return(a + b);
	}
	public int sub(int a, int b) {
		return(a - b);
	}
	public int multi(int a, int b) {
		return(a * b);
	}
	public  double divide(int a, int b) {
			return(a / b);
	}
	public double circleRadius(double r) { //원의 둘레
		return 2 * Math.PI * r;
	}
	public double circleArea(double r) { // 원의 넓이 
		return Math.PI * r * r;
	}
}