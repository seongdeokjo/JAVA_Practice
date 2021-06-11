package com.test;

public class Plus implements ICalculator {
	@Override
	public int operate(int x, int y) {
		return x + y;
	}

}
