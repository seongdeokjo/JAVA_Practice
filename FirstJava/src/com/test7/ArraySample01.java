package com.test7;

public class ArraySample01 {
	public static int miniValue(int[] arr) {
		int mini = 0;
		for(int i =0; i<arr.length; i++) {
			mini = (Integer) (mini > arr[i] ? mini: arr[i]);
		}
		return mini;
	}
	public static int maxValue(int[] arr) {
		int max =0;
		for(int i = 0; i <arr.length; i++) {
			max = (Integer)(max < arr[i] ? max : arr[i]);
		}
		return max;
	}
	public static void main(String[] args) {
		int[] check = new int[20];
		for(int i = 0; i < check.length; i++) {
				check[i] = (int)(Math.random() * 45) -10;
			System.out.println(check[i]);
		}
		System.out.println();
		System.out.println(miniValue(check));
		System.out.println(maxValue(check));
		
	}

}
