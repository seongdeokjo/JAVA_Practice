package com.workshop;

// import java.util.Scanner;

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
		//String[][] Students = {  �ٷ� �迭������ �ʱ�ȭ 
		// { ...................".."}
		String[][] Students =  {
			{"A","B","A","C","C","D","E","F","A","D"},
			{"D","B","A","B","C","A","E","F","A","D"},
			{"E","D","D","A","C","B","E","E","A","D"},
			{"C","B","A","E","D","D","E","F","A","D"},
			{"A","B","D","C","C","D","E","E","A","D"},	
		};
		String[] answer = {
				"D","B","D","C","C","D","A","E","A","D"
		};
		
//		Scanner scanner = new Scanner(System.in);
		
//		System.out.println("������ �Է��ϼ���.(10��)");
		
//		for(int i = 0; i<answer.length; i++) {
// 		 answer[i]= scanner.next();
//		 System.out.print(answer[i]);
		
//		}
		 System.out.println(Students.length);
		for(int j = 0; j<Students.length; j++) {
			int score = 0; //�� ���� �񱳰� ������ ���� 0�����ʱ�ȭ�ȴ�. 
			for(int a = 0; a<Students[j].length; a++) {
				// == �� ����
	//			if(Students[j][a].equals(answer[a])) //���ڿ��� ������ ���Ҷ����� == �� .equals ��밡�� 
				if(Students[j][a]==(answer[a]))
					score++;
			}
			System.out.println("The Student["+(j+1)+"]'s Score is: "+score);
		}
	}
}
