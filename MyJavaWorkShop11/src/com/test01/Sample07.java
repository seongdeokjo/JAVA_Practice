package com.test01;

public class Sample07 {

	public static void main(String[] args) {
		String msg1 = "이순신";
		String msg2 = "가평군";
		String msg3 = msg1 + msg2;
		
		StringBuffer sb = new StringBuffer("이순신");
		System.out.println(sb.capacity());
		sb.append("가평군");
		sb.insert(1, "세종대왕");
		sb.replace(1, 3, "잘가");
		sb.delete(1, 3);
			System.out.println(sb.toString());
			System.out.println();	
			
	}

}
