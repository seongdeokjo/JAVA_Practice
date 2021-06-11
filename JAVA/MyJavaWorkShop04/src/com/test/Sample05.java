package com.test;
public class Sample05 {
	public static void main(String[] args) {
		for(int i = 1; i < 6; i++) {
			for(int j = 1; j <i+1; j++) {				
				System.out.print(j);
			}
			System.out.println();
		}
		System.out.println("----------------------");
		for(int a = 5; a >= 1; a--) {
			for(int b = 1; b <= a; b++) {
				System.out.print(b);
			}
			System.out.println();
		}	
	}
}
