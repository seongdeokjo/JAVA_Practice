package com.test_15;

import java.util.Scanner;

import com.test_15_1.BadIdInputException;

public class CheckExcption {
	public static String getUserInput() {
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		return input;
	}

	public static boolean checkChar(String name) {
		boolean check = true;
		for (int i = 0; i < name.length(); i++) {
			char ck = name.charAt(i);
			// a~z or A~Z or 0~9
			if (!(ck >= 'a' && ck <= 'z' || ck >= 'A' && ck <= 'Z' || ck >= '0' && ck <= '9')) {
				check = false;
				break;
			}
		}
		return check;
	}

	public static void main(String[] args) {
		System.out.println("아이디를 입력해주세요.");
		String id = getUserInput();
		if (id != null && !id.trim().isEmpty()) {
			if (checkChar(id)) {
				System.out.println("입력하신 이름은 :" + id);
			} else {
				try {

					throw new BadIdInputException("***오류*** 다른 데이터가 입력되었습니다.");
				} catch (BadIdInputException e) {
					System.out.println(e.getMessage());
				}
			}
		}else {
			System.out.println("이름이 입력되지 않았습니다.");
		}

	}

}
