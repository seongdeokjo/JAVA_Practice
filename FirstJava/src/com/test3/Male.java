package com.test3;

public class Male extends Person{
	public Male(String name, String rrn,int age,String gender) {
		super(name,rrn,age, gender);
	}	
	public String toString() {
		return "저는 "+name+", "+age+"살 "+gender+"입니다.";
	}
}
