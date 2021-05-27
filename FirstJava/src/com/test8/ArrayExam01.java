package com.test8;

import java.util.Scanner;

public class ArrayExam01 {
	
	public static int miniValue(int[] arr) {
		int mini = arr[0];
		for(int i =0; i<arr.length; i++) {
			
			mini = (Integer) (mini > arr[i] ? mini: arr[i]);
		}
		return mini;		
	}
	
	public static int maxValue(int[] arr) {
		int max = arr[0];
		for(int i = 0; i <arr.length; i++) {
			max = (Integer)(max < arr[i] ? max : arr[i]);
		}
		return max;
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		System.out.print("배열의 길이를 정해주세요.>\n");
		int[] check = new int[num];
		System.out.print("배열에 넣을 정수를 입력하여 주세요.>\n");
		for(int i = 0; i < check.length; i++) {
			check[i] = scan.nextInt();
		}
		for(int a : check) {
			System.out.print(a+"\t");
		}
		System.out.println();
		System.out.println("최소값은: "+miniValue(check));
		System.out.println("최대값은: "+maxValue(check));
		
	}
}
