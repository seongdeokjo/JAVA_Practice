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
				case 1:  //계좌생성
					ac.create();
					break;
				case 2: //계좌 출력
					ac.showData();
					System.out.println();
					break;
				case 3: // 입금
						
					ac.deposit();
					break;
				case 4: // 출금
					ac.withdraw();
					break;
				case 9: //종료
					System.out.println("종료합니다.");
					break;
				}
			} catch (InvalidValueException e) {
				System.out.println(e.getMessage()); // TODO catch 세분화 (각각의 예외 상황 별로
			} catch (AccountNotFoundException e) {
				System.out.println(e.getMessage());
			} catch (InputMismatchException e) {
				scan = new Scanner(System.in);
				System.out.println("잘못 입력했습니다. 정수만 입력가능 ");
//				e.printStackTrace();
//				System.out.println(e.getClass().getName()+"예외가"+e.getMessage()+"때문에 발생했습니다.");
			}
		}
	}
	private static void printMenu() {
		System.out.println("\n===== < 메뉴 > =====");
		System.out.println(" 1. 계좌 생성");
		System.out.println(" 2. 계좌 정보 출력");
		System.out.println(" 3. 입금");
		System.out.println(" 4. 출금");
		System.out.println(" 9. 종료");
		System.out.println("===================");
		System.out.print(">> 메뉴 : ");
	}
}