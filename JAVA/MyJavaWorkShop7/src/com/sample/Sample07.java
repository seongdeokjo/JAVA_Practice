package com.sample;
public class Sample07 {
	public static void main(String[] args) {
		byte a = Byte.MAX_VALUE;
		int b = Integer.MAX_VALUE;
		System.out.println(a+ "," + b);
		int c = a; // byte -> int  => implicit cast(암시적인 형변환)
		byte d = (byte)c; // int -> byte => explicit cat(명시적인 형변환)
		//value type type cast
		
		
		
	}
}
