package com.test1;

import java.util.Scanner;

public class Sample06_import {

	public static void main(String[] args) {
		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
		Scanner scan = new Scanner(System.in);
		
		while(run) {
			System.out.println("=================================================");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("=================================================");
			System.out.print("선택 >");
			
			int selectNo = Integer.parseInt(scan.nextLine());
			
			if(selectNo == 1) {
				System.out.println("학생수를 입력하세요.");
				studentNum = Integer.parseInt(scan.nextLine());
				scores = new int[studentNum];
			}else if(selectNo == 2) {
				System.out.println("점수를 입력해주세요.");
				for(int i = 0; i <scores.length; i++) {
					System.out.println("scores["+i+"]>");
					scores[i] = Integer.parseInt(scan.nextLine());		
				}	
			}else if(selectNo == 3) {
				System.out.println("학생들의 점수 리스트 입니다.");
				for(int i = 0; i <scores.length; i++) {
					System.out.println("scores["+i+"]="+scores[i]);
				}
			}else if(selectNo == 4) {
				System.out.println("학생들 점수 중 최고 점수와 평균입니다.");
				int max = 0;
				int sum = 0;
				double avg = 0;
				
				for(int i = 0; i<scores.length; i++) {
					max = (max < scores[i]) ? scores[i] : max; // 3항 연산자 
					sum += scores[i];				
				}
				avg = (double)sum / studentNum;
				System.out.println("최고 점수: "+max);
				System.out.println("평균 점수: "+avg);
									
			}else if(selectNo == 5) {
				
				run = false;	
			}else {
				System.out.println("번호를 다시입력해주세요.");
			}				
		}
		System.out.println("프로그램을 종료합니다.");
	}

}
