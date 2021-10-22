package bfs_and_dfs;

import java.util.Scanner;

public class TestString {
	
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
	
		String a = "ww asd\t23132\ntes";
		System.out.println("0. trim 사용 : "+a.trim());
		// 단순 space 공백만 제거 \t(tap) \n(개행) 된 것은 사라지지 않는다.
		System.out.println("1. 단순 space 공백만 바뀜 : "+a.replaceAll("\s+", "")); // wwasd	23132
													 //	tes
		// 모든 공백 tap,newLine,space etc.. 제거되고 모든 문자열이 붙어서 출력됨 ("" -> 사용으로) 
		System.out.println("2. 모든 공백을 붙여서 출력 : "+a.replaceAll("\\s+", "")); // wwasd23132tes
		System.out.println("3. 모든 공백에 해당하는 자리에 space(한칸 공백)으로 대체  : "+a.replaceAll("\\s+", " "));
		System.out.println(a.trim().replaceAll("\\s+", "")); // wwasd23132tes
		System.out.println("4. 대체 공백과 trim을 같이 사용하면? : "+a.trim().replaceAll("\\s+", " ")); // ww asd 23132 tes
		// 정규표현식으로 모든 공백이 한칸 공백으로 바뀌었지만 trim의 기능 상쇄
		System.out.println("============================================================");
		System.out.println("split");
																	// 공백만큼 배열의 새로운 인덱스 추가
		String[] stArray = scan.nextLine().trim().replaceAll("\\s+", " ").split(" ");
		System.out.println("배열의 크기 :"+stArray.length);
		for(String list : stArray) {		
			System.out.println("저장된 리스트 출력: "+list);
		}

		System.out.println("-----------------------------------------------");
		try(Scanner scanner = new Scanner(System.in)){
			System.out.println("행렬의 사이즈를 입력하세요");
			int sizeOfMatrix = Integer.parseInt(scanner.nextLine().replaceAll("\\s+", ""));
			System.out.println("sizeOfMatrix: "+sizeOfMatrix);
			int[][] matrix = new int[sizeOfMatrix][sizeOfMatrix];
			System.out.println("matrix: "+matrix.length);
			for(int i = 0; i < sizeOfMatrix; i++) {

				System.out.println("i :"+i);
				String[] buf = scanner.nextLine().trim().replaceAll("\\s+", " ").split(" ");
				System.out.println("buf: "+buf.length);
				for(int j = 0; j < sizeOfMatrix; j++) {
					System.out.println("j : "+j);
					System.out.println("buf["+j+"] : "+buf[j]);
					matrix[i][j] = Integer.parseInt(buf[j]);
					System.out.println("matrix["+i+"]["+j+"] :"+matrix[i][j]);
				}
				
			}
		
		}catch(Exception e) {
			throw e;
		}
		
		
		
	}
	
}
