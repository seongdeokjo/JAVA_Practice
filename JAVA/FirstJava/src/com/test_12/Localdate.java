package com.test_12;

import java.time.*;
import java.time.temporal.ChronoUnit;

public class Localdate {

	public static void main(String[] args) {

//		LocalDate cuurentTime = LocalDate.now();
		LocalDate cuurentTime = LocalDate.now();
		LocalDate myDate = LocalDate.of(1996, 02, 17);
		
		//ChronoUnit 클래스의 days.between 함수를 사용해서 내 생일부터 현재 날짜 까지의 차를 구한다.
		long days = ChronoUnit.DAYS.between(myDate, cuurentTime);
		System.out.println(days);
		
		Period period = cuurentTime.until(myDate);
//		System.out.println(period.getDays());
		
	}
}