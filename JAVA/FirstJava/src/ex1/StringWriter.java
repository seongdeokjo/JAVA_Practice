package ex1;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class StringWriter {

	public static void main(String[] args) {
		try {
			
			BufferedWriter out = new BufferedWriter(new FileWriter("String.txt"));
			
			System.out.println("쓰기 시작");
			out.write("손흥민 - 안녕하세요!");
			out.newLine();
			out.write("반갑습니다.");
			out.newLine();
			out.write("2021.06.02");
			out.newLine();
			out.write("손흥민 착석");
			
			out.close();
			
			System.out.println("작성 완료");
		
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}