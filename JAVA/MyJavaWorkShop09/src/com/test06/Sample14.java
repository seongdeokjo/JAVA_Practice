package com.test06;

import java.util.Scanner;

public class Sample14 {
	static int getInputValue() {
		Scanner scan = new Scanner(System.in);
		String inputString = scan.nextLine();
		int input = 0;
		try {
			input = Integer.parseInt(inputString);		
			}catch(NumberFormatException ex) {
				System.out.println("���ڸ� �Է����ּ���.");
			}
		return input;
	}

	public static void main(String[] args) {
		System.out.println("���� �Է����ּ���.");
		int input = getInputValue();
	}

}
