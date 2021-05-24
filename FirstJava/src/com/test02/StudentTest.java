package com.test02;
public class StudentTest {
	public static void main(String[] args) {
		//Student 객체배열을 만들고 인스턴스와 생성자 초기화 
		Student[] stu = {
			new Student("김",96,90,80),
			new Student("조",90,80,70),
			new Student("이",70,86,60),
			new Student("최",75,80,90),
			new Student("박",80,70,85),
			new Student("강",70,75,70)
		};
		double sum1 = 0;
		double avg1 = 0;
		// 개인 총점과, 개인평균을 구하기 위한 반복문 작성 
		for(int i =0; i <stu.length; i++) {		
			System.out.println("["+i+"]"+stu[i]+"-> 개인 총점: "+stu[i].total()+", 개인 평균:"+stu[i].avg());
			//sum1과 출력문의 순서가 바뀌게 된다면 avg() 메서드안에 개인 총점 점수가 저장되어있지않기 때문에 avg1값은 0이 출력된다.
			sum1 += stu[i].avg();
		}
		//반평균을 구하기 위해  저장된 개인 평균 값에 배열의 수 만큼 나눠주면 반 평균 점수가 된다./
			avg1 = sum1 / stu.length;
		System.out.println("반 평균: "+avg1);						
	}
}
