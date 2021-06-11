package com.test01;
class A {
	 protected int a; //접근하는게 상속받은 멤버들만 사용가능하게만 쓰고 싶을때 
	 
}
class B extends A {
		
}
public class Sample05 {
	public static void main(String[] args) {
		B b = new B();
		b.a = 10;
		
	}
}
