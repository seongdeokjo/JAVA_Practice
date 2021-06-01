package com.test_15;

import java.util.Scanner;

public class BadIdInputExceptionTest {
	public static String getUserInput() {
		Scanner scan = new Scanner(System.in);
		String id = scan.nextLine();
		return id;
	}

	public static void main(String[] args) {
		System.out.print("사용자 아이디를 입력하세요. >>");
		try {
			String id = getUserInput();
			char[] chk = id.toCharArray();

			for (int i = 0; i < chk.length; i++) {
				//유니코드 
				// 숫자 : 48~57  					/소문자 65 ~ 90						//대문자 97~122	
				if ((48 > chk[i] || chk[i] > 57) && (65 > chk[i] || chk[i] > 90) && (97 > chk[i] || chk[i] > 122)) {
					throw new BadIdInputException("에러 발생");
				}	
			}
			for(char a : chk) {
				System.out.print(a);
			}

		} catch (BadIdInputException e) {
			System.out.println(e.getMessage());
		}
	}
}