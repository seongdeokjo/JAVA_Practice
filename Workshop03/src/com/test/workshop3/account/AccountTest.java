package com.test.workshop3.account;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

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
               
				//TODO 각 메뉴 선택 시 해야 할 일 구현
                switch ( menu ) {
                case 1:     // 계좌 생성
                    System.out.print( "\n계좌번호 : " );
                    a = AccountTest.getUserInput();
                    System.out.print( "예금주 : " );
                    a1 = AccountTest.getUserInput();     
                    System.out.print( "최초 입금 : " );
                    a2 = Integer.parseInt(getUserInput());
                 acc = new Account(a,a1,a2);
                   System.out.println("계좌 개설이 완료되었습니다.");
       
                   break;
                case 2:     // 계좌 정보 출력
                	System.out.println("현재 고객님의 보유 계좌 목록입니다.");
                	System.out.println(acc);
                    break;
                case 3:     // 입금
                    System.out.print( "입금할 금액 : " );
                     a3 =Integer.parseInt(getUserInput());
                    acc.deposit(a3);
                    break;
                case 4:     // 출금
                    System.out.print( "출금할 금액 : " );
                    a4 =Integer.parseInt(getUserInput());
                    acc.withdraw(a4);
                    break;
                case 9:     // 종료
                    System.out.println( "종료합니다." );
                    break;
                default:
                    System.out.println( "[에러] 메뉴를 잘못 입력하였습니다." );
                    break;
                }
                
                //TODO catch 세분화 (각각의 예외 상황 별로)
            } catch ( Exception e ) {
            	System.out.println(e.getMessage());
                        	
            }
        }
    }
    
    private static void printMenu() {
        System.out.println( "\n===== < 메뉴 > =====" );
        System.out.println( " 1. 계좌 생성" );
        System.out.println( " 2. 계좌 정보 출력" );
        System.out.println( " 3. 입금" );
        System.out.println( " 4. 출금" );
        System.out.println( " 9. 종료" );
        System.out.println( "===================" );
        System.out.print( ">> 메뉴 : " );
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
}