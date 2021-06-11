package com.test;

public class Sample10 {

	public static void main(String[] args) {
//		//방법 1 값을 받아서 할당
//		int[] arr;
//		arr = new int[3];
//		
//		//방법 2 바로 값을 할당
//		int [] arr2 = new int[4];
//		arr2[0] = 10;
//		arr2[1] = 20;
//		arr2[2] = 100;
//		arr2[3] = 300;
//		// 할당된 값이 크기보다 크게되면 자바오류발생 arrayindexofexception
//		for(int i = 0; i < arr2.length; i++) {
//			System.out.println(arr2[i]);
//		// 방법 3 단축식 대부분 활용되는 방법 
//		int[] arr3 = {10,20,100,300} ;
//		for(int j = 0; j < arr3.length; j++) {
//			System.out.println(arr3[j]);
//		}
//		
//			
//			
//			
//			
//		}
		String[] names = new String[3];
		names[0] = "이순신";
		names[1] = "을지문덕";
		names[2] = "세종대왕";
		for( int k = 0; k<names.length; k++) {
			System.out.println(names[k]);
		}
		for(String name : names) {
			System.out.println(name);
		}
		
		int[][] arr4 = new int [4][3];
		arr4[0][0] = 10;
		arr4[0][1] = 20;
		arr4[0][2] = 30;
		
		int[][] arr5 = {{1,2},{3,4}};
		
		int[][] arr6 = {{1,2},{3,4}};
		}
		
		
	
}
