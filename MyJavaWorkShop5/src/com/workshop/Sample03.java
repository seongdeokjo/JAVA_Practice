package com.workshop;

class MyClass{
	int myVar1;
	static int myvar2; // static�� ��� 
}

public class Sample03 {
	// ���� Ŭ���������� ������ �����ϴ�.(static) int myVar3;
	// Sample03.myVar3 = 10;
	public static void main(String[] args) {
		MyClass.myvar2 = 20;
		System.out.println(MyClass.myvar2);
	//	myVar3 = 20;
	}
}
