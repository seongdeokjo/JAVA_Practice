package com.workshop;

import java.util.Scanner;

public class WorkShop3 {

	public static void main(String[] args) {
		
		int[][] number = {
				{1,2,1,3,3,4,5,6,1,4},
				{4,2,1,2,3,1,5,6,1,4},
				{5,4,4,1,3,2,5,5,1,4},
				{3,2,1,5,4,4,5,6,1,4},
				{1,2,4,3,3,4,5,5,1,4}
				
		};
		int[] answer = new int[10];
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("정답을 입력하세요.(10개)");
		
		for(int i = 0; i<answer.length; i++) {
			answer[i]= scanner.nextInt();
			
		}
			System.out.println();
		for(int j = 0; j<5; j++) {
			int score = 0;
			for(int a = 0; a<10; a++) {
				if(number[j][a] == answer[a]) 
					score++;
				
			}
			System.out.println("학생"+(j+1)+"의 점수:"+score);
		}
			
	}

}
