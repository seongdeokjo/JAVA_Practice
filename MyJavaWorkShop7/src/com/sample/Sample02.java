package com.sample;
class MyClass3 {
//	int a = 1; // 기본형 변수의 명시적 초기화
	int a ;
	MyClass3() {
		a = 10; 
		System.out.println(a);
	}
}
class MyClass4 {
	static int b;
	int c;
	int count;
	static {
		b = 10;
	//	System.out.println(b);
		System.out.println("Static Initial");
	}
	{
		System.out.println("인스턴스 변수 초기화");	
	}
	MyClass4() {
		
		System.out.println(b++);
		System.out.println("Default Contructor");
		System.out.println(b);
	}
}
public class Sample02 {

	public static void main(String[] args) {
//		MyClass3 m = new MyClass3();
//		MyClass3 m1 = new MyClass3();
		MyClass4 m2 = new MyClass4();
		MyClass4 m3 = new MyClass4();

	}

}
