package bruteForce;

import java.util.ArrayList;
import java.util.Scanner;

public class FindMathFactor {

	public static void main(String[] args) {
		// 약수 구하기

		Scanner scan = new Scanner(System.in);
		// N : 약수
		System.out.println("숫자를 입력하세요.");
		int N = scan.nextInt();
		// K : N의 약수 중 k 번쨰로 작은 수를 출력
		System.out.println("숫자를 입력해주세요.");
		int k = scan.nextInt();
		ArrayList<Integer> list = new ArrayList<>();
		//
		for (int i = 1; i <= N; i++) {
			if (N % i == 0) {
				list.add(i);
			}
		}
		for(int i =0; i<list.size(); i++) {
			System.out.printf(list.get(i)+" ");
		}
		
		System.out.println();
		
		for (int i = 0; i < list.size();) {
				if(list.size() < k) {
					System.out.println(0);
					break;
				}else {
					System.out.println(list.get(k-1));
					break;
					
				}
			}
			
		}


}
