package ex1;

import java.io.File;

public class FileMove {

	public static void main(String[] args) {
								//경로       , 파일 이름
//		File myFile = new File("C:\\myjava","origin.pdf");
		File myFile = new File("C:\\myjava\\origin.pdf");
		System.out.println(myFile);
		
		if(!myFile.exists()) {
			System.out.println("파일이 존재하지 않습니다.");
			System.out.println("프로그램을 종료합니다.");
			return;
		}
		
		//새로운 폴더 생성: 경로 생성 -> 생성 
		File newDir = new File("c:\\yourjava");
		System.out.println("1.exist ?? ----> "+ newDir.exists());
		
		//폴더가 존재 하지 않는 다면 
		if(!newDir.exists()) {
			//폴더 생성
			newDir.mkdir();
			System.out.println("2.exist ?? ----> "+ newDir.exists());
		}
		
		System.out.println(myFile.getName());
		
		//이동할 경로와 파일 이름 
		File newFile = new File(newDir, myFile.getName());
		
		//이동 
		myFile.renameTo(newFile);
		
		if(newFile.exists()) {
			System.out.println("파일 이동 성공");
		}else {
			System.out.println("파일 이동 실패");
		}
	}
}