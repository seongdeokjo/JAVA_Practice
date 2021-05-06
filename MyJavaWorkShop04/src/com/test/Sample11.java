package com.test;

public class Sample11 {

	public static void main(String[] args) {
		int[][] arr5 = {{1,2},{3,4}};
//		System.out.println(arr5.length);
		 for(int i = 0; i < arr5.length; i++) {
			// arr5[0] = {1,2}
			// arr5[1] = {3,4}
			 for(int j = 0; j <arr5[i].length; j++) {
				 System.out.println(arr5[i][j]);
				 System.out.println(i + "," +j);
			 }
		 }
		 
	}

}
