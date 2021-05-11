package com.workshop;

class Cat{
	String name;
	void meowing() {
		System.out.println(name);
	}
	
}

public class Sample14 {
	static void test(int x) { //int x = a;
		System.out.println(x);
	}
	static void test2(Cat c) { //Cat c = cat;
		c.meowing();
	} 
	public static void main(String[] args) {
		int a = 10;
		test(a);
		Cat cat = new Cat(); 
		cat.name = "³×·Î";
		test2(cat);
	}
}
