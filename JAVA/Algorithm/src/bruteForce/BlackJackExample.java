package bruteForce;

import java.util.Scanner;

public class BlackJackExample {
//Brute Force : 완전탐색 알고리즘 
	public static void main(String[] args) {
		
//		문제: 제한된 시간 안에 N장의 카드 중에서 3장의 카드를 골라야 한다. 고른 카드의 합은 M을 넘지 않으면서 M과 최대한 가깝게 만들어야 한다.
//		N장의 카드에 써져 있는 숫자가 주어졌을 때, M을 넘지 않으면서 M에 최대한 가까운 카드 3장의 합을 구해 출력하시오.
				
//		첫째 줄에 카드의 개수 N(3 ≤ N ≤ 100)과 M(10 ≤ M ≤ 300,000)이 주어진다. 둘째 줄에는 카드에 쓰여 있는 수가 주어지며, 이 값은 100,000을 넘지 않는 양의 정수이다.
//		합이 M을 넘지 않는 카드 3장을 찾을 수 있는 경우만 입력으로 주어진다.
		
//		출력
//		첫째 줄에 M을 넘지 않으면서 M에 최대한 가까운 카드 3장의 합을 출력한다.
		
		Scanner scan = new Scanner(System.in);
		
		//  N(3 ≤ N ≤ 100) , M(10 ≤ M ≤ 300,000)
		System.out.println("N의 자릿수를 입력해주세요.");
		int N = scan.nextInt();
		System.out.println("M의 크기를 입력해주세요.");
		int M = scan.nextInt();
		
		//크기가 N인 배열생성
		int arr[] = new int[N];
		//N의 크기를 세주는 카운트
		int cnt = N;
		for(int i =0; i<N; i++) {
			System.out.println(N+"크기의 배열에 들어갈 숫자를 입력해주세요.");
			System.out.println(cnt--+"번 남았습니다.");
			arr[i] = scan.nextInt();
		}
		//입력된 배열 출력
		int result = search(arr,N,M);
		System.out.println(result);
	}
	static int search(int arr[], int N, int M) {	
		int result = 0;
		//카드 3장의 합이 M을 넘지않아야한다.
		//3중 for문 사용 
		for(int i = 0; i<N; i++) {
			for(int j = i+1; j<N-1; j++) {
				for(int k = j+1; k<N-2; k++) {
				int	sum = arr[i] + arr[j] + arr[k];
				//3개의 합이 M이면 종료
					if(sum == M) {
						return result;
					}
					//세 카드의 합이 이전 합보다 크면서 M보다 작을경우 갱신
					if(result < sum && sum < M ) {
						result = sum;
					}
				}
			}
		}
		
		return result;
	}
}