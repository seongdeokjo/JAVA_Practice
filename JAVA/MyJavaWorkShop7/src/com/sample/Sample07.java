package com.sample;
public class Sample07 {
	public static void main(String[] args) {
		byte a = Byte.MAX_VALUE;
		int b = Integer.MAX_VALUE;
		System.out.println(a+ "," + b);
		int c = a; // byte -> int  => implicit cast(�Ͻ����� ����ȯ)
		byte d = (byte)c; // int -> byte => explicit cat(������� ����ȯ)
		//value type type cast
		
		
		
	}
}
