package com.test07;

import java.util.Arrays;

public class Sample19 {

	public static void main(String[] args) {
		String[] test1 = new String[] { "1", "2", "3", "5", "5", "6" };
		String[] test2 = new String[] { "1", "3" ,"2", "4", "5", "6" };
		String[][] arr = new String[][] {test1, test2};
		
		Arrays.sort(arr, (o1, o2) -> {
			
			for(int i = 0; i < o1.length; i++) {
				
				if(o1[i].compareTo(o2[i]) > 0) {
					return 1;
				} else if(o1[i].compareTo(o2[i]) < 0) {
					return -1;
				}
			}
			return 0;
		});
		
		for(String[] t : arr) {
			System.out.println(Arrays.toString(t));

	}

	}
}
