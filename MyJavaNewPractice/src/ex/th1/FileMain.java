package ex.th1;

import java.io.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class FileMain {
	//현재 시간을 반환해주는 메서드
	public static String CurrentTime() {
		//현재 날짜와 시간을 가져온다.
		LocalDateTime currentT = LocalDateTime.now();
		//사용자가 원하는 형식으로 출력, 
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy년 MM월 dd일 HH시 mm분 ss초");
		//패턴을 만들어서 인자로 전달
		String nowTime = currentT.format(formatter);	
		return nowTime;
	}
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		// 원본 경로에 폴더 생성
		System.out.println("원본 경로에 저장될 폴더를 생성해주세요.");
		String originF = scan.nextLine();
		
		File originDir = new File("C:\\MyJavaOrigin\\" + originF);
		if (!originDir.exists()) {
			originDir.mkdir();
			System.out.println("원본 폴더 생성");
		}
		
		// 원본 폴더에 파일 생성
		System.out.println("원본 경로에 생성된 폴더에 저장할 파일이름을 입력해주세요.");
		String originN = scan.nextLine();
		File originFile = new File("C:\\MyJavaOrigin\\" + originF + "\\" + originN + ".txt");
		if (!originFile.exists()) {
		}
		try {
//			originFile.createNewFile();

			// BufferedWriter test
			BufferedWriter in = new BufferedWriter(new FileWriter(originFile));
			System.out.println("제목:");
			String title = scan.nextLine();
			System.out.println("작성자");
			String name = scan.nextLine();
			
			in.write("제목:"+title);
			in.newLine();
			in.write("작성자"+name);
			in.newLine();
			in.newLine();
			in.write("작성시간:"+CurrentTime());
			
			in.close();

			System.out.println("파일 생성");

		} catch (IOException e) {
			e.printStackTrace();
		}
		
		// 복사될 경로에 폴더 생성
		System.out.println("복사될 폴더의 이름을 입력하세요.");
		String copyF = scan.nextLine();
		File copyDir = new File("C:\\MyJavaOrigin\\" + copyF);
		if (!copyDir.exists()) {
			copyDir.mkdir();
			System.out.println("복사 폴더생성");
		}
		
		// 복사경로에 파일 생성
		System.out.println("생성된 폴더에 복사파일의 이름을 입력하세요.");
		String copyN = scan.nextLine();

		File copyFile = new File("C:\\MyJavaOrigin\\" + copyF + "\\" + copyN + ".txt");
		
		//Thread 생성 
		FileCopy fp = new FileCopy(originFile, copyFile);
		fp.start();
	}
}