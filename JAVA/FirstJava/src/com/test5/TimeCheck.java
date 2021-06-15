package com.test5;

public class TimeCheck {

	public static void main(String[] args) {
		int sum = 0;
	long start =  System.currentTimeMillis();
		for(int i =1; i <100000000; i++) {
			sum += i;
		}
		System.out.println(sum);
	long end = System.currentTimeMillis();
		System.out.println(end - start);
	}

}
