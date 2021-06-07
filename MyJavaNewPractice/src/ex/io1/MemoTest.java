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

public class MemoTest {	
	public static void main(String[] args) {
		//저장된 파일의 내용을 출력해주는 기능의 인스턴스 생성
		MemoUtil memoUtil = new MemoUtil();
	
//	    메모장 기능을 구현하고 경로 폴더를 지정하고 쓰는 메서드 
		memoUtil.writeFile();	
//	    파일 읽기 기능을 구현해봅시다.
		memoUtil.findFile();
//		메모리스트를 보여줍니다.
		memoUtil.listFile();
		
	}	
}
// 클래스를 나누어서 세분화 해보기 : 읽는 클래스 / 쓰는 클래스 / 보여주는 클래스 
// 추가 기능   :  저장된 폴더,파일을 검색하는 메서드
//  ""       :  검색 폴더를 찾아서 삭제 해주는 메서드
// 		    :저장된 파일의 내용을 보여주는 메서드 