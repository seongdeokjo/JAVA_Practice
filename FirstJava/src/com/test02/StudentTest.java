package com.test02;
public class StudentTest {
	public static void main(String[] args) {
		int mathSum = 0;
		int engSum = 0;
		int korSum = 0;
		double sumClass = 0;
		double avgClass = 0;
		//Student 객체배열을 만들고 인스턴스와 생성자 초기화 
		
		//student 타입의 인스턴스를 생성하고 배열에 저장하는 코드를 정의 해봅시다. 
		//Student[] students = new Student[10];
		//student[0] = new Student("홍길동",80,80,80);
		// ....
		//student[9] = new Student("김",90,90,90);
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
		//각 과목마다 총합을 구하여 평균 값을 구하는 기능을 추가해보자 
		System.out.print("이름 \t\t수학 \t 영어 \t 국어 \t 총점\t 평균");
		System.out.println("\n==================================================================");
		for(int i = 0; i <stu.length; i++) {
			System.out.print(stu[i].getName());
			System.out.print("\t\t");
			System.out.print(stu[i].getMath());
			System.out.print(" \t");
			System.out.print(stu[i].getEng());
			System.out.print(" \t");
			System.out.print(stu[i].getKor());
			System.out.print(" \t");
			System.out.print(stu[i].getTotal());
			System.out.print(" \t");
			System.out.println(stu[i].getAvg());
		}
		
				
		// 개인 총점과, 개인평균을 구하기 위한 반복문 작성 
		for(int i =0; i <stu.length; i++) {		
			System.out.println("["+(i+1)+"]"+stu[i]+"-> 개인 총점: "+stu[i].getTotal()+
								", 개인 평균:"+Math.round(stu[i].getAvg()*100)/100.0);
		//sum1과 출력문의 순서가 바뀌게 된다면 avg() 메서드안에 개인 총점 점수가 저장되어있지않기 때문에 avg1값은 0이 출력된다.			
			sumClass += stu[i].getAvg();
		// 각 과목의 평균값을 구하기 위해 각각의 get메소드를 이용하여 필요한 값만 호출한다. 	
			mathSum += stu[i].getMath();
			engSum += stu[i].getEng();
			korSum += stu[i].getKor();
		}
		//반평균을 구하기 위해  저장된 개인 평균 값에 배열의 수 만큼 나눠주면 반 평균 점수가 된다./			
		avgClass = sumClass / stu.length;
		System.out.println("반 평균: "+Math.round(avgClass*100)/100.0);
		System.out.println();
		System.out.println("==============각 과목의 평균==============");
		System.out.println("수학 과목의 평균은 =>"+(double)mathSum/stu.length);
		System.out.println("영어과목의 평균은 =>"+(double)engSum/stu.length);
		System.out.println("국어 과목의 평균은 =>"+(double)korSum/stu.length);
		
	}
}
