package com.workshop;
import java.util.*;
//�� ���� ������ 2.5�̻�(�� �����̶� 2.5 �̸��� ,�������� ���б� Ż��
	//���� ������ �ڵ尡 ��������...?
	// ���� ������ ����....?
	// ����1) ����� 3.7 �̻� 2)�� ���� ������ 2.5�̻� (2.5�̸��̶�� ���б� Ż��)
// ������ ��� �Է��Ҽ� �ֵ��� ����� 
public class WorkShop2 {
	public static double getUserInput() {
		Scanner scanner = new Scanner(System.in);
		Double inputString = scanner.nextDouble();
		return inputString;
	}
	
	public static void main(String[] args) {
 for(;;) { //�ݺ��۾� �� �� �ִ� �ݺ��� ����
	 Scanner scanner1 = new Scanner(System.in);
		System.out.println("########�޴�########");
		System.out.println("     1.�����Է�     ");
		System.out.println("     2.���α׷� ����     ");
		System.out.println("###################");
		System.out.print("��ȣ�� �������ּ���:"); // �����Է°� ���Ḧ �����ϴ� ����
		String inputString1 = scanner1.nextLine();
		int num = Integer.parseInt(inputString1);
	
	if(num == 1) {
		
		double a,a1,a2,a3,a4;
		System.out.println("Computer Science ������ �Է��ϼ��� :");
			a = getUserInput();
		System.out.println("JavaPrograming ������ �Է��ϼ��� :");
			a1 = getUserInput();
		System.out.println("���м��� ������ �Է��ϼ��� :");
			a2 = getUserInput();
		System.out.println("������� ����  ������ �Է��ϼ���: ");
			a3 = getUserInput();
		System.out.println("������ ������ ������ �Է��ϼ��� :");
			a4 = getUserInput();
		System.out.println("==========================");

// boolean �̿� Ȯ�� �ϴ� ���		
//	boolean acheck = (a >= 2.5)? true : false;
//	boolean a1check = (a1 >= 2.5)? true : false;	
//	boolean a2check = (a2 >= 2.5)? true : false;
//	boolean a3check = (a3 >= 2.5)? true : false;
//	boolean a4check = (a4 >= 2.5)? true : false;
//	boolean allcheck = acheck && a1check && a2check && a3check && a4check;
//	if(avg >= 3.7) {
//		if(allcheck) {
//			System.out.println("���� �б� ���б� ����� �Դϴ�.");
//		}
//	}
	
	
	
		double avg = (a+a1+a2+a3+a4) /5;
//		double avg2 = totalScoreFunc(a, a1, a2, a3, a4); 
		System.out.println("�����"+avg+"�� �Դϴ�.");
		// ���� 3.7�̻� , �� ���� 2.5�̻� ���б� ���� ���ǹ�
		 if((a >= 2.5 && a1 >= 2.5 && a2 >= 2.5 && a3 >= 2.5 && a4 >= 2.5) && (avg >=3.7) ) {
			System.out.println("���� �б� ���б� ����� �Դϴ�.");
		}else {
			System.out.println();
			}
	
	}else if(num == 2) {
		System.out.println("���α׷��� ����˴ϴ�.");
		break;
	}else {
		System.out.println("@@@@@�ٽ� �Է����ּ���.@@@@@");
		continue;
			}
 	
 		}
 //���� Ȯ���ϱ� 
// 	public static float totalScoreFunc(float a, float a1, 
// 			float a2, float a3, float a4) {
// 			return (a + a1 + a2 + a3 + a4)/5;
// 	}
	}

}

