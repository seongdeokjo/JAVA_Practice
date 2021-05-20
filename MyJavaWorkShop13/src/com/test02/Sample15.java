package com.test02;

import java.util.*;

class TestClass {					// super Integer - 그 조상들만 가능 
	public static void addNums(List<? extends Number> list) { // 그 자손들만 가능 
		for(Object o : list) {
			System.out.println(o);
		}
	}
}
public class Sample15 {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(10,20,30);
		System.out.println(list.getClass().getName());
		TestClass.addNums(list);
		
	}
}
