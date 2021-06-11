package ex1.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.util.Scanner;

public class TextSample {

	public static void main(String[] args) {
		
		LocalDate currentTime = LocalDate.now();
		
		String today = "작성날짜: "+currentTime;
		
		String main;
		String content;
		
		File newFile = new File("C:\\myjava"+File.separator+"text");
		
		if(!newFile.exists()) {
			System.out.println("저장 공간을 생성 합니다.");
			newFile.mkdir();
		}
		
		try {
		Scanner scan = new Scanner(System.in);
		System.out.println("메모장 작성 시작");
		
		String end = "";
		
		while(!end.equals("1")) {
		System.out.println("제목을 입력해주세요.");
		main = scan.nextLine();
		System.out.println("내용을 입력해주세요.");
		content = scan.nextLine();
		
		BufferedWriter out = new BufferedWriter(new FileWriter(newFile+File.separator+main+".txt"));
		out.write(today);
		out.newLine();
		out.write("제목:"+main);
		out.newLine();
		out.write("내용:"+content);
		
		out.close();
		System.out.println("프로그램을 종료하시려면 1을 입력하세요 ");
		end = scan.nextLine();
		}
		System.out.println("작성 완료");
		
		System.out.println("찾을 메모의 제목을 입력하세요.");
		main = scan.nextLine();
		
		BufferedReader in = new BufferedReader(new FileReader(newFile+File.separator+main+".txt"));
		String str = null;
		while(true) {
			str = in.readLine();
			if(str == null) {
				break;
			}
			System.out.println(str);
		}
		
		in.close();
		
		System.out.println("폴더를 삭제합니다.");
		newFile.delete();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}