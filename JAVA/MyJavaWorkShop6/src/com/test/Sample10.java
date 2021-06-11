package com.test;
//Encapsulation 으로 작성
// name, id, age를 접두사를 set,get으로 작성
class Member {
	private	String name;
	private	String id;
	private	int age;
	Member() {}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return this.name;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getId() {
		return this.id;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getAge() {
		return this.age;
	}
	
}
public class Sample10 {

	public static void main(String[] args) {
		Member s = new Member();
		s.setName("홍길동");
		s.setId("123");
		s.setAge(25);
		String name = s.getName(); //변ㅅ
		String id = s.getId();
		int age = s.getAge();
		System.out.println(name+" ,"+id+" ,"+age);
		
	}

}
