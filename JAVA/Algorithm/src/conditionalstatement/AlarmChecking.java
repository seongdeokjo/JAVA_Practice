package conditionalstatement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class AlarmChecking {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
        
		int H = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
        
		if (M < 45) {
            H--;
			if (H < 0) {
				H = 23;
			}
			M = 60 - (45- M);
			
			System.out.println(H+" "+M);
		} else{
            System.out.println(H+" "+(M -45));
        }

	}
}
