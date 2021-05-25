package com.test4;

public class MemberTest {
	public static void main(String[] args) {
		//String name = "이순신"; -> 메서드안에 변수는 지역변수 	
		Member member = new Member("홍길동","010-123-1234","전기",3,"111@111.com");
		Member member1 = new Member("이순신","010-321-4321","전자",1,"222@222.com",2015,"서울");
		member.info();
		member1.info();
	}
}