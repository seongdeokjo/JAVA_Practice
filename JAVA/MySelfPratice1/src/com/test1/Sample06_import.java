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
			System.out.println("1.�л��� | 2.�����Է� | 3.��������Ʈ | 4.�м� | 5.����");
			System.out.println("=================================================");
			System.out.print("���� >");
			
			int selectNo = Integer.parseInt(scan.nextLine());
			
			if(selectNo == 1) {
				System.out.println("�л����� �Է��ϼ���.");
				studentNum = Integer.parseInt(scan.nextLine());
				scores = new int[studentNum];
			}else if(selectNo == 2) {
				System.out.println("������ �Է����ּ���.");
				for(int i = 0; i <scores.length; i++) {
					System.out.println("scores["+i+"]>");
					scores[i] = Integer.parseInt(scan.nextLine());		
				}	
			}else if(selectNo == 3) {
				System.out.println("�л����� ���� ����Ʈ �Դϴ�.");
				for(int i = 0; i <scores.length; i++) {
					System.out.println("scores["+i+"]="+scores[i]);
				}
			}else if(selectNo == 4) {
				System.out.println("�л��� ���� �� �ְ� ������ ����Դϴ�.");
				int max = 0;
				int sum = 0;
				double avg = 0;
				
				for(int i = 0; i<scores.length; i++) {
					max = (max < scores[i]) ? scores[i] : max; // 3�� ������ 
					sum += scores[i];				
				}
				avg = (double)sum / studentNum;
				System.out.println("�ְ� ����: "+max);
				System.out.println("��� ����: "+avg);
									
			}else if(selectNo == 5) {
				
				run = false;	
			}else {
				System.out.println("��ȣ�� �ٽ��Է����ּ���.");
			}				
		}
		System.out.println("���α׷��� �����մϴ�.");
	}

}
