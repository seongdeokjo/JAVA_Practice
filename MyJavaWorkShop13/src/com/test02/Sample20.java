package com.test02;
//���ٽĿ��� �������̽��� �ϳ��� �޼��常 �������� 
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
		//�͸��Լ��� �̿��� �������̽� ��üȭ 
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
		//���ٽ�                                 // ->�ڿ��� ������ 
		ICalculator d2 = (a1,a2) -> { 
			return a1 +a2;
			
		};
		int c2 = d2.add(30, 40);
		System.out.println(c2);
	}

}
