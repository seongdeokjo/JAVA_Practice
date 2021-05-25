package com.test4;
public class Member {
	String name;
	String ph;
	String major;
	int grade;
	String email;
	int birth;
	String address;
	public Member(String name, String ph, String major, int grade, String email) {
		this.name = name;
		this.ph = ph;
		this.major = major;
		this.grade = grade;
		this.email = email;
	}
	public Member(String name, String ph, String major, int grade, String email, int birth, String address) {
		this(name, ph, major, grade, email);
		this.birth = birth;
		this.address = address;
	}
	public int checkBirth() {
		if (birth != 0) {
			if (2006 <= birth || birth <= 1956) {
				System.out.println("무료 예방접종이 가능합니다.");
			} else {
				System.out.println("무료 접종 대상이 아닙니다.");
			}
		} else {
			System.out.println("출생연도를 입력해주세요.");
		}
		return birth;
	}
	public int testBirth() {
		if (birth != 0) {
			// 대한민국 20세 이상
			if (birth < 2001) {
				// 무료로 2년마다 건강검진을 받을 수 있고
				System.out.println("무료로 2년마다 건강 검진을 받을 수 있습니다.");
				// 짝수해에 태어난 사람은 올해가 짝수년이라면 검사 대상이 되고
				if (birth % 2 == 0) {
					System.out.println("올해 건강검진 대상자 입니다.");
				}
				// 40이상의 경우는 암 검사도 무료로 검사를 할 수 있다.
				if (birth < 1982) {
					System.out.println("40세 이상이므로 암 검사도 무료로 검사를 할 수 있습니다.");
				}
			}
		} else {
			System.out.println("출생연도를 기입해주세요.");
		}
		return birth;
	}
	public void info() {
		System.out
				.println(name + ", " + ph + ", " + major + ", " + grade + ", " + email + ", " + birth + ", " + address);
	}
}