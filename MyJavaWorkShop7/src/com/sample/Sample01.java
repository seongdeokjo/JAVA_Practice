package com.sample;
class MyClass {
	int a; //  0으로 초기화
	int a1 = 10; //10으로 초기화
	MyClass() {
	//	a1= 20;
		System.out.println(a1);
	}
	static int b;
	static { //static 초기화 형태 
	b = 20;
	}
}
class MyClass2{ 
	MyClass2() {System.out.println("default Constructor");}
	static {System.out.println("staic Constructor");} //처음 한번만 출력 된다.
	}

public class Sample01 {
	public static void main(String[] args) {
		MyClass m = new MyClass();
	System.out.println(m.a);
	System.out.println(m.a1);
	MyClass l = new MyClass();
	System.out.println("b = "+MyClass.b);
	System.out.println(MyClass.b);
	MyClass2 m3 = new MyClass2();
	MyClass2 m4 = new MyClass2();
	
	}
}
