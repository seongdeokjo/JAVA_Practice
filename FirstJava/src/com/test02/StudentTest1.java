package com.test02;

public class StudentTest1 {
	
	public static void main(String[] args) {
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
		int sum1 = 0;
		int sum2 = 0;
		int sum3 = 0;
		double avgMath = 0;
		double avgEng = 0;
		double avgKor = 0;
			for(int i =0; i <stu.length; i++) {		
				sum1 += stu[i].getMath();
				sum2 += stu[i].getEng();
				sum3 += stu[i].getKor();
			}
			avgMath = sum1 / stu.length;
			avgEng = sum2 / stu.length;
			avgKor = sum3 / stu.length;
			System.out.println(avgMath);
			System.out.println(avgEng);
			System.out.println(avgKor);
				
	}

}
