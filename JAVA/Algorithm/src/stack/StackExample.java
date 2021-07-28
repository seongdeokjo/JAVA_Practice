package stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Stack;
import java.util.StringTokenizer;

public class StackExample {

	public static void main(String[] args) throws IOException {
		// BufferedReader 객체 생성
        // new InputStreamReader 및 System.in
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String input = br.readLine();
		
		StringTokenizer st = null;

		ArrayList<Object> list = new ArrayList<Object>();
		Stack<String> stack = new Stack<String>();
		String[] array = {"a","b","c"};
		for(int i=0; i<array.length; i++) {
			System.out.println(stack.push(array[i]));
		}
		
		
	}

}
