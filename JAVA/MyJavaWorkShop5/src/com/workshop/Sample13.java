package com.workshop;

public class Sample13 {
	static int add(int x, int y) {
		return x + y;
	}
	static void test(String msg) { //void type�� return�� ȣ���� ������ ���ư���
		if(msg == "OK") {
			return;
		}
		System.out.println("Error");
	}
	public static void main(String[] args) {
		int d = add(10,20);
		System.out.println(d);
		test("Error");
		test("OK");
	}

}
