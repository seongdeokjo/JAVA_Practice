package com.test03;
class A {}
class B extends A {}
class C extends B {}
class D extends A {}
public class Sample04 {
	public static void main(String[] args) {
//		B b = new B();
//		A a = b;
//		
//		C c = (C)a;
//		B b1 = new B();
//		C c2 = (C)b1;
		
		B b = new B();
		if(b instanceof B) {
			System.out.println("B");
		}
		if(b instanceof A) {
			System.out.println("A");
		}
		if(b instanceof C) {
			System.out.println("C");
		}
		A a= new A();
		if(a instanceof B) {
			System.out.println("B");
		}
		D d = new D();
		if(d instanceof A) {
			System.out.println("A");
		}
//		상속관계가 아닌 형제관계 이기 때문에 미리오류 발생 시킨다.
//		if(d instanceof B) { 
//			System.out.println("B");
		}
	}

