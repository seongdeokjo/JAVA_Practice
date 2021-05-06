package com.test;

public class Sample12 {

	public static void main(String[] args) {
		//가변배열
		int[][] arr= new int[5][];
		arr[0] = new int[] {1,2,3};
		arr[1] = new int[] {1,2,3,4,};
		arr[2] = new int[] {1,2};
		arr[3] = new int[] {1};
		arr[4] = new int[] {1,2,3,4,5};
		// 위아래 전부 결국 같은 값을 가짐 
		int[][] arr2= { 
				{1,2,3},
				{1,2,3,4},
				{1,2},
				{1},
				{1,2,3,4,5}
		};
		for(int i = 0; i < arr2.length; i++) {
			for(int j = 0; j <arr2[i].length; j++) {
				
				System.out.print(arr[i][j]);
				
			}
			System.out.println();
		}
	}

}
