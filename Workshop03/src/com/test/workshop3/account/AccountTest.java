package com.test.workshop3.account;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

<<<<<<< HEAD
import javax.naming.InvalidNameException;

import com.test.workshop3.exception.*;

public class AccountTest {
	public static void main(String[] args) throws InvalidValueException, AccountNotFoundException {
		int menu = 0;
		Account acc = null;
		while (menu != 9) {

			printMenu();
			try {
				String account;
				String name;
				int balance;
				menu = Integer.parseInt(getUserInput());
				int a3;
				int a4;
				// TODO �� �޴� ���� �� �ؾ� �� �� ����
				switch (menu) {

				case 1: // ���� ����
					System.out.print("\n���¹�ȣ : ");
					account = AccountTest.getUserInput();
					System.out.print("������ : ");
					name = AccountTest.getUserInput();
					System.out.print("���� �Ա� : ");
					balance = Integer.parseInt(getUserInput());
					acc = new Account(account, name, balance);
					break;
				case 2: // ���� ���� ���
					if (acc == null) {
						throw new AccountNotFoundException("[����] ���°� �����ϴ�.");
					}
					System.out.println("���� ������ ���� ���� ����Դϴ�.");
					System.out.println(acc);

					break;
				case 3: // �Ա�
					System.out.print("�Ա��� �ݾ� : ");
					a3 = Integer.parseInt(getUserInput());
					acc.deposit(a3);
					break;
				case 4: // ���
					System.out.print("����� �ݾ� : ");
					a4 = Integer.parseInt(getUserInput());
					acc.withdraw(a4);
					break;
				case 9: // ����
					System.out.println("�����մϴ�.");
					break;
				default:
					System.out.println("[����] �޴��� �߸� �Է��Ͽ����ϴ�.");
					break;
				}
			} catch (AccountNotFoundException e) {
				System.out.println(e.getMessage());
			} catch (InvalidValueException e) {
				System.out.println(e.getMessage()); // TODO catch ����ȭ (������ ���� ��Ȳ ����)
			} catch (NumberFormatException e) {
				System.out.println("[����] �޴��� ���ڷ� �Է��ؾ� �մϴ�.");
			} catch (Exception e) {
				System.out.println(e.getMessage());
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

	public static String getUserInput() {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String inputString = null;

		try {
			inputString = br.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return inputString;
	}
=======
import com.test.workshop3.exception.InvalidValueException;

public class AccountTest {    
    public static void main( String[] args ) throws InvalidValueException {        
        int menu  = 0;
       int a2 = 0;
	String a1 = null;
	String a = null;
	Account acc = new Account(null,null,0)  ;
  int a3;
  int a4;
    
       int index = 0;
        while ( menu != 9 ) {            
            printMenu();     
                      try {                
                menu = Integer.parseInt(getUserInput());                
               
				//TODO �� �޴� ���� �� �ؾ� �� �� ����
                switch ( menu ) {
                case 1:     // ���� ����
                    System.out.print( "\n���¹�ȣ : " );
                    a = AccountTest.getUserInput();
                    System.out.print( "������ : " );
                    a1 = AccountTest.getUserInput();     
                    System.out.print( "���� �Ա� : " );
                    a2 = Integer.parseInt(getUserInput());
                 acc = new Account(a,a1,a2);
                   System.out.println("���� ������ �Ϸ�Ǿ����ϴ�.");
       
                   break;
                case 2:     // ���� ���� ���
                	System.out.println("���� ������ ���� ���� ����Դϴ�.");
                	System.out.println(acc);
                    break;
                case 3:     // �Ա�
                    System.out.print( "�Ա��� �ݾ� : " );
                     a3 =Integer.parseInt(getUserInput());
                    acc.deposit(a3);
                    break;
                case 4:     // ���
                    System.out.print( "����� �ݾ� : " );
                    a4 =Integer.parseInt(getUserInput());
                    acc.withdraw(a4);
                    break;
                case 9:     // ����
                    System.out.println( "�����մϴ�." );
                    break;
                default:
                    System.out.println( "[����] �޴��� �߸� �Է��Ͽ����ϴ�." );
                    break;
                }
                
                //TODO catch ����ȭ (������ ���� ��Ȳ ����)
            } catch ( Exception e ) {
            	System.out.println(e.getMessage());
                        	
            }
        }
    }
    
    private static void printMenu() {
        System.out.println( "\n===== < �޴� > =====" );
        System.out.println( " 1. ���� ����" );
        System.out.println( " 2. ���� ���� ���" );
        System.out.println( " 3. �Ա�" );
        System.out.println( " 4. ���" );
        System.out.println( " 9. ����" );
        System.out.println( "===================" );
        System.out.print( ">> �޴� : " );
    }
    
    public static String getUserInput() {        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String inputString = null;
        
        try {
          inputString = br.readLine();
        } catch ( IOException e ) {
            e.printStackTrace();
        }
        return inputString;
    }
>>>>>>> e63fdffb62c4da06ea739f21cc74794b436ab200
}