package com.pr1.src.com.pr1;

import java.util.Scanner;

public class PhoneBookManager {
	final int MAX_CNT = 100;
	PhoneInfo[] pi = new PhoneInfo[MAX_CNT];
	int num;
	
	Scanner scan = new Scanner(System.in);
	
	public void inputData() {
		System.out.println("데이터 입력 시작");
		System.out.println("이름 : ");
		String name = scan.nextLine();
		System.out.println("전화번호 : ");
		String phoneNumber = scan.nextLine();
		System.out.println("생일 : ");
		String birth = scan.nextLine();
		
		pi[num] = new PhoneInfo(name, phoneNumber, birth);
		num++;
		
		
		System.out.println("데이터 입력이 완료되었습니다.");
		}
		public void inputUnivData() {
			System.out.println("데이터 입력 시작");
			System.out.println("이름 : ");
			String name = scan.nextLine();
			System.out.println("전화번호 : ");
			String phoneNumber = scan.nextLine();
			System.out.println("생일 : ");
			String birth = scan.nextLine();
			System.out.println("전공 : ");
			String major = scan.nextLine();
			System.out.println("학년 : ");
			int year = scan.nextInt();
			scan.nextLine();
			
			pi[num] = new PhoneUnivInfo(name, phoneNumber, birth, major, year);
			num ++;
			
			System.out.println("데이터 입력이 완료되었습니다.");
		}
		public void inputCompanyData() {
			System.out.println("데이터 입력 시작");
			System.out.println("이름 : ");
			String name = scan.nextLine();
			System.out.println("전화번호 : ");
			String phoneNumber = scan.nextLine();
			System.out.println("생일 : ");
			String birth = scan.nextLine();
			System.out.println("회사 : ");
			String company = scan.nextLine();
			
			pi[num] = new PhoneCompanyInfo(name, phoneNumber, birth, company);
			
			System.out.println("데이터 입력이 완료되었습니다.");
		}
		
		public void searchData() {
			System.out.println("검색할 이름을 입력하세요");
			String name = scan.nextLine();
			boolean isTrue = false;
			for(int j = 0; j < num; j++) {
				if(name.equals(pi[j].name)) {
					pi[j].showInfo();
					isTrue = true;
				}
			}
			System.out.print(isTrue == true ? "" : "데이터가 없습니다.");
		}
		public void deleteData() {
			System.out.println("삭제할 이름을 입력하세요. :");
			String name = scan.nextLine();
			boolean isTrue = false;
			int point = 0;
			for(int k = 0; k<num; k++) {
				if(name.equals(pi[k].name)) {
					isTrue = true;
					point = k;
				}
			}
			if(isTrue == true) {
				for(int l = point; l <num; l++) {
					pi[l] = pi[l +1];
				}
				num--;
			}
		}
		public void showData() {
			for(int i = 0; i <num; i++) {
				pi[i].showInfo();
				System.out.println("");
			}
		}
	
}
