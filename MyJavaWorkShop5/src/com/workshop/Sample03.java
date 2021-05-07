package com.workshop;

class MyClass{
	int myVar1;
	static int myvar2; // static의 사용 
}

public class Sample03 {
	// 같은 클래스에서는 생략이 가능하다.(static) int myVar3;
	// Sample03.myVar3 = 10;
	public static void main(String[] args) {
		MyClass.myvar2 = 20;
		System.out.println(MyClass.myvar2);
	//	myVar3 = 20;
	}
}
