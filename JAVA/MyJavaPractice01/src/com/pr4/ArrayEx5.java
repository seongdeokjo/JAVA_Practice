package com.pr4;
//�ִ밪�� �ּҰ�
public class ArrayEx5 {

	public static void main(String[] args) {
		int[] score = {80, 80, 99, 100, 55, 95};
		
		int max = score[0];
		int min = score[0];
		
		for(int i = 0; i <score.length; i++) {
			if(score[i] > max) {
				max = score[i];
			}else if(score[i] < min) {
				min = score[i];
			}
		}
		System.out.println("�ִ밪:" + max);
		System.out.println("�ּҰ�:"+ min);
	}

}
