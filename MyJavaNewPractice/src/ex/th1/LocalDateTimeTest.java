package ex.th1;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LocalDateTimeTest {
	public static void main(String args[] ) {
		LocalDateTime currentT = LocalDateTime.now();
		DateTimeFormatter formatter = DateTimeFormatter.ISO_DATE;
		String formatted = currentT.format(formatter);
		System.out.println(formatted);
		
		DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("yyyy년 MM월 dd일 HH시 mm분 ss초");
		String formatted2 = currentT.format(formatter2);
		System.out.println(formatted2);
	}
}
