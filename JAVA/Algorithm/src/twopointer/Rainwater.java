package twopointer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Rainwater {
	
	// 백준 14719 빗물 two pointer
//	첫 번째 줄에는 2차원 세계의 세로 길이 H과 2차원 세계의 가로 길이 W가 주어진다. (1 ≤ H, W ≤ 500)
//	두 번째 줄에는 블록이 쌓인 높이를 의미하는 0이상 H이하의 정수가 2차원 세계의 맨 왼쪽 위치부터 차례대로 W개 주어진다.
//	따라서 블록 내부의 빈 공간이 생길 수 없다. 또 2차원 세계의 바닥은 항상 막혀있다고 가정하여도 좋다.
	
// 참고 코드 : https://hidelookit.tistory.com/96	
	private static int H,W;
	private static int[] block;
	private static int left,center,right;
	
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		String[] input = bf.readLine().split(" ");
		
		H = Integer.parseInt(input[0]);
		W = Integer.parseInt(input[1]);
		
		block = new int[W];
		
		input = bf.readLine().split(" ");
		for(int i = 0; i<W; i++) {
			block[i] = Integer.parseInt(input[i]);
		}
		
		left = center = right = 0;
		
		//가운데 기준으로 왼쪽 오른쪽 큰 친구를 찾는다.
				for (int i=1; i<W-1; i++) {
					left = right = 0;
					System.out.println("----------------------------------------------------");
					System.out.println("i = "+i);
					System.out.println("----------------------------------------------------");
					//i기준 왼쪽 중 제일 높은 친구 찾기
					for (int j=0; j<i; j++) {
						System.out.println("============i 기준 왼쪽 중 제일 높은 친구 찾기===========");
						System.out.println("block["+j+"] = "+block[j]);
						left = Math.max(left, block[j]);
						System.out.println("left = "+left);
					}
					
					//i기준 오른쪽 중 제일 높은 친구 찾기
					for (int j=i+1; j<W; j++) {
						System.out.println("============i 기준 오른쪽 중 제일 높은 친구 찾기===========");
						System.out.println("block["+j+"] = "+block[j]);
						right = Math.max(right, block[j]);
						System.out.println("right = "+right);
					}
					
					//현재 block이 left와 right보다 작으면 더해주기
					if (block[i] < left && block[i] < right) {
						System.out.println("============현재 block이 left , rigth 보다 작으면 더하기===========");
						System.out.println("left = "+left+" right = "+right);
						System.out.println("block["+i+"] = "+block[i]);
						System.out.println("min = "+Math.min(left, right));
						center += Math.min(left, right) - block[i];
						System.out.println("center = "+center);
						
					}
					
				}
				
				System.out.println(center);
		
	}
	
}
