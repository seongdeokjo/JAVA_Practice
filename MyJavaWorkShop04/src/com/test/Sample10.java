package com.test;

public class Sample10 {

	public static void main(String[] args) {
//		//��� 1 ���� �޾Ƽ� �Ҵ�
//		int[] arr;
//		arr = new int[3];
//		
//		//��� 2 �ٷ� ���� �Ҵ�
//		int [] arr2 = new int[4];
//		arr2[0] = 10;
//		arr2[1] = 20;
//		arr2[2] = 100;
//		arr2[3] = 300;
//		// �Ҵ�� ���� ũ�⺸�� ũ�ԵǸ� �ڹٿ����߻� arrayindexofexception
//		for(int i = 0; i < arr2.length; i++) {
//			System.out.println(arr2[i]);
//		// ��� 3 ����� ��κ� Ȱ��Ǵ� ��� 
//		int[] arr3 = {10,20,100,300} ;
//		for(int j = 0; j < arr3.length; j++) {
//			System.out.println(arr3[j]);
//		}
//		
//			
//			
//			
//			
//		}
		String[] names = new String[3];
		names[0] = "�̼���";
		names[1] = "��������";
		names[2] = "�������";
		for( int k = 0; k<names.length; k++) {
			System.out.println(names[k]);
		}
		for(String name : names) {
			System.out.println(name);
		}
		
		int[][] arr4 = new int [4][3];
		arr4[0][0] = 10;
		arr4[0][1] = 20;
		arr4[0][2] = 30;
		
		int[][] arr5 = {{1,2},{3,4}};
		
		int[][] arr6 = {{1,2},{3,4}};
		}
		
		
	
}
