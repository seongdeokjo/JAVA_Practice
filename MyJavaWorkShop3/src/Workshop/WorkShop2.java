package Workshop;
import java.util.*;
public class WorkShop2 {
	public static double getUserInput() {
		Scanner scanner = new Scanner(System.in);
		Double inputString = scanner.nextDouble();
		return inputString;
	}
	public static void main(String[] args) {

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
	System.out.println("������"+avg+"�� �Դϴ�.");
	// �� ���� ������ 2.5�̻�(�� �����̶� 2.5 �̸��� ,�������� ���б� Ż��
	//���� ������ �ڵ尡 ��������...?
	// ���� ������ ����....?
	// ����1) ����� 3.7 �̻� 2)�� ���� ������ 2.5�̻� (2.5�̸��̶�� ���б� Ż��)
	if(avg <3.7) {
		System.out.println("����� �ȵ˴ϴ�.");
	}else if(a<2.5 || a1<2.5 || a2<2.5 || a3<2.5 || a4<2.5) {
		System.out.println("�����̾� ģ����.");
	}
	else {
		System.out.println("���� �б� ���б� ����� �Դϴ�.");
	}
	
	
	double b,b1,b2,b3,b4;
	System.out.println("Computer Science ������ �Է��ϼ��� :");
		b = getUserInput();
	System.out.println("JavaPrograming ������ �Է��ϼ��� :");
		b1 = getUserInput();
	System.out.println("���м��� ������ �Է��ϼ��� :");
		b2 = getUserInput();
	System.out.println("������� ����  ������ �Է��ϼ���: ");
		b3 = getUserInput();
	System.out.println("������ ������ ������ �Է��ϼ��� :");
		b4 = getUserInput();
	System.out.println("==========================");
	double avg1 = (b+b1+b2+b3+b4) /5;
	System.out.println("������"+avg1+"�� �Դϴ�.");
	if(avg <3.7) {
		System.out.println("����� �ȵ˴ϴ�.");
	}else if(b<2.5 || b1<2.5 || b2<2.5 || b3<2.5 || b4<2.5) {
		System.out.println("�����̾� ģ����.");
	}
	else {
		System.out.println("���� �б� ���б� ����� �Դϴ�.");
	}
	
	}

}
