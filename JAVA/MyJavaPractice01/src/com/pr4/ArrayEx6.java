package com.pr4;
//섞기(배열의 요소의 순서를 반복해서 바꾼다.
public class ArrayEx6 {

	public static void main(String[] args) {
		int [] numArr = new int[10];
		
		for(int i = 0; i < numArr.length; i++) {
			numArr[i] = i;
			System.out.print(numArr[i]);
			
		}
		System.out.println();
		for(int i = 0; i < 100; i++) {
			int n = (int)(Math.random() * 10);
			int tmp = numArr[0];
			numArr[0] = numArr[n];
			numArr[n] = tmp;
		}
		for(int i = 0; i < numArr.length; i++) 
			System.out.print(numArr[i]);
		

	}

}
