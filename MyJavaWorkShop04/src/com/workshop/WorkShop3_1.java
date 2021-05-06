package com.workshop;

import java.util.Scanner;

public class WorkShop3_1 {

	public static void main(String[] args) {
		
//		int[][] number = {
//				{1,2,1,3,3,4,5,6,1,4},
//				{4,2,1,2,3,1,5,6,1,4},
//				{5,4,4,1,3,2,5,5,1,4},
//				{3,2,1,5,4,4,5,6,1,4},
//				{1,2,4,3,3,4,5,5,1,4}
//				
//		};
		String[][] Students = new String[][] {
			{"A","B","A","C","C","D","E","F","A","D"},
			{"D","B","A","B","C","A","E","F","A","D"},
			{"E","D","D","A","C","B","E","E","A","D"},
			{"C","B","A","E","D","D","E","F","A","D"},
			{"A","B","D","C","C","D","E","E","A","D"},	
		};
		String[] answer = new String[10];
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("정답을 입력하세요.(10개)");
		
		for(int i = 0; i<answer.length; i++) {
		 answer[i]= scanner.next();
		 System.out.println(answer[i]);
		}
		for(int j = 0; j<5; j++) {
			int score = 0;
			for(int a = 0; a<10; a++) {
				if(Students[j][a].equals(answer[a])) //문자열을 내용을 비교할때에는 == 말고 .equals 사용 
					score++;
			}
			System.out.println("The Student["+(j+1)+"]'s Score is: "+score);
		}
	}
}
