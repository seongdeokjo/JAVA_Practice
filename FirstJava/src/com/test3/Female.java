package com.test3;

public class Female extends Person{
	public Female(String name, String rrn, int age,String gender) {
		super(name, rrn, age, gender);
	}
	public String toString() {
		return "저는 "+name+", "+age+"살 "+gender+"입니다.";
	}
}
