package bruteForce;

import java.util.Arrays;
import java.util.Scanner;

public class FindSevenDwarf {

	public static void main(String[] args) {
//		��ȩ �������� Ű�� �־����� ��,�ϰ� �����̸� ã�� ���α׷��� �ۼ��Ͻÿ�.

//		��ȩ �����̵��� Ű�� �־�����. �־����� Ű�� 100�� ���� �ʴ� �ڿ����̸�,
//		��ȩ �������� Ű�� ��� �ٸ���, 
//		������ ������ ���� ������ ��쿡�� �ƹ��ų� ����Ѵ�.

//		�ϰ� �������� Ű�� ������������ ����Ѵ�. 
//		�ϰ� �����̸� ã�� �� ���� ���� ����.

		Scanner scan = new Scanner(System.in);

		// 9���� Ű�� ��� �迭
		int N = 9;
		int arr[] = new int[N];
		int sum = 0;
		boolean check = false;
		//9���� Ű�� �Է��ϰ� 
		for (int i = 0; i < arr.length; i++) {
			System.out.println("9���� Ű�� �Է��ϼ���.");
			arr[i] = scan.nextInt();
			sum += arr[i];
		}
		
		for(int i =0; i <9; i++) {
			if(check) {
				break;
			}
			for(int j = 0; j <9; j++) {
				//���Ϲ����� ����� ���ϱ� ���ؼ� ��
				if(i==j) {
					continue;
				}
				//7���� Ű������ 100�� �˰� �ֱ� ������ ��ü 9���� Ű���� ������ 2���� Ű�� ���� �� �ش��ϴ� �迭�� ���� 0���� ����
				if(sum - arr[i] - arr[j] == 100) {
					arr[i] = 0;
					arr[j] = 0;
					check = true;
					break;
				}
			}
		}
		//�������� ����
		Arrays.sort(arr);
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] != 0) {
				System.out.println(arr[i]);
			}
		}
		
		
		
	}
}