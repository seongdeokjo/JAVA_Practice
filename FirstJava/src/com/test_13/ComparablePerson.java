package com.test_13;

import java.util.*;

class Person implements Comparable<Person>{
	String name;
	int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void showData() {
		System.out.printf("%s, %d \n", this.name,this.age);
	}
	
	@Override
	public int compareTo(Person o) {
//		if(this.age > o.age) {
//			return 1; // 양수
//		}else if(this.age <o.age) {
//			return -1; // 음수
//			
//		}else {
//			return 0;
//		}
		return this.age - o.age;
//		return o.age - this.age;
	}
}
public class ComparablePerson {

	public static void main(String[] args) {
		TreeSet<Person> treeSet = new TreeSet<>();
		//데이터 저장
		treeSet.add(new Person("lee",24));
		treeSet.add(new Person("kim",29));
		treeSet.add(new Person("hong",21));
		
		//정렬
		Iterator<Person> itr = treeSet.iterator();
		while(itr.hasNext()) {
			itr.next().showData();	
		}
		
		
	}
}