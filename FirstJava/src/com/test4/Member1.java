package com.test4;

import java.util.*;

public class Member1 {
	void vaccinCheck(int birthYear) {
		int age = ageCal(birthYear); // 나이연산
		boolean check1 = age < 15 || age >= 65;
		boolean check2 = !(age >= 15 && age < 65);
		
		System.out.println(check1);
		System.out.println(check2);
		
		if(check1) {
			System.out.println("무료 예방접종이 가능합니다.");
		}else {
			System.out.println("무료접종 대상이 아닙니다.");
		}		
	}
	void checkUp(int birthYear) {
		int age = ageCal(birthYear); // 나이연산
		boolean check1 = birthYear % 2 ==0 && 2021 % 2 == 0 ||
				birthYear % 2 ==1 && 2021% 2 ==1;
//			짝수 년이면 짝수 해 / 홀수 해 이면 홀수 해 가 검진대상 이되도록 
		boolean check2 = birthYear % 2 == 2021 % 2;
		if(age >= 20 && check2) {
			System.out.println("검진 대상자 입니다.");
			if(age >= 40) {
				System.out.println("암검진 대상자");
			}
		}else {
			System.out.println("검진 대상자 아닙니다.");
		}
	}
	// 태어난 년도를 입력하면 나이를 반환하는 메소드 
	int ageCal(int year) {
		//싱글톤 패턴 : 객체를 생성하는 것이 아닌 (new ~~ () -> X) 
//		int currentYear = Calendar.getInstance().get(Calendar.YEAR);
		return Calendar.getInstance().get(Calendar.YEAR) - year-1;
	}

	public static void main(String[] args) {
		Member1 member1 = new Member1();	
		Scanner scan = new Scanner(System.in);
		System.out.println("태어난 년도를 입력해주세요.");
		int brithYear = scan.nextInt();
		member1.vaccinCheck(brithYear);
		member1.checkUp(brithYear);
	}
}
