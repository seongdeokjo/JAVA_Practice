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
		System.out.println(e); //a,c �� e������ ȣ���� ���� �����ϱ⶧���� ���� �״�� ���
		int f = a + c; // 1���� ������ a��c 
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
