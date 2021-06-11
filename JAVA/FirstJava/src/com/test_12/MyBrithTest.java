package com.test_12;

import java.util.Calendar;

public class MyBrithTest {

	public static void main(String[] args) {
		// 자신의 생일을 기준으로 오늘까지 몇일을 살았는지 출력하는 프로그램을 만들어봅시다.
		// localDatetime -> 사용해보기
		// milli초는 1/1000 초
		Calendar cal = Calendar.getInstance();
		Calendar current = Calendar.getInstance();

		long days = 0;

		cal.set(1996, 02, 17);
		days = (current.getTimeInMillis() - cal.getTimeInMillis()) / (24 * 60 * 60 * 1000);
		System.out.println("살아온 날은 지금까지 :" + days + "일 입니다.");
	}
}