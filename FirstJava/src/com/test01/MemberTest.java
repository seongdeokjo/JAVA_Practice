package com.test01;

public class MemberTest {

	public static void main(String[] args) {
		Member member = new Member("홍길동","010-123-1234","전기",3,"111@111.com");
		Member member1 = new Member("이순신","010-321-4321","전자",1,"222@222.com",1995,"서울");
		member.checkBirth();
		member.testBirth();
		member.info();
		System.out.println("============================================================");
		member1.checkBirth();
		member1.testBirth();	
		member1.info();
		
		
		

	}

}
