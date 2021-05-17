package com.test01;

public class Sample10 {

	public static void main(String[] args) {
		// boixing
		int a = 10;
		Integer i = Integer.valueOf(a);
		Object o = i; // i = object type
		System.out.println(i+","+i.toString());
		Integer i2 = new Integer(100);
		System.out.println(i2.toString());
//		value type ==> reference -> boxing
		
//		reference  ==> value  type -> unboxing
		int c = i.intValue();
		System.out.println(c);
		
	}

}
