package com.test;

public class Sample03 {

	public static void main(String[] args) {
		
//		for(int i = 0; i <= 10; i++) {
//			System.out.println(i);
//		}
		for(int j = 2; j<=9; j++) {
			System.out.println(j);
			System.out.println();
			for(int k = 1; k <=9; k++) {
				System.out.println(k);
			}
			System.out.println();
		}
		//구구단 만들어보기
		// 2 * 1 = 2
		// 2 * 2 = 4
		//...
		//9 * 1 = 9
		//..
		//9 * 9 = 81
		System.out.println("<구구단 2단-9단>");
		for (int a = 2; a <=9; a++ ) {
			System.out.println(a +"단");
			System.out.println("-------------");
			for(int b = 1; b <=9; b++) {
			//	System.out.printf("%d * %d= %d \n" ,a, b,a*b);
			 System.out.println(a + "*" + b + "=" + (a * b));
			}
			System.out.println("---------------");
		}
		
		
	}

}
