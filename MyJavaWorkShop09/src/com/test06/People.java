package com.test06;



public class People implements Comparable<People> {
	private String name;
	private int age;
	
	public People(String name,int age) {
		this.name = name;
		this.age = age;
	}
	public String print() {
		return name + "("+age+")";
	}

	@Override
	public int compareTo(People o) {
		if(this.age < o.age) {
			return -1;
		}else if(this.age == o.age) {
			return 0;
		}else {
		return 1;
		}
	}
	
}
	

