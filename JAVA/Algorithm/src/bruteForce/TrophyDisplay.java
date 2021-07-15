package bruteForce;

import java.util.Scanner;

public class TrophyDisplay {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt(); // 트로피 N의 개수
		int[] height = new int[N]; // 트로피 높이를 트로피 개수 만큼 담는 배열
		
		int cntL = 0; //왼쪽에서 보이는 개수
		int result = 0;
		int index = height[0];
	
		int cntR = 0; //오른쪽에서 보이는 개수
		int result1 = 0;	
		int index1 = height[0];
		
		//트로피 높이 입력
		for(int i =0; i<N; i++) {
			height[i] = scan.nextInt();
//			System.out.println(height[i]);
		}
		
		//왼쪽에서 보이는 개수 => ++
		for(int i =0; i<height.length; i++) {
			if(height[i] >= index) {
				index = height[i];
				cntL++;
			}
			result = cntL;
		}
		
		//오른쪽에서 보이는 개수 => --
		for(int i = height.length-1; i>=0; i--) {
			if(height[i] >= index1) {
				index1 = height[i];
				cntR++;
			}
			result1 = cntR; 
		}
		System.out.println(result);
		System.out.println(result1);
	}
}