package com.test3;

//Person 클래스를 정의 
class Person {

	// 인스턴스 변수의 경우 초기화를 생략 가능
	// 주민등록 번호 rrn(resident registration number)
	// 이름을 저장하는 변수,주민등록번호를 저장하는 변수를 정의
	// 성별을 저장하는 변수를 정의
	String name;
	String rrn;
	int age;
	String gender;

	// 생성자를 정의해서 인스턴스 변수들을 초기화
	public Person(String name, String rrn, int age, String gender) {
		this.name = name;
		this.rrn = rrn;
		this.age = age;
		this.gender = gender;
	}

	// 인사하는 메소드를 정의
	public void insa() {
		System.out.println("안녕하세요 저는 " + name + "입니다." + age + "살 입니다.");
	}
}

// Person 클래스를 상속
class Male extends Person {
	private String hobby;

	public Male(String name, String rrn, int age, String hobby) {
		super(name, rrn, age, "남자");
		this.hobby = hobby;

	}

	public void insa() {
		System.out.println("안녕하세요 저는 " + name + "입니다." + age + "살 입니다.");
		System.out.println("성별은 " + gender + "입니다.");
		System.out.println("저의 취미는 " + getHobby() + "입니다.");
	}

	public String getHobby() {
		return hobby;
	}

	public void setHobby(String hobby) {
		this.hobby = hobby;
	}

}

// Person 클래스를 상속
class Female extends Person {
	private String hobby;

	public Female(String name, String rrn, int age, String hobby) {
		super(name, rrn, age, "여자");
		this.hobby = hobby;
	}

	public void insa() {
		System.out.println("안녕하세요 저는 " + name + "입니다." + age + "살 입니다.");
		System.out.println("성별은 " + gender + "입니다.");
		System.out.println("저의 취미는 " + getHobby() + "입니다.");
	}

	public String getHobby() {
		return hobby;
	}

	public void setHobby(String hobby) {
		this.hobby = hobby;
	}
	// public void play() {
	// System.out.println("저의 취미는 "+hobby+"입니다.");
	// }
}

public class PersonTest {
	public static void main(String[] args) {
		Person male = new Male("둘리", "000000-1000000", 30, "운동");
		Person female = new Female("릴리", "000000-2000000", 29, "요리");
		male.insa();
		System.out.println("============================");
		female.insa();
	}
}