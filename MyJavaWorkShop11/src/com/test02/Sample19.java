package com.test02;

import java.util.Scanner;

public class Sample19 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String[] argArr = null;
		while(true) {
			String prompt = ">>";
			System.out.println(prompt); 
		
		String input = s.nextLine(); // 화면으로부터 라인단위로 입력 받는다.
		
		input = input.trim(); // 입력받은 값에서 불필요한 앞뒤 공백을 제거한다.
		argArr = input.split(" +"); // 입력받은 내용을 공백을 구분자로 자른다.
		
		String command = argArr[0].trim();
		
		if("".equals(command))  
			continue;
		
		command = command.toLowerCase(); //명려어를 소문자로 바꾼다.
		
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
