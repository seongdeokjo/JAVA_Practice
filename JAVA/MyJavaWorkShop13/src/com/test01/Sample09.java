package com.test01;

import java.util.*;

public class Sample09 {
	
	static void test(ArrayList<?> al) {
		for(Object o : al) {
			System.out.println(o);
		}
	}

	public static void main(String[] args) {
		// 선언부에 <?> 와일드 카드사용  
//		ArrayList<?> al = new ArrayList<Integer>();
		test(new ArrayList<Integer>());
		test(new ArrayList<String>());
		
	}

}
