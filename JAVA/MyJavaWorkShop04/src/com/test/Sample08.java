package com.test;
public class Sample08 {
	public static void main(String[] args) {	
		int a = 10;
		do {
			System.out.println(a);
			a++;
			System.out.println();
		}while(a < 20) ;
			
		// break
		for(int i = 1; i <= 10; i++) {
			if(i == 3) {
			//	break;
				continue;
			}
			System.out.println(i);
		}
		int j = 0;
		while(j <= 10) {
			if(j == 2) {
				break;
			}
			System.out.println(j);
			j++;
		}
		
		
		
		// continue 
		//2의 배수를 구하시오.(1...10 사이의 수에서)
		for(int b = 1; b <= 10; b++) {
			if(b % 2 != 0) { //case 1 
				continue;
			}
			if(b % 2 == 0) { //case 2
				System.out.println(b);
			}
			System.out.println(b);
		}
		

	}
}
