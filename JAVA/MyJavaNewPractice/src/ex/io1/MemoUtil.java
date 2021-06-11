package ex.io1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class MemoUtil {
	File[] list;
private	File utilMemo;

	//현재 시간을 저장하는 메서드
	public static String nowDateTime() {		
		LocalDateTime current = LocalDateTime.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yy년 MM월 dd일 hh시 mm분");
		String now = current.format(formatter);
		return now;
	}
	// String 타입으로 리턴해주는 스캐너 메서드
	public static String getUserInput() {
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		return input;
	}
	
	public void listFile() {
		System.out.println("찾을 경로의 폴더를 입력해주세요.");
		String rootFolder = getUserInput();
		utilMemo = new File(rootFolder);
		if(utilMemo.exists()) {
		list = utilMemo.listFiles();
		for(int i = 0; i < list.length; i++) {
			System.out.println(list[i].getName());
			}
		}else {
			System.out.println("잘못된 경로입니다 다시 입력하세요.");
		}
	}
	
	public void findFile() {
		System.out.println("찾을 경로의 폴더를 입력해주세요");
		String findFolder = getUserInput();
		utilMemo =	new File(findFolder);
		if(utilMemo.exists()) {
		System.out.println("찾을 파일의 제목을 입력해주세요.");
		String memoFile = getUserInput();
			
			try {
				BufferedReader in = new BufferedReader(new FileReader(utilMemo+"\\"+memoFile+".txt"));
				String str;
				while(true) {
					str = in.readLine();
					if(str == null) {
						break;
					}
					System.out.println(str);
				}
				in.close();
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}else {
			System.out.println(findFolder+"의 폴더가 존재하지 않습니다.");
		}
	}
	
	public void writeFile() {
//		1.콘솔기반으로 메모장 기능을 만들어 봅시다.
		//제목,내용,날짜 		
		System.out.println("파일에 메모할 내용을 입력해주세요.");
		System.out.print("제목을 입력하세요: >> ");
		String title = getUserInput();
		System.out.print("작성자를 입력하세요. : >>");
		String name = getUserInput();
		System.out.print("내용을 입력하세요.: >>");
		String content = getUserInput();
		System.out.println("날짜와 시간은 현재시간으로 저장됩니다.");
		String nowT = nowDateTime();
//		①File 클래스를 이용해서 저장 폴더 생성
		//경로 생성 
		System.out.println("저장할 경로와 폴더명을 입력해주세요.");
		String newDir = getUserInput();
		File memoF = new File(newDir);
		if(!memoF.exists()) {
			//경로의 폴더를 만들어 주는 메서드 
			memoF.mkdirs();
			System.out.println("메모장 폴더를 생성합니다.");
		}
//		②문자기반 스트림을 이용해서 날짜와 제목, 메모를 파일에 저장
		//스캐너로 입력받은 문자열을 write메소드에 인자로 전달
		try {
			
		//	③파일의 이름은 날짜와 메모의 제목을 이용해서 생성			
			BufferedWriter bWrite = new BufferedWriter(new FileWriter(newDir+"\\"+title+".txt"));
			bWrite.write("제목 :"+title);
			bWrite.newLine();
			bWrite.write("작성자 :"+name);
			bWrite.newLine();
			bWrite.write("내용 :"+ content);
			bWrite.newLine();
			bWrite.write("작성 시간 :"+nowT);			
			bWrite.close();
			System.out.println("작성을 완료하였습니다.");
		
	}	catch (FileNotFoundException e) {
		e.printStackTrace();
	} catch (IOException e) {
		e.printStackTrace();
	}
	}
}