package test2;


import java.util.Scanner;

public class Test1 {
	static int cal (int a,int b) {
		return a + b;
	}
public	static int getUserInput() {
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		int num = Integer.parseInt(input);
		return num;
	}
	
	public static void main(String[] args) {
		System.out.println("#####�޴�#####");
		System.out.println("1.��Ģ����");
		System.out.println("2.����");
		System.out.println("#############");
		
		System.out.println("# �׸��� �������ּ���.");
		int a =	getUserInput();
	for(;;) {
		switch(a) {
		case 1 : 
			System.out.println("�����ڸ� �����Ͻÿ�.(+,-,*,/) : +"); 
			System.out.println("ù ��° ���ڸ� �Է����ּ���:");
			int a1 = getUserInput();
			System.out.println("�ι�° ���ڸ� �Է����ּ���:");
			int a2 = getUserInput();
			int a3 = cal(a1, a2);
			System.out.printf("����� : %d + %d = %d",a1,a2,a3);
			break;
		case 2 :
			System.out.println("���α׷��� �����մϴ�.");
			System.exit(0);
			break;
				}
			System.out.println(" ");
			}
		}


	}

