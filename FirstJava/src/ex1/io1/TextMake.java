package ex1.io1;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.Scanner;

public class TextMake {
	
	public void FileMake() throws IOException {
		String makeDir;
		System.out.println("폴더명을 입력해주세요.");
		makeDir = getUserInput();
		File make = new File("C:\\myjava"+File.separator+makeDir);
		
		if(!make.exists()) {
			make.mkdir();
			System.out.println(make.getName()+" 폴더를 생성했습니다.");
		}
		
		String time = nowDateTime();
		System.out.println("제목을 입력해주새요.");
		String title = getUserInput();
		System.out.println("내용을 입력해주세요.");
		String content = getUserInput();
		
		writeText(makeDir,time,title,content);
		
	}
	public void writeText(String makeDir,String time,String title,String content) throws IOException {
		BufferedWriter out = new BufferedWriter(new FileWriter("C:\\myjava"+File.separator+makeDir+File.separator+title+".txt"));
		System.out.println("작성을 시작합니다.");
		out.write(time);
		out.newLine();
		out.write(title);
		out.newLine();
		out.write(content);
		
		out.close();
		System.out.println("작성을 완료하였습니다.");
	}
	
	public String nowDateTime() {
		LocalDateTime now = LocalDateTime.now();
		return "[현재 작성시간"+now+"]";
	}
	
	public String getUserInput() {
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		return input;
	}
}
