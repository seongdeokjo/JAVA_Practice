package bfs_and_dfs;

import java.util.*;

public class AreaOfTheMatrix {
	// nhn 1차 pre-test example 행렬의 영역
	// 알고리즘 공부 미흡으로 거의 밑에 출처 코드 보고 공부
	// 참고 코드 : https://sublivan.tistory.com/9 
	private static int[][] visitied;
	private static int cnt;

	
	private static void solution(int sizeOfMatrix, int[][] matrix) {
		visitied = new int[sizeOfMatrix][sizeOfMatrix];
		ArrayList<Integer> list = new ArrayList<>();
		
		for(int i = 0; i < sizeOfMatrix; i++) {
			for(int j = 0; j < sizeOfMatrix; j++) {
				System.out.println("현재 ["+i+"],["+j+"]");
				if(matrix[i][j] == 1 && visitied[i][j] == 0) {
					System.out.println("matrix["+i+"]["+j+"] \t visitied["+i+"]["+j+"]" );
					dfs(i,j,matrix);
					list.add(cnt);
					cnt = 0;
				}
				System.out.println("=============================================================");
			}
		}
		// 첫째줄에 영역의 개수
		System.out.println(list.size());
		// 인접한 1의 개수 오름차순 출력
		Collections.sort(list);
		for(int result : list) {
			System.out.print(result+" ");
		}
		
	}
	
	private static void dfs(int x, int y, int[][] matrix) {
		visitied[x][y] = 1;
		System.out.println("현재 방문 좌표 : visitied["+x+"]["+y+"] = "+visitied[x][y]);
		// 우 -> x축 +
		if(x+1 < visitied.length && visitied[x+1][y] == 0 && matrix[x+1][y] == 1) {
			System.out.println("x축 우 방향 진입");
			dfs(x+1,y,matrix);
		}
		
		// 상 -> y축 +
		if(y+1 < visitied.length && visitied[x][y+1] == 0 && matrix[x][y+1] == 1) {
			System.out.println("y축 상 방향 진입");
			dfs(x,y+1,matrix);
		}
		
		// 좌 -> x축 -
		if(x-1 >= 0 && visitied[x-1][y] == 0 && matrix[x-1][y] == 1) {
			System.out.println("x축 좌 방향 진입");
			dfs(x-1,y,matrix);
		}
		
		// 하 -> y축 -
		if(y-1 >= 0 && visitied[x][y-1] == 0 && matrix[x][y-1] == 1) {
			System.out.println("y축 하 방향 진입");
			dfs(x,y-1,matrix);
		}
		cnt++;
		System.out.println("cnt : "+cnt);
	}
	
	
	private static class InputData{
		int sizeOfMatrix;
		int[][] matrix;
	}
	
	private static InputData processStdin() {
		InputData inputData = new InputData();
		
		try(Scanner scanner = new Scanner(System.in)){
			System.out.println("행렬의 사이즈를 입력하세요");
			inputData.sizeOfMatrix = Integer.parseInt(scanner.nextLine().replaceAll("\\s+", ""));
			System.out.println("sizeOfMatrix: "+inputData.sizeOfMatrix);
			inputData.matrix = new int[inputData.sizeOfMatrix][inputData.sizeOfMatrix];
			System.out.println("matrix: "+inputData.matrix.length);
			for(int i = 0; i < inputData.sizeOfMatrix; i++) {			
				String[] buf = scanner.nextLine().trim().replaceAll("\\s+", " ").split(" ");
				for(int j = 0; j < inputData.sizeOfMatrix; j++) {
					inputData.matrix[i][j] = Integer.parseInt(buf[j]);
				}
			}
		}catch(Exception e) {
			throw e;
		}
		
		return inputData;
	}
	
	public static void main(String[] args) throws Exception {
		InputData inputData = processStdin();		
		solution(inputData.sizeOfMatrix, inputData.matrix);		
	}	
}