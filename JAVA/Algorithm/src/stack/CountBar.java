package stack;

import java.util.Scanner;

public class CountBar {

	public static void main(String[] args) {
//		아래 그림처럼 높이만 다르고 (같은 높이의 막대기가 있을 수 있음) 모양이 같은 막대기를 일렬로 세운 후, 왼쪽부터 차례로 번호를 붙인다. 
//		각 막대기의 높이는 그림에서 보인 것처럼 순서대로 6, 9, 7, 6, 4, 6 이다. 
//		일렬로 세워진 막대기를 오른쪽에서 보면 보이는 막대기가 있고 보이지 않는 막대기가 있다. 
//		즉, 지금 보이는 막대기보다 뒤에 있고 높이가 높은 것이 보이게 된다. 예를 들어, 그림과 같은 경우엔 3개(6번, 3번, 2번)의 막대기가 보인다.
//
//		N개의 막대기에 대한 높이 정보가 주어질 때, 오른쪽에서 보아서 몇 개가 보이는지를 알아내는 프로그램을 작성하려고 한다.
//
//		입력
//		첫 번째 줄에는 막대기의 개수를 나타내는 정수 N (2 ≤ N ≤ 100,000)이 주어지고 
//		이어지는 N줄 각각에는 막대기의 높이를 나타내는 정수 h(1 ≤ h ≤ 100,000)가 주어진다.
//
//		출력
//		오른쪽에서 N개의 막대기를 보았을 때, 보이는 막대기의 개수를 출력한다.

		// 스캐너 사용
		Scanner scan = new Scanner(System.in);
		// 막대기 n개 개수 저장
		int size = scan.nextInt();
		// 각 막대기의 높이를 배열로 저장
		int[] arr = new int[size];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scan.nextInt();
		}
		// 보이게 되는 막대의 개수 (첫 인덱스를 포함시키기 위해 1부터 시작)
		int cnt = 1;
		// 마지막 값부터 비교하기 위한 max변수
		int max =arr[arr.length-1];
		
		// 마지막 index 값을 변수로 지정해서 시작값은 마지막 전 부터 
		for (int i = arr.length - 2; i >= 0; i--) {
			// 마지막 값을 max 비교시작 -> 마지막 인덱스 보다 크면 max 값 변경 , +1증가 시키기
			
			if(arr[i] > max) {
				max = arr[i];
				cnt++;
			}
		}
		System.out.println(cnt);	
		scan.close();
	}
}
