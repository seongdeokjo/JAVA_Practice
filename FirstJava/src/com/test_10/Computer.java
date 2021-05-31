package com.test_10;

public class Computer extends Product {

	Computer(int price) {
		super(price);
	}
	@Override
	public String toString() {
		return "Computer";
//		return "Computer [price=" + price + ", bounsPoint=" + bounsPoint + "]";
	}
}
