package com.test06;

public class Sample15 {

	public static void main(String[] args) {
		try {
			throw new ArithmeticException();
		}catch(ArithmeticException ex) {
			System.out.println("ArithmeticException");
		}
	}

}
