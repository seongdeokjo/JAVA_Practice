package com.test05;
import java.util.Arrays;
public class Test {
	public static void main(String[] args) {
		//���� ũ�Ⱑ �ٸ� �� �迭
		int[] one = { 10, 20, 13, 25};
		int[] two = { 2, 5, 0, 3, 1, 7 };
		// ���̰� �� �� �迭 ���
		if(one.length < two.length) {
			// ���� for���� �̿��ؼ� ù��° �迭�� �ι�° �迭�� ���� ��´�.
			for (int i = 0; i < two.length; i++) {
				for (int j = 0; j < two.length-1; j++) { 
					try {
						// ���� ���� �ε����� ���� ���� ���� ��´�.
						if (i == j) {
							System.out.println(one[i]+"/"+two[j]+"= "+one[i] / two[i]);
						} // byzero�� ���� ������ ����ó��
					} catch (ArithmeticException e) {
						System.out.println("������ �������");
						// �迭 one�� �ε��� ������ �ʰ��ϱ� ������ �߻� �� �� �ִ� ���� ����ó��
					} catch (ArrayIndexOutOfBoundsException e) {
						System.out.println("�ε��� ������ ����� ���� �����Ͽ����ϴ�.");
					}
				}
			}
		}else {
			System.out.println(" ");
		}				
	}
}
