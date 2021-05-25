package com.test3;
public class PersonTest {
	public static void main(String[] args) {
		Person male = new Male("강감찬","2000-1",30,"남자");
		Person female = new Female("릴리","2000-2",29,"여자");
		Person male2 = new Male("이순신","2001-1",31,"남");
		male.showData();
		female.showData();
		System.out.println("==================================================");
		System.out.println(male);
		System.out.println(female);
		System.out.println("==================================================");
		male.genderCheck();
		female.genderCheck();
		male2.genderCheck();
	}
}