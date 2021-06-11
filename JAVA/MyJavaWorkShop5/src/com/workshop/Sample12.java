package com.workshop;

class Calculator {
	int add(int a, int b) { // a,b는 로칼변수
//		int c = a + b;
//		return c;
		return a + b;
	}
	
	void test(String msg) { //호출 후 값을 반환하지 않는다. 
		System.out.println(msg); // 값을 반환이 아니라 그냥 화면에 보여[출력]주는 것이다.
	}
}



public class Sample12 {
	public static void main(String[] args) {
		int x = 1;
		int y = 2;
		Calculator calc = new Calculator();
		int d = calc.add(x, y);
		System.out.println(d);
		calc.test("안녕하세요."); // 화면에 단지 출력 
		
	}

}
