package com.test1;
class Ex1 extends Exception {
	Ex1(String msg) {
		super(msg);
	}
}
class Ex2 extends Exception {
	Ex2(String msg)	{
		super(msg);
	}
}
class MyClass {
	MyClass(int a) throws Ex1{
		if(a == 0) {
			throw new Ex1("a == 0");
		}
		
	}
	void myMethod(int b) throws Ex2 {
		if(b ==100) {
			throw new Ex2("b == 100");
		}
	}
}
public class Sample06 {

	public static void main(String[] args) {
		try {
			MyClass c = new MyClass(10);
			c.myMethod(100);
		} catch (Ex1 e) {
			System.out.println(e.getMessage());
		} catch (Ex2 e) {
			System.out.println(e.getMessage());
		}
	}

}
