package bruteForce;

import java.util.Arrays;
import java.util.Scanner;

public class FindSevenDwarf {

	public static void main(String[] args) {
//		아홉 난쟁이의 키가 주어졌을 때,일곱 난쟁이를 찾는 프로그램을 작성하시오.

//		아홉 난쟁이들의 키가 주어진다. 주어지는 키는 100을 넘지 않는 자연수이며,
//		아홉 난쟁이의 키는 모두 다르며, 
//		가능한 정답이 여러 가지인 경우에는 아무거나 출력한다.

//		일곱 난쟁이의 키를 오름차순으로 출력한다. 
//		일곱 난쟁이를 찾을 수 없는 경우는 없다.

		Scanner scan = new Scanner(System.in);

		// 9명의 키를 담는 배열
		int N = 9;
		int arr[] = new int[N];
		int sum = 0;
		boolean check = false;
		//9명의 키를 입력하고 
		for (int i = 0; i < arr.length; i++) {
			System.out.println("9명의 키를 입력하세요.");
			arr[i] = scan.nextInt();
			sum += arr[i];
		}
		
		for(int i =0; i <9; i++) {
			if(check) {
				break;
			}
			for(int j = 0; j <9; j++) {
				//동일번지의 계산을 피하기 위해서 ㄴ
				if(i==j) {
					continue;
				}
				//7명의 키의합이 100을 알고 있기 때문에 전체 9명의 키에서 랜덤의 2명의 키를 빼어 그 해당하는 배열의 값을 0으로 만듬
				if(sum - arr[i] - arr[j] == 100) {
					arr[i] = 0;
					arr[j] = 0;
					check = true;
					break;
				}
			}
		}
		//오름차순 정리
		Arrays.sort(arr);
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] != 0) {
				System.out.println(arr[i]);
			}
		}
		
		
		
	}
}