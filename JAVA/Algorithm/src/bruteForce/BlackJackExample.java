package bruteForce;

import java.util.Scanner;

public class BlackJackExample {
//Brute Force : ����Ž�� �˰��� 
	public static void main(String[] args) {
		
//		����: ���ѵ� �ð� �ȿ� N���� ī�� �߿��� 3���� ī�带 ���� �Ѵ�. �� ī���� ���� M�� ���� �����鼭 M�� �ִ��� ������ ������ �Ѵ�.
//		N���� ī�忡 ���� �ִ� ���ڰ� �־����� ��, M�� ���� �����鼭 M�� �ִ��� ����� ī�� 3���� ���� ���� ����Ͻÿ�.
				
//		ù° �ٿ� ī���� ���� N(3 �� N �� 100)�� M(10 �� M �� 300,000)�� �־�����. ��° �ٿ��� ī�忡 ���� �ִ� ���� �־�����, �� ���� 100,000�� ���� �ʴ� ���� �����̴�.
//		���� M�� ���� �ʴ� ī�� 3���� ã�� �� �ִ� ��츸 �Է����� �־�����.
		
//		���
//		ù° �ٿ� M�� ���� �����鼭 M�� �ִ��� ����� ī�� 3���� ���� ����Ѵ�.
		
		Scanner scan = new Scanner(System.in);
		
		//  N(3 �� N �� 100) , M(10 �� M �� 300,000)
		System.out.println("N�� �ڸ����� �Է����ּ���.");
		int N = scan.nextInt();
		System.out.println("M�� ũ�⸦ �Է����ּ���.");
		int M = scan.nextInt();
		
		//ũ�Ⱑ N�� �迭����
		int arr[] = new int[N];
		//N�� ũ�⸦ ���ִ� ī��Ʈ
		int cnt = N;
		for(int i =0; i<N; i++) {
			System.out.println(N+"ũ���� �迭�� �� ���ڸ� �Է����ּ���.");
			System.out.println(cnt--+"�� ���ҽ��ϴ�.");
			arr[i] = scan.nextInt();
		}
		//�Էµ� �迭 ���
		int result = search(arr,N,M);
		System.out.println(result);
	}
	static int search(int arr[], int N, int M) {	
		int result = 0;
		//ī�� 3���� ���� M�� �����ʾƾ��Ѵ�.
		//3�� for�� ��� 
		for(int i = 0; i<N; i++) {
			for(int j = i+1; j<N-1; j++) {
				for(int k = j+1; k<N-2; k++) {
				int	sum = arr[i] + arr[j] + arr[k];
				//3���� ���� M�̸� ����
					if(sum == M) {
						return result;
					}
					//�� ī���� ���� ���� �պ��� ũ�鼭 M���� ������� ����
					if(result < sum && sum < M ) {
						result = sum;
					}
				}
			}
		}
		
		return result;
	}
}