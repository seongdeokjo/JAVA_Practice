package com.test;

public class Sample01 {

	public static void main(String[] args) {
		int a = 0;
		int b = a++; // a = a+1
		System.out.println(b);
		System.out.println(a);
		int c = 0;
		int d = ++c;
		System.out.println(d);
		System.out.println(c);
		int e = a++ + c++;
		System.out.println(e); //a,c 는 e에서는 호출후 값을 저장하기때문에 값이 그대로 출력
		int f = a + c; // 1씩이 증가된 a와c 
		System.out.println(f);
		
		boolean g = (a==c) ? true : false;
		System.out.println(g);
		boolean h = (a != c)? true : false;
		System.out.println(h);
		
		int i = 0;
		boolean j = (a == c) || (i == 0);
		boolean k = (a == c) && (i == 0);
		
		int l = i+= 2; // i = i+2
		System.out.println(l);
		
	}

}
