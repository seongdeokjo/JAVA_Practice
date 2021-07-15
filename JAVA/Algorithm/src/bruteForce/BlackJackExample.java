package bruteForce;

import java.util.Scanner;

public class BlackJackExample {
//Brute Force : 무식한 힘 -> 완전 탐색 
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int M = scan.nextInt();

		int arr[] = new int[N];
		for (int i = 0; i < N; i++) {
			arr[i] = scan.nextInt();
		}
		int result = search(arr, N, M);
		System.out.println(result);
	}

	static int search(int arr[], int N, int M) {
		int result = 0;
		for (int i = 0; i < N; i++) {
			for (int j = i + 1; j < N - 1; j++) {
				for (int k = j + 1; k < N - 2; k++) {
					int sum = arr[i] + arr[j] + arr[k];
					if (sum == M) {
						return result;
					}
					if (result < sum && sum < M) {
						result = sum;
					}
				}
			}
		}

		return result;
	}
}




