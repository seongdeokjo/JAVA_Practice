import java.util.*;
public class Sample08 {

	public static void main(String[] args) {
		
//		###############
//		# 1.����
//		# 2.����
//		# 3.����
//		# 4.������
//		# 5.����
//		###############
//		# �޴� ��ȣ�� �Է����ּ���. :
		
		// ver.1
		System.out.println("#########################");
		System.out.println("1.����");
		System.out.println("2.����");
		System.out.println("3.����");
		System.out.println("4.������");
		System.out.println("5.����");
		System.out.println("#########################");
		System.out.printf("�޴� ��ȣ�� �Է��� �ּ���. :");
		Scanner scanner = new Scanner(System.in);
		String num= scanner.nextLine();
		//  ���δٸ� ��ü�̱� ������ ���¸� ���ϱ� ���ؼ� equals ��� 
		// if(num.equals("1") {
		// System.out.println("�����Դϴ�.");
		int num2 = Integer.parseInt(num);
		if (num2 == 1) {
			System.out.println("�����Դϴ�.");
		} else if(num2 == 2) {
			System.out.println("�����Դϴ�.");
		} else if(num2 == 3) {
			System.out.println("�����Դϴ�.");
		} else if(num2 == 4) {
			System.out.println("�������Դϴ�.");
		} else if(num2 == 5) {
			System.out.println("����.");
		} else {
			System.out.println("�ٽ� �Է����ּ���");
		}
		
		
		
		
		//ver.2
		//if �� �̿�
//		System.out.println("##########################");
//		Scanner scanner = new Scanner(System.in);
//		char ch = ' ';
//		System.out.println("#�޴� ��ȣ�� �Է��� �ּ���.");
//		String input = scanner.nextLine();
//		ch = input.charAt(0);
//		int a = 10;
//		int b = 20;	
//		if(ch =='1') {
//			System.out.println("1. ����");
////			System.out.printf("%d+%d=%d %n", a,b,c);
//			System.out.println(a+b);
//		
//		}else if (ch =='2') {
//			System.out.println("2.����");
//			System.out.println(a-b);
////			System.out.printf("%d-%d=%d %n", a,b,d);
//		}else if(ch =='3') {
//			System.out.println("3.����");
//			System.out.println(a * b);
////			System.out.printf("%d*%d=%d %n", a,b,e);
//		}else if(ch == '4') {
//			System.out.println("4.������");
//			System.out.println(a / b);
////			System.out.printf("%d/%d = %d %n", a,b,f);
//		}	
//		else {
//			System.out.println("5.���� :���α׷��� �����մϴ�.");
//		}
//		System.out.println("##########################");
//		
		
		
		//ver.3
	// switch �� �̿� 	
//		System.out.println("##########################");
//		Scanner scanner = new Scanner(System.in);
//		
//		System.out.println("#�޴� ��ȣ�� �Է��� �ּ���.");
//		
//		int num = scanner.nextInt();
//		
//		int a1 = 10;
//		int b1= 20;	
//		switch(num) {
//		case 1:
//			System.out.println("1.�����Դϴ�.");
//			System.out.println(a1 + b1);
//			break;
//		case 2:
//			System.out.println("2.�����Դϴ�.");
//			System.out.println(a1 - b1);
//			break;
//		case 3:
//			System.out.println("3.�����Դϴ�.");
//			System.out.println(a1 * b1);
//			break;
//		case 4:
//			System.out.println("4.�������Դϴ�.");
//			System.out.println(a1 / b1);
//			break;
//			default :
//			System.out.println("5.���� ���α׷��� �����մϴ�.");
//		}

	}

}
