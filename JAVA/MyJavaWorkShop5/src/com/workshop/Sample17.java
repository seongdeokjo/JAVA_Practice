package com.workshop;

public class Sample17 {
//	static int add(int x, int y) {
//		return x + y;
//	}
//	static int add2(int x, int y, int z) {
//		return x + y + z;
//	}
	// Overloading 오버로딩 
	static int add(int a , int b) {return a + b;}
	static int add(int a, int b, int c) { return a + b + c;}
	static String add(String a, String b) {return a + b;}
	public static void main(String[] args) {
	System.out.println(add(1,2));	
		add(1,2,3);
		add("hi","de");
		
	}

}
