package com.test02;

import java.util.Scanner;

public class Sample19 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String[] argArr = null;
		while(true) {
			String prompt = ">>";
			System.out.println(prompt); 
		
		String input = s.nextLine(); // ȭ�����κ��� ���δ����� �Է� �޴´�.
		
		input = input.trim(); // �Է¹��� ������ ���ʿ��� �յ� ������ �����Ѵ�.
		argArr = input.split(" +"); // �Է¹��� ������ ������ �����ڷ� �ڸ���.
		
		String command = argArr[0].trim();
		
		if("".equals(command))  
			continue;
		
		command = command.toLowerCase(); //���� �ҹ��ڷ� �ٲ۴�.
		
		if(command.equals("q")) {
			System.exit(0);
		}else {
			for(int i = 0; i< argArr.length; i++) {
				System.out.println(argArr[i]);
			}
		}
		}
		
	}

}
