package com.test01;

public class Employee {
	String name;
	int age;
	Employee(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public boolean equals(Object obj) {
		if((obj != null) && obj instanceof Employee) {
			Employee emp = (Employee)obj;
			return(this.name == emp.name &&this.age == age);
		}else {
			return false;
		}
	}
}

