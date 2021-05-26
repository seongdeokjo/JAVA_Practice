package com.test4;

public class Member2 {
	private String name;
	private int age;
	private String sex;
	
	public Member2(String name, int age, String sex) {
		this.name = name;
		this.age = age;
		this.sex = sex;
	}
	public Member2(String name) {
		this(name,10);
	}
	public Member2(String name, int age) {
		this(name,age,"남자");
	}
}
