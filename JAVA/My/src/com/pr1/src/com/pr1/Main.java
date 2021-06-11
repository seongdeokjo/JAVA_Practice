package com.pr1;
// ������ :1. �̸��� �ߺ��Ǿ��ٸ� ����� ���� ����� 
//2. ������ ������ ���� ����� ������� ���� ���� 
//3. �̸� + �ٸ� ������ ���ļ� �� ��üȭ�� ����� �� �ְ� ����
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num;
		PhoneBookManager pbm = new PhoneBookManager();
		while(true) {
			System.out.print("�����ϼ���...\n1. ������ �Է�\n2. ������ �˻�\n3. ������ ����\n4. ���α׷� ����\n����: ");
			num = scan.nextInt();
			scan.nextLine();
			switch(num) {
			case 1 :
				System.out.print("1. �Ϲ� �Է� 2. ���� �Է� 3. ȸ�� �Է�\n���� : ");
				int input = scan.nextInt();
				scan.hasNextLine();
				
				switch(input) {
				case 1 :
					pbm.inputData();
					break;
				case 2 :
					pbm.inputUnivData();
					break;
				case 3 :
					pbm.inputCompanyData();
					break;		
				}
			case 2 :
				pbm.searchData();
				break;
			case 3 :
				pbm.deleteData();
				break;
			case 4 :
				System.out.println("���α׷��� �����");
				scan.close();
				return;
			case 5 :
				System.out.println("���");
				pbm.showData();
			
			}
		}

	}

}
