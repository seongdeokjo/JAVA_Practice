package com.test05;
import java.util.Arrays;
public class Test {
	public static void main(String[] args) {
		//서로 크기가 다른 두 배열
		int[] one = { 10, 20, 13, 25};
		int[] two = { 2, 5, 0, 3, 1, 7 };
		// 길이가 더 긴 배열 사용
		if(one.length < two.length) {
			// 이중 for문을 이용해서 첫번째 배열과 두번째 배열을 값을 얻는다.
			for (int i = 0; i < two.length; i++) {
				for (int j = 0; j < two.length-1; j++) { 
					try {
						// 서로 같은 인덱스를 가질 때만 값을 얻는다.
						if (i == j) {
							System.out.println(one[i]+"/"+two[j]+"= "+one[i] / two[i]);
						} // byzero에 의한 오류로 에외처리
					} catch (ArithmeticException e) {
						System.out.println("나누기 연산오류");
						// 배열 one의 인덱스 범위를 초과하기 때문에 발생 할 수 있는 문제 예외처리
					} catch (ArrayIndexOutOfBoundsException e) {
						System.out.println("인덱스 범위를 벗어나는 값에 접근하였습니다.");
					}
				}
			}
		}else {
			System.out.println(" ");
		}				
	}
}
