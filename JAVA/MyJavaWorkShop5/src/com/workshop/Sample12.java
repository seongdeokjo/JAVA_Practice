package com.workshop;

class Calculator {
	int add(int a, int b) { // a,b�� ��Į����
//		int c = a + b;
//		return c;
		return a + b;
	}
	
	void test(String msg) { //ȣ�� �� ���� ��ȯ���� �ʴ´�. 
		System.out.println(msg); // ���� ��ȯ�� �ƴ϶� �׳� ȭ�鿡 ����[���]�ִ� ���̴�.
	}
}



public class Sample12 {
	public static void main(String[] args) {
		int x = 1;
		int y = 2;
		Calculator calc = new Calculator();
		int d = calc.add(x, y);
		System.out.println(d);
		calc.test("�ȳ��ϼ���."); // ȭ�鿡 ���� ��� 
		
	}

}
