package com.pr1.src.com.pr1;
// 문제점 :1. 이름이 중복되었다면 결과를 전부 출력함 
//2. 데이터 삭제시 먼저 저장된 순서대로 값을 삭제 
//3. 이름 + 다른 조건을 합쳐서 더 구체화로 출력할 수 있게 보수
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num;
		PhoneBookManager pbm = new PhoneBookManager();
		while(true) {
			System.out.print("선택하세요...\n1. 데이터 입력\n2. 데이터 검색\n3. 데이터 삭제\n4. 프로그램 종료\n선택: ");
			num = scan.nextInt();
			scan.nextLine();
			switch(num) {
			case 1 :
				System.out.print("1. 일반 입력 2. 대학 입력 3. 회사 입력\n선택 : ");
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
				System.out.println("프로그램이 종료됨");
				scan.close();
				return;
			case 5 :
				System.out.println("출력");
				pbm.showData();
			
			}
		}

	}

}
