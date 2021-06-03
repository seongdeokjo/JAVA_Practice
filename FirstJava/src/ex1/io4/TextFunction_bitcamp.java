package ex1.io4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.Scanner;

public class TextFunction_bitcamp {

	
	public static String getUserInput() {
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		return input;
	}
	public static String now() {
		LocalDateTime time = LocalDateTime.now();
		String now = "현재날짜는"+time+"입니다.";
		return now;
	}
	public static void main(String[] args) throws IOException {
		String time;
		String title;
		String content;
		String name;
		int cnt = 0;
		System.out.println("생성 폴더를 입력해주세요.");
		String pathF = getUserInput();
		
		File makeDir = new File("C:\\myTextEx"+File.separator+pathF);
		
		if(!makeDir.exists()) {
			makeDir.mkdir();
			System.out.println(pathF+"의 폴더를 생성하였습니다.");
		}
		
		System.out.println("파일의 제목을 입력해주세요.");
		title = getUserInput();
		System.out.println("내용을 입력해주세요.");
		content = getUserInput();
		System.out.println("작성자를 입력해주세요.");
		name = getUserInput();
		System.out.println("시간은 현재 시간을 기준으로 저장됩니다.");
		time = now();
		
		//저장
		BufferedWriter out = new BufferedWriter(new FileWriter(makeDir+File.separator+title+".txt"));
			
		System.out.println("작성을 시작합니다.");
		
			out.write(title);
			out.newLine();
			out.write(content);
			out.newLine();
			out.write(name);
			out.newLine();
			out.newLine();
			out.write(time);
			out.write(cnt++);
			
			out.close();
			
			System.out.println("작성이 완료되었습니다.");
		
		//읽기
		System.out.println("찾을 파일을 입력해주세요");
		title = getUserInput();
		BufferedReader in = new BufferedReader(new FileReader(makeDir+File.separator+title+".txt"));
		String str = null;
		while(true) {
			str = in.readLine();
			if(str == null) {
				System.out.println("프로그램을 종료합니다.");
				break;
				
			}
			System.out.println(str);
		}
		System.out.println("찾기 완료");
	}
}