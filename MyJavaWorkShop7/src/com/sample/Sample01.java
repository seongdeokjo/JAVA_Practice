package com.sample;
class MyClass {
	int a; //  0���� �ʱ�ȭ
	int a1 = 10; //10���� �ʱ�ȭ
	MyClass() {
	//	a1= 20;
		System.out.println(a1);
	}
	static int b;
	static { //static �ʱ�ȭ ���� 
	b = 20;
	}
}
class MyClass2{ 
	MyClass2() {System.out.println("default Constructor");}
	static {System.out.println("staic Constructor");} //ó�� �ѹ��� ��� �ȴ�.
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
