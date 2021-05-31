package com.test02;

public class Rotto {

	public static void main(String[] args) {
		//배열생성 
		int[] rotto = new int[6];
		//랜덤으로 값을 담을 변수 선언
		int lucky;
		System.out.println("=======================당첨번호는==========================");
		for(int i=0; i < 6; i++) {
			// 1 <= lucky <51 까지의 랜덤 범위 추출
			lucky = (int)(Math.random() * 50)+1;
			rotto[i] = lucky;		
			System.out.print(rotto[i]+"\t");
		}
		System.out.println("번 입니다.\n========================================================");
	}

}
