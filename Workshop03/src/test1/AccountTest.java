package test1;
import java.util.*;
import java.util.Scanner;
import test1.*;
public class AccountTest {
	public static void main(String[] args) throws InvalidValueException, AccountNotFoundException {
		int num = 0;
		Scanner scan = new Scanner(System.in);
		AccountManager ac = new AccountManager();
		while (num != 9) {
			printMenu();
		
			try {
				num = scan.nextInt();
				scan.nextLine();
				switch (num) {
				case 1:  //���»���
					ac.create();
					break;
				case 2: //���� ���
					ac.showData();
					System.out.println();
					break;
				case 3: // �Ա�
						
					ac.deposit();
					break;
				case 4: // ���
					ac.withdraw();
					break;
				case 9: //����
					System.out.println("�����մϴ�.");
					break;
				}
			} catch (InvalidValueException e) {
				System.out.println(e.getMessage()); // TODO catch ����ȭ (������ ���� ��Ȳ ����
			} catch (AccountNotFoundException e) {
				System.out.println(e.getMessage());
			} catch (InputMismatchException e) {
				scan = new Scanner(System.in);
				System.out.println("�߸� �Է��߽��ϴ�. ������ �Է°��� ");
//				e.printStackTrace();
//				System.out.println(e.getClass().getName()+"���ܰ�"+e.getMessage()+"������ �߻��߽��ϴ�.");
			}
		}
	}
	private static void printMenu() {
		System.out.println("\n===== < �޴� > =====");
		System.out.println(" 1. ���� ����");
		System.out.println(" 2. ���� ���� ���");
		System.out.println(" 3. �Ա�");
		System.out.println(" 4. ���");
		System.out.println(" 9. ����");
		System.out.println("===================");
		System.out.print(">> �޴� : ");
	}
}