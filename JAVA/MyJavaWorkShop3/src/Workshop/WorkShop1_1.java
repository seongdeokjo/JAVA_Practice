package Workshop;

import java.util.*;


public class WorkShop1_1 {
	public static int getUserInput() {
		Scanner scanner = new Scanner(System.in);
		String inputString = scanner.nextLine();
		return Integer.parseInt(inputString);
	}
	public static void main (String args[]) {
		int b, b1, b2, b3;
		b = 2000;
		b1 = 3000;
		b2 = 1500;
		b3 = 500;
		System.out.println("=========�޴�=========");
		System.out.println("1.�Ƹ޸�ī�� : 2000��");
		System.out.println("2.ī��� : 3000��");
		System.out.println("3.���̱� : 1500��");
		System.out.println("4.ũ��ġ�� : 500��");
		System.out.println("=========�ֹ�=========");
		 
		System.out.println("�Ƹ޸�ī�� �ֹ� ���� : ");
		int a = getUserInput();
		System.out.println("ī��� �ֹ� ���� : ");
		int a1 = getUserInput();
		System.out.println("���̱� �ֹ� ���� : ");
		int a2 = getUserInput();
		System.out.println("ũ��ġ�� �ֹ� ���� : ");
		int a3 = getUserInput();
		
		System.out.println("=========�ݾ�=========");
		System.out.printf("�Ƹ޸�ī��: %d�� %n",a*b);
		System.out.printf("ī���: %d�� %n",a1*b1);
		System.out.printf("���̱�: %d�� %n",a2*b2);
		System.out.printf("ũ��ġ��: %d�� %n",a3*b3);
		
		System.out.println("========�ֹ�Ȯ��=========");
		int total = (a * b) + (a1 * b1) + (a2 * b2) + (a3 * b3);
		System.out.println("�� ���� �ݾ�:" +total+"��");
		
		float point = 0;
		if(total>=30000) {
			point = total*0.02f;
		}else if(12000 <=total && 30000> total) {// �� ������ �� üũ!!
			point = total*0.01f;
		}else {
			System.out.println("����Ʈ ������ ���� �� �����ּ���.^^");
		}
		System.out.println("����Ʈ ���� :" +(int)point+"��");
		
		
	}
}
