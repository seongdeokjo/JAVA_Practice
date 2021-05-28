package com.pr1;

import java.util.Scanner;

public class PhoneBookManager {
	final int MAX_CNT = 100;
	PhoneInfo[] pi = new PhoneInfo[MAX_CNT];
	int num;
	
	Scanner scan = new Scanner(System.in);
	
	public void inputData() {
		System.out.println("������ �Է� ����");
		System.out.println("�̸� : ");
		String name = scan.nextLine();
		System.out.println("��ȭ��ȣ : ");
		String phoneNumber = scan.nextLine();
		System.out.println("���� : ");
		String birth = scan.nextLine();
		
		pi[num] = new PhoneInfo(name, phoneNumber, birth);
		num++;
		
		
		System.out.println("������ �Է��� �Ϸ�Ǿ����ϴ�.");
		}
		public void inputUnivData() {
			System.out.println("������ �Է� ����");
			System.out.println("�̸� : ");
			String name = scan.nextLine();
			System.out.println("��ȭ��ȣ : ");
			String phoneNumber = scan.nextLine();
			System.out.println("���� : ");
			String birth = scan.nextLine();
			System.out.println("���� : ");
			String major = scan.nextLine();
			System.out.println("�г� : ");
			int year = scan.nextInt();
			scan.nextLine();
			
			pi[num] = new PhoneUnivInfo(name, phoneNumber, birth, major, year);
			num ++;
			
			System.out.println("������ �Է��� �Ϸ�Ǿ����ϴ�.");
		}
		public void inputCompanyData() {
			System.out.println("������ �Է� ����");
			System.out.println("�̸� : ");
			String name = scan.nextLine();
			System.out.println("��ȭ��ȣ : ");
			String phoneNumber = scan.nextLine();
			System.out.println("���� : ");
			String birth = scan.nextLine();
			System.out.println("ȸ�� : ");
			String company = scan.nextLine();
			
			pi[num] = new PhoneCompanyInfo(name, phoneNumber, birth, company);
			
			System.out.println("������ �Է��� �Ϸ�Ǿ����ϴ�.");
		}
		
		public void searchData() {
			System.out.println("�˻��� �̸��� �Է��ϼ���");
			String name = scan.nextLine();
			boolean isTrue = false;
			for(int j = 0; j < num; j++) {
				if(name.equals(pi[j].name)) {
					pi[j].showInfo();
					isTrue = true;
				}
			}
			System.out.print(isTrue == true ? "" : "�����Ͱ� �����ϴ�.");
		}
		public void deleteData() {
			System.out.println("������ �̸��� �Է��ϼ���. :");
			String name = scan.nextLine();
			boolean isTrue = false;
			int point = 0;
			for(int k = 0; k<num; k++) {
				if(name.equals(pi[k].name)) {
					isTrue = true;
					point = k;
				}
			}
			if(isTrue == true) {
				for(int l = point; l <num; l++) {
					pi[l] = pi[l +1];
				}
				num--;
			}
		}
		public void showData() {
			for(int i = 0; i <num; i++) {
				pi[i].showInfo();
				System.out.println("");
			}
		}
	
}
