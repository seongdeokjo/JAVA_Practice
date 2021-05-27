package com.test8;

public class ArrayExam03 {
	
	  public static void changeOrder(int[][] arr){
	        int[] temp;
	        for (int i = arr.length-1; i > 0; i--) {
	            temp = arr[i];
	            arr[i] = arr[i-1];
	            arr[i-1] = temp;
	        }
	    }
	  public static void showArray(int[][] arr) {
		  for(int i = 0; i<arr.length; i++) {
				for(int j =0; j < arr[i].length; j++) {
					System.out.print(arr[i][j]+"\t");
				}
				System.out.println();			
			}
		  System.out.println("====================");
	  }
	public static void main(String[] args) {
		int arr[][] = {{1,2,3},{4,5,6},{7,8,9}};
		
		showArray(arr);		
		changeOrder(arr);
		showArray(arr);
		
	}
}
