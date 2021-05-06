package com.test;

public class Sample06 {

	public static void main(String[] args) {
		// Collection, 컬렉션 
		// List... 
		//index, 첨자....접근 사용할수 있는 형태
		//List, Dictionally,
		// for => foreach [enhanced for statement]
		int a = 10;
		int arr[] = {1,2,3,4,5,6,7};
		System.out.println(arr[0]); 
		System.out.println(arr[2]);
		
		for(int i =0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		for(int j : arr) {
			System.out.println(j);
		}
		// sum += temp
		// sum = sum + temp
	
	}
}
