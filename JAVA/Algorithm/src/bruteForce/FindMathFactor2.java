package bruteForce;

import java.util.Scanner;

public class FindMathFactor2 {

	public static void main(String[] args) {
		// 약수 구하기

		Scanner scan = new Scanner(System.in);

		int N = scan.nextInt();
		int K = scan.nextInt();
		int cntN = 0;
		int index = 0;
		int result = 0;

		for (int i = 1; i <= N; i++) {
			if (N % i == 0) {
				cntN++; // n의 약수의 개수 카운트
				index++; //입력된 k번째 자리의 값과 비교하기 위한 변수
				if (index == K) {
					result = i;
					break;
				}
			}
		}

		if (cntN < K) {
			System.out.println("0");
		} else {
			System.out.println(result);
		}
	}
}