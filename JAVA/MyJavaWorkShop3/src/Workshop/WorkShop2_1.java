package Workshop;
import java.util.*;
// �żҵ� ȣ��� ������ ���� 
public class WorkShop2_1 {
	public static double getUserInput() {
		Scanner scanner = new Scanner(System.in);
		Double inputString = scanner.nextDouble();
		return inputString;
	}
	public static int getUserInput1() {
		 Scanner scanner1 = new Scanner(System.in);
			System.out.println("########�޴�########");
			System.out.println("     1.�����Է�     ");
			System.out.println("     2.���α׷� ����     ");
			System.out.println("###################");
			System.out.print("��ȣ�� �������ּ���:"); // �����Է°� ���Ḧ �����ϴ� ����
			String inputString1 = scanner1.nextLine();
			int num = Integer.parseInt(inputString1);
			return num;
	}
	public static void main(String[] args) {
 for(;;) { //�ݺ��۾� �� �� �ִ� �ݺ��� ����
//	 Scanner scanner1 = new Scanner(System.in);
//		System.out.println("########�޴�########");
//		System.out.println("     1.�����Է�     ");
//		System.out.println("     2.���α׷� ����     ");
//		System.out.println("###################");
//		System.out.print("��ȣ�� �������ּ���:"); // �����Է°� ���Ḧ �����ϴ� ����
//		String inputString1 = scanner1.nextLine();
//		int num = Integer.parseInt(inputString1);
		System.out.println("dsadasasd");
		getUserInput1();
	if(getUserInput1() == 1) {
		
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
		double avg = (a+a1+a2+a3+a4) /5;
		System.out.println("�����"+avg+"�� �Դϴ�.");
		// ���� 3.7�̻� , �� ���� 2.5�̻� ���б� ���� ���ǹ�
		 if((a >= 2.5 && a1 >= 2.5 && a2 >= 2.5 && a3 >= 2.5 && a4 >= 2.5) && (avg >=3.7) ) {
			System.out.println("���� �б� ���б� ����� �Դϴ�.");
		}else {
			System.out.println();
			}
	
	}else if(getUserInput1() == 2) {
		System.out.println("���α׷��� ����˴ϴ�.");
		break;
	}else {
		System.out.println("@@@@@�ٽ� �Է����ּ���.@@@@@");
		continue;
			}
 	
 		}
	}

}

