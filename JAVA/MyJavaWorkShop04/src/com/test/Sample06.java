package com.test;

public class Sample06 {

	public static void main(String[] args) {
		// Collection, �÷��� 
		// List... 
		//index, ÷��....���� ����Ҽ� �ִ� ����
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
