package com.test5;

import java.util.Scanner;

public class Trimcheck {
	public static boolean checkName(String name) {
		boolean result = false;
		for (int i = 0; i < name.length(); i++) {
			char n = name.charAt(i);
			if (n >= 'a' && n <= 'z' || n >= 'A' && n <= 'Z' || n >='가' && n<='하') {
				result = true;
				break;
			}
		}

		return result;
	}

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("이름을 입력하세요>");
		String name = scan.nextLine();
		
		if(name != null && !(name.trim().isEmpty()) ) {
			if(checkName(name)) {
					System.out.println("입력하신 이름은:"+name);
			}else {
				System.out.println("이름에 불가한 문자포함되어있습니다.");
			}
		}else{
			System.out.println("공백입니다.");
		}
	}
}
