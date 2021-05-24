package com.test01;

public class Female extends Person{
	String gender;
	public Female(String name, String rrn, int age,String gender) {
		super(name, rrn, age, gender);
		this.gender = gender;		
	}
	public String toString() {
		return "저는 "+name+" 입니다."+gender+" 이고 "+age+" 살 입니다.";
	}
	

}
