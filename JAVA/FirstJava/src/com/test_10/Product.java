package com.test_10;

public class Product {
	final int price;
	int bounsPoint;

	Product(int price) {
		this.price = price;
		bounsPoint = (int) (price / 10.0);
	}
}
