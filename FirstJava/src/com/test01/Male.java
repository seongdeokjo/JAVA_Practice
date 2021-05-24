package com.test01;
public class Male extends Person{
	public Male(String name, String rrn,int age,String gender) {
		super(name,rrn,age, gender);
	}
	public String toString() {
		return "저는 "+name+" 입니다."+gender+" 이고 "+age+" 살 입니다.";
	}
}
