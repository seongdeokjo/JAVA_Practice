package com.test;

public class Sample01 {

	public static void main(String[] args) {
	Calculator calc = new Calculator(new Plus());
	System.out.println(calc.operate(1, 2));
	Calculator calc2 = new Calculator(new Minus());
	System.out.println(calc2.operate(1, 2));
	
	
//		Calulator calc = new Calculator(new Minus());
//		Calc.operate(1,2);
//		ICalculator c = new Plus();
//		ICalculator c1 = new Minus();
//		int ret = c.operate(1, 2);
//		System.out.println(ret);
//		int ret1 = c1.operate(1, 2);
//		System.out.println(ret1);
		
	}

}
