package conditionalstatement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FindLocationQuadrant {
	public static void main(String[] args) throws IOException {
//점의 좌표를 입력받아 그 점이 어느 사분면에 속하는지 알아내는 프로그램을 작성하시오. 단, x좌표와 y좌표는 모두 양수나 음수라고 가정한다.
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int x = Integer.parseInt(br.readLine());
		int y = Integer.parseInt(br.readLine());
		
		if(x > 0 && y > 0) {
			System.out.println(1);
		}else if( x < 0 && y > 0) {
			System.out.println(2);
		}else if( x < 0 && y < 0) {
			System.out.println(3);
		}else {
			System.out.println(4);
		}
		
	}
}
