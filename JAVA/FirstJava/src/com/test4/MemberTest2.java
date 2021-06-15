package com.test4;


public class MemberTest2 {
	
	public static void main(String[] args) {

		String name = "홍길동";
		int age = 21;
		double height = 170.5;
		boolean hasbook = false;
		
		 
		System.out.println("내 이름은:"+name);
		System.out.println("나이는:"+age);
		System.out.println("키는:"+height);
		System.out.println("책 보유:"+hasbook);
		
		if(hasbook) {
			System.out.println("책을 갖고 있습니다.");
		}else 
			System.out.println("책을 갖고있지 않습니다.");
	}

}
