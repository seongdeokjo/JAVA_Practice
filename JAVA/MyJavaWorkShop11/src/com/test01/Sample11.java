package com.test01;

class CustomWrapperType {
	private int i;

	CustomWrapperType(int i) {
		this.i = i;
	}

	public int getValue() {
		return this.i;
	}

	public void setValue(int i) {
		this.i = i;
	}

	public String toString() {
		return Integer.toString(i);
	}
}

public class Sample11 {

	public static void main(String[] args) {
		CustomWrapperType c = new CustomWrapperType(10);
		System.out.println(c);

		int a = 10; // value type
		Object b = a; // reference type
		int c2 = (int) b; // reference type - > value type
		System.out.println(a);
		System.out.println(c2);
	}

}
