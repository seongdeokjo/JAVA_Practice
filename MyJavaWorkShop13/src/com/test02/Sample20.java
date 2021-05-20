package com.test02;
//람다식에선 인터페이스당 하나의 메서드만 구현가능 
interface ICalculator {
	public int add(int a, int b);
}
interface TestFunc {
	public void msg();
}
public class Sample20 {
	static void test2(TestFunc d) {
		
	}

	public static void main(String[] args) {
		//익명함수를 이용한 인터페이스 객체화 
			TestFunc t = () -> { 
				System.out.println(" ");
			};
		
		
		ICalculator d = new ICalculator() {
			public int add(int x, int y) {
				return x + y;
			}
		};
		int c = d.add(10,20);
		System.out.println(c);
		//람다식                                 // ->뒤에는 구현부 
		ICalculator d2 = (a1,a2) -> { 
			return a1 +a2;
			
		};
		int c2 = d2.add(30, 40);
		System.out.println(c2);
	}

}
