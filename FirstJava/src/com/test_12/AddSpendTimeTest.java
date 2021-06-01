package com.test_12;

import java.util.*;

public class AddSpendTimeTest {

	public static void main(String[] args) {
//		1~100000000까지 더하기하는 연산의 실행 시간을 측정하는 프로그램을 만들어 보자.
		long start = System.currentTimeMillis();
		long sTime = System.nanoTime(); 
		System.out.println(sTime);
		 int sum = 0;
		for(int i =1; i < 100000000; i++) {
			sum += i;
		}
		System.out.println(sum);
		long end = System.currentTimeMillis();
		System.out.println("시간차:"+ (end - start)/1000.0);
	}

}
