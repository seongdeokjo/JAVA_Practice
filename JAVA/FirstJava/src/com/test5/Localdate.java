package com.test5;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Localdate {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("태어난 년도를 입력:");
		int year = scan.nextInt();
		System.out.println("태어난 월을 입력");
		int month = scan.nextInt();
		System.out.println("태어난 일을 입력");
		int day = scan.nextInt();
//		LocalDate cuurentTime = LocalDate.now();
		LocalDate cuurentTime = LocalDate.now();
		LocalDate myDate = LocalDate.of(year, month, day);
		
		//ChronoUnit 클래스의 days.between 함수를 사용해서 내 생일부터 현재 날짜 까지의 차를 구한다.
		long days = ChronoUnit.DAYS.between(myDate, cuurentTime);
		System.out.println(days);
		System.out.println("==================================================");
	long days1 = myDate.until(cuurentTime, ChronoUnit.DAYS);
		System.out.println(myDate);
		System.out.println(cuurentTime);
		System.out.println(days1);
		
	}
}