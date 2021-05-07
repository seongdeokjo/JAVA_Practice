package com.workshop;
class MyClass2 {
	int a;
	static int b;
}

public class Sample09 {
	int a= 0;
	static int b = 10;
	public static void main(String[] args) {
		Sample09 s = new Sample09(); //자기 자신을 오브젝트화 시켜야함 
		s.a = 10;
		System.out.println(s.a);
		b = 20;
		System.out.println(b);
		
		MyClass2 m = new MyClass2();
		m.a = 30;
		MyClass2.b = 200;
	}

}
