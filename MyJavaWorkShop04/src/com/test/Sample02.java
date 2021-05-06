package com.test;

public class Sample02 {

	public static void main(String[] args) {
		String name = "이순신";
		String name2 = "강감찬";
		if(name == name2) {
			System.out.println("같은 사람이군요.");
		}
		if(name == name2) {
			System.out.println("같은 사람이군요");
		} else {
			System.out.println("같은 사람이 아니군요.");
		}
		int age = 10;
		if(name == "강감찬") {
			if(age >10) {
			System.out.println("강감찬입니다.");
			}
		}else if(name == "세종대왕") {
			System.out.println("세종대왕입니다.");
		}else {
			System.out.println("누구세요.");
		}
		switch(name) {
		case "홍길동" :
			System.out.println("홍길동입니다.");
			break;
		case "세종대왕" :
			System.out.println("세종대왕입니다.");
			break;
		case "이순신" :
			System.out.println("이순신입니다.");
			break;
		default:
		}
	}
}
