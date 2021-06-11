package com.test01;
class MyClass2 {
	protected int myVal;
	protected void myMethod() {
		System.out.println(this.myVal);
	}
}
class MyClass3 extends MyClass2 {
	void myMethod3() {
		super.myVal = 10;
		super.myMethod();
	}
}
public class Sample07 {

	public static void main(String[] args) {
		MyClass3 m = new MyClass3();
		m.myMethod3();
	}

}
