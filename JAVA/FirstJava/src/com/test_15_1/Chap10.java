package com.test_15_1;

import java.util.Scanner;

import com.test_15.BadIdInputException;

public class Chap10  {
	
	public static String getUserInput() {
		Scanner scan = new Scanner(System.in);
		String id = scan.nextLine();
		return id;
	}

	public static void main(String[] args) {
		System.out.print("사용자 아이디를 입력하세요. >>");
		try {
			String id = getUserInput();
			char[] t = id.toCharArray();
			for (int i = 0; i < t.length; i++) {
				//유니코드 
				// 숫자 : 48~57  					/소문자 65 ~ 90						//대문자 97~122	
				if ((48 > t[i] || t[i] > 57) && (65 > t[i] || t[i] > 90) && (97 > t[i] || t[i] > 122)) {
					throw new BadIdInputException("에러 발생");
				}	
				System.out.print(t[i]);
			}
			
		} catch (BadIdInputException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
}