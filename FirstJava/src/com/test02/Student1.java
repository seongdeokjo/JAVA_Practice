package com.test02;

public class Student1 {

	public static void main(String[] args) {
		//1.국어,영어,수학 점수 10개씩을 저장하는 배열을 정의하고 
		int[] korScore = new int[10];
		int[] engScore = new int[10];
		int[] mathScore = new int[10];
				
		korScore[0] = 100;
		korScore[1] = 90;
		korScore[2] = 80;
		korScore[3] = 70;
		korScore[4] = 60;
		korScore[5] = 80;
		korScore[6] = 60;
		korScore[7] = 60;
		korScore[8] = 50;
		korScore[9] = 70;
		//점수를 모두 출력하고, 배열의 모든 요소를 출력 / 배열 -> 일괄처리
		// 반복문을 이용해서 공통된 작업을 처리 -> 일괄처리
		//합을 구하기 위한 변수 sum 선언 
		int sum = 0;
		for(int i = 0; i < korScore.length; i++) {
			System.out.println(korScore[i]);
			sum += korScore[i]; // sum = sum + korScore[i];
		}
		// 평균 : 총합 / 배열의 개수
		System.out.println((double)sum / korScore.length);
		System.out.println();
		
		int sum1 = 0;
		for(int a : korScore) {
			System.out.println(a);
			sum1 += a;
		}
		System.out.println((double)sum1 / korScore.length);
	}

}
