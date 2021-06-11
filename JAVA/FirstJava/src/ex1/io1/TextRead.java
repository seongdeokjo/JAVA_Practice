package ex1.io1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class TextRead {
	public void fileRead() throws IOException {
		String find;
		System.out.println("찾을 폴더명을 입력해주세요.");
		find = getUserInput();
		File findDir = new File("C:\\myjava"+File.separator+find);
		
		if(!findDir.exists()) {
			System.out.println("존재하지 않는 폴더입니다.");
		}else {
			System.out.println("찾을 파일 명을 입력해주세요.");
			String findFolder = getUserInput();
			
			File findF = new File("C:\\myjava"+File.separator+find+File.separator+findFolder+".txt");
			
			if(!findF.exists()) {
				System.out.println("존재하지 않는 파일입니다.");
			}else {
				System.out.println("파일 내용을 출력합니다.");
				BufferedReader in =new BufferedReader(new FileReader("C:\\myjava"+File.separator+find+File.separator+findFolder+".txt"));
				String str;
				while(true) {
					str = in.readLine();
					if(str == null) {
						break;
					}
					System.out.println(str);
				}
				System.out.println("출력이 완료되었습니다.");
			}
			
		}
	}
	public String getUserInput() {
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		return input;
	}
}
