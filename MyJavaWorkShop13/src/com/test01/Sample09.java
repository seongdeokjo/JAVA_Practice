package com.test01;

import java.util.*;

public class Sample09 {
	
	static void test(ArrayList<?> al) {
		for(Object o : al) {
			System.out.println(o);
		}
	}

	public static void main(String[] args) {
		// ����ο� <?> ���ϵ� ī����  
//		ArrayList<?> al = new ArrayList<Integer>();
		test(new ArrayList<Integer>());
		test(new ArrayList<String>());
		
	}

}
