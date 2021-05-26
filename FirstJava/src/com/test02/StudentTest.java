package com.test02;
public class StudentTest {
	public static void main(String[] args) {
		//Student 객체배열을 만들고 인스턴스와 생성자 초기화 
		Student[] stu = {
			new Student("김씨",95,90,80),
			new Student("이씨",90,80,70),
			new Student("박씨",80,85,80),
			new Student("최씨",75,80,90),
			new Student("조씨",80,70,85),
			new Student("우씨",70,75,70),
			new Student("유씨",90,80,80),
			new Student("사씨",80,80,65),
			new Student("하씨",95,90,70),
			new Student("구씨",75,75,80)
		};
		double sum1 = 0;
		double avg1 = 0;
		// 개인 총점과, 개인평균을 구하기 위한 반복문 작성 
		for(int i =0; i <stu.length; i++) {		
			System.out.println("["+(i+1)+"]"+stu[i]+"-> 개인 총점: "+stu[i].total()+
								", 개인 평균:"+Math.round(stu[i].avg()*100)/100.0);
		//sum1과 출력문의 순서가 바뀌게 된다면 avg() 메서드안에 개인 총점 점수가 저장되어있지않기 때문에 avg1값은 0이 출력된다.
			
			sum1 += stu[i].avg();
		}
		//반평균을 구하기 위해  저장된 개인 평균 값에 배열의 수 만큼 나눠주면 반 평균 점수가 된다./
			
		avg1 = sum1 / stu.length;
		System.out.println("반 평균: "+Math.round(avg1*100)/100.0);						
	}
}
