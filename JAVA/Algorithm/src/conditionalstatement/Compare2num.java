package conditionalstatement;

import java.util.Scanner;

public class Compare2num {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int A = scan.nextInt();
		int B = scan.nextInt();
		
		System.out.println((A > B) ? ">" : (A < B) ? " <" : "==");
	}
}
