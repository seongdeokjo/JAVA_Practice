package com.workshop;


class MyClass3{
	int a;
	
}


public class Sample16 {
	static void test(MyClass3 m2) { // MyClass2 m2 = m;
		System.out.println(m2.a);
		m2.a = 100;
	}
		
	public static void main(String[] args) {
		
		MyClass3 m = new MyClass3(); //�������� m , ��ü MyClass2
		m.a = 10;
		test(m);
		System.out.println(m.a);
	}

}
