package com.test;
public class Sample04 {
	public static void main(String[] args) {
//		for(int i = 1; i < 6; i++) {
		//	System.out.println(i);
//			for(int j = 1; j<11; j++) {
//				System.out.print("*");
//			}
//			System.out.println();	
//		}
		for(int i = 1; i < 6; i++) {
			for(int j = 1; j< i+1; j++) { // i�� ���� j�� 1�������ϵ��� ��������ؼ� 
				System.out.print("*");
			}
			System.out.println();
		}
		
		
	}
}
