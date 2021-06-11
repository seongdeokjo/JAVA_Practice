package com.test;

public class Calculator {
	ICalculator calc;
	public Calculator(ICalculator calc) {
		this.calc = calc;
	}
	public int operate(int a, int b) {
		return this.calc.operate(a, b);
	}
}
