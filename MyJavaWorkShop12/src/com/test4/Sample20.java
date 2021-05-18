package com.test4;

import java.util.*;

public class Sample20 {

	public static void main(String[] args) {
		HashSet set = new HashSet();
		set.add("abc");
		set.add("adc");
		set.add(new Person("David",10));
		set.add(new Person("David",10));
		
		System.out.println(set);
	}

}
class Person {
	String name;
	int age;
	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public String toString() {
		return name +":"+ age;
	}
}
