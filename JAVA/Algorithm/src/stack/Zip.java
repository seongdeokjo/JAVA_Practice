package stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Zip {
	// 백준 1662번 문제 압축 : 재귀,스택
	
	/*
	 * 압축되지 않은 문자열 S가 주어졌을 때, 이 문자열중 어떤 부분 문자열은 K(Q)와 같이 압축 할 수 있다. K는 한자리 정수이고, Q는
	 * 0자리 이상의 문자열이다. 이 Q라는 문자열이 K번 반복된다는 뜻이다. 압축된 문자열이 주어졌을 때, 이 문자열을 다시 압축을 푸는
	 * 프로그램을 작성하시오.
	 * 
	 * 첫째 줄에 압축된 문자열 S가 들어온다. S의 길이는 최대 50이다. 문자열은 (, ), 0-9사이의 숫자로만 들어온다.
	 */
	
	private static int[] rigthIdxs = new int[51];
	private static String[] input;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Stack<Integer> st = new Stack<>();
		input = br.readLine().split("");
		
		for(int i=0; i<input.length; i++) {
			String value = input[i];
			if(value.equals("(")) {
				st.add(i);
			}
			if(value.equals(")")) {
				rigthIdxs[st.pop()] = i;
			}
			
		}
		System.out.println(getLength(0, input.length));
		
	}
	
	private static int getLength(int start, int end) {
		int len = 0;
		
		for(int i=start; i<end; i++) {
			if(input[i].equals("(")) {
				len += Integer.parseInt(input[i-1]) * getLength(i+1,rigthIdxs[i]) -1 ;
				i = rigthIdxs[i];
			}else {
				len++;
			}
		}
		return len;
	}
	
}
