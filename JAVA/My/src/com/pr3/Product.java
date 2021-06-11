package com.pr3;

public class Product {
	int price;
	int bounsPoint;
	Product(int price) {
		this.price = price;
		bounsPoint = (int)(price/10.0);
	}
}
