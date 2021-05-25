package com.test01;
public class Calculator1 implements Calculator {
	@Override
	public long add(long n1, long n2) {
		return n1 + n2;
	}
	@Override
	public long substract(long n1, long n2) {
		return n1 - n2;
	}
	@Override
	public long multiply(long n1, long n2) {
		return n1 * n2;
	}
	@Override
	public double divide(double n1, double n2) {
		return n1 / n2;
	}	
	public double circleRadius(double r) { //원의 둘레
		return 2 * Math.PI * r;
	}
	public double circleArea(double r) { // 원의 넓이 
		return Math.PI * r * r;
	}
}