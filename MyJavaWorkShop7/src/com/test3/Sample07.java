package com.test3;
class A1 {
	int a;
	A1() {
		System.out.println("A default Constuctor");
	}
	A1(int a) {
		this.a = a;
		System.out.println(a + " A Cnstrctor");
	}
}
class B2 extends A1 {
	B2() {
		super(10); //상위 생성자를 가르킴
		System.out.println("B default Constuctor");
	}
}
public class Sample07 {
	public static void main(String[] args) {
		B2 b = new B2(); //상위 객체가 만들어지고 하위 객체 만들어지고 호출 
	}
}
