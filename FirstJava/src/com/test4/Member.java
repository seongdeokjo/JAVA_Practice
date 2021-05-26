package com.test4;

public class Member {
	// 순서 -> 변수 - 생성자 - 메서드 순
	private String name;

	final String ph;
	 String major;
	int grade;
	String email;
	String birth;
	String address;

	// 생성자 -> 초기화 메서드, 인스턴스를 생성할 때 단 한번, 인스턴스 변수를 초기화 한다.
	// 오버로딩 -> 이름이 같은 메소드 정의
	public Member(String name, String ph, String major, int grade, String email) {
		// 자동으로 해당 파라미터에 적합한 자신의 생성자를 호출한다.
		this(name, ph, major, grade, email, null, null);
		// this.name = name;
		// this.ph = ph;
		// this.major = major;
		// this.grade = grade;
		// this.email = email;
	}

	public Member(String name, String ph, String major, int grade, String email, String birth, String address) {
		// this(name,ph,major,grade,email);
		this.name = name;
		this.ph = ph;
		this.major = major;
		this.grade = grade;
		this.email = email;
		this.birth = birth;
		this.address = address;
	}
	
	public Member(String name, String ph, String major) {
		this(name, ph, major, 0, null, null, null);
	}
	//final ph 생성자를 통한 초기화 
	 Member() {
		this.ph = "010-9999-9999";
	}

	
	public void info() {
		System.out.println("이름: " + this.name);
		System.out.println("전화번호: " + this.ph);
		System.out.println("전공: " + this.major);
		System.out.println("학년: " + this.grade);
		System.out.println("이메일주소: " + this.email);

		if (this.birth == null) {
			System.out.println("생일: 입력된 데이터가 없습니다.");
		} else {
			System.out.println("생년월일: " + this.birth);
		}
		if (this.address != null) {
			System.out.println("주소: " + address);
		} else {
			System.out.println("주소: 입력된 데이터가 없습니다.");
		}

	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}