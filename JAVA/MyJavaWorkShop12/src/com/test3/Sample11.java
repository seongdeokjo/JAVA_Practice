package com.test3;

public class Sample11 {
	static class StaticClass{
		void testMethod2() {
			System.out.println("testMethod2 in StaticClass: "+b);
		}
	}
	static int b = 30;
	public static void main(String[] args) {
		Sample11 obj = new Sample11();
		Sample11.InnerClass obj2 = obj.new InnerClass();
		obj2.testMethod();
		Sample11.StaticClass st = new Sample11.StaticClass();
		st.testMethod2();
	}
	private int a = 10;
	class InnerClass{
		void testMethod() {
			System.out.println("testMethod in innerClass");
		}
	}
}
