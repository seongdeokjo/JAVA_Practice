package com.test01;

import java.lang.reflect.Method;

class MyClass {
	String name;
	void myMethod() {}
}
public class Sample04 {

	public static void main(String[] args) {
		MyClass obj = new MyClass();
		Class c = obj.getClass();
		System.out.println(c.getName()+", "+ c.getSimpleName());
		Method[] methods = c.getMethods();
		for(int inx = 0; inx <methods.length; inx++) {
			System.out.println(methods[inx].getName());
		}
	}
}
