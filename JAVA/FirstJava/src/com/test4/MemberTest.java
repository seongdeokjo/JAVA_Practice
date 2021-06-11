package com.test4;

public class MemberTest {
	public static void main(String[] args) {
		// String name = "이순신"; -> 메서드안에 변수는 지역변수
		Member member = new Member("홍길동", "010-123-1234", "전기", 3, "111@111.com");
		Member member1 = new Member("이순신", "010-321-4321", "전자", 1, "222@222.com", "2017", "서울");
		
		System.out.println("수정 전 이름 : "+member.getName());
		member.setName("찰스");
		System.out.println("수정 후 이름 : "+member.getName());
		member.info();
//		member.ph = "000000"; //final로 값이 정해졌기 때문에 바꿀 수 없다.
		
		System.out.println("=======================");
		member1.info();
	}
}