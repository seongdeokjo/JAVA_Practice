package com.test02;

public class Student {
	// 학생이름, 국어점수, 영어점수, 수학점수를 저장하는 변수를 정의합니다.
	private String name;
	private int kor;
	private int eng;
	private int math;

	// 생성자 정의
	public Student(String name, int kor, int eng, int math) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}

	// 총점과 평균을 구해 결과를 반환하는 메소드를 정의 합니다.
	public int getTotal() {
		return this.kor + this.eng + this.math;
		
	}

	public double getAvg() {
		
		return  (double) getTotal() / 3;
	}

	// 변수는 캡슐화 getter/setter메소드를 정의 합니다.
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	@Override
	public String toString() {
		return name;
	}
}