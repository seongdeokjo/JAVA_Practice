package com.test8;

public class ArrayExam02 {
	
	public static void addOneDArr(int[] arr, int add) {
		for(int i =0; i < arr.length; i++) {
			arr[i] += add;
			System.out.print("arr["+i+"] = "+arr[i]+"\n");
		}
	}
	
	public static void addOneDArr(int[][]arr, int add) {
		for(int i = 0; i< arr.length; i++) {
			for(int j= 0; j <arr[i].length; j++) {
				arr[i][j] += add;				
				System.out.print("arr["+i+"]["+j+"]= "+arr[i][j]+"\n");
			}
			System.out.println();
		}
	}

	
	public static void main(String[] args) {
		int[] arr = {0,1,2,3,4,5};
		int[][] arr1 = {{0,1},{2,3,4,5},{6,7,8}};
		int add = 7;
		addOneDArr(arr,add);
		System.out.println();
		addOneDArr(arr1,add);
		
	}

}
