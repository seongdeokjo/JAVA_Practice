package ex1.io1;

import java.io.IOException;
import java.util.Scanner;

public class TextMain {
	public static int getUerInput() {
		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();
		return input;
	}
	
	public static void main(String[] args) {
		TextMake make = new TextMake();
		TextRead read = new TextRead();
		
		System.out.println("원하시는 메뉴를 선택하세요.");
		
		int num = getUerInput();
		
	while(!(num == 9)) {
		try {
			switch(num) {	
			case 1: 
				make.FileMake();			
				break;
			case 2 :
				read.fileRead();
				break;
			case 9 :
				System.out.println("");
				return;
				}
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
	}
}