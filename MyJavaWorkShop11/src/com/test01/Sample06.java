package com.test01;

public class Sample06 {

	public static void main(String[] args) {
		String msg = "안녕하세요";
		char c = msg.charAt(1);
		System.out.println(c);
		String msg1 = "abcdefgAbCD";
		System.out.println(msg1.charAt(2));
		char c2 = msg1.charAt(7);
		int n = (int)c2;
		System.out.println(n);
		
		String msg2 = " hello";
		System.out.println(msg2.length());
		System.out.println(msg2.trim().length());
		System.out.println(msg2.trim());
		System.out.println(msg1.startsWith("ab"));
		int n2 = 1234;
		String temp2 = String.valueOf(n2);
		System.out.println(temp2 + 2);
		String msg3 = "abbb" ;
		String msg4 = msg3.replace("b", "c");
		System.out.println(msg4);
		String tel = "010-123-1234";
		System.out.println(	tel.substring(0,3));
		System.out.println(tel.substring(4,7));
		char c3 = "방가".charAt(1);
		System.out.println(c3);
		
	}

}
