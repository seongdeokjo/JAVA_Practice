package ex.th2;

import java.io.FilterInputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Util {
	//스태틱 메서드 오버로딩
	// 타입만 다를뿐 같은 코딩의 내용이기 때문에 
	public static void close(ServerSocket ss) {
		if(ss != null) {
			try {
				ss.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	public static void close(Socket s) {
		if(s != null) {
			try {
				s.close();
			}catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
						//dataInputStream의 상위 타입
	public static void close(FilterInputStream fin) {
		if(fin != null) {
			try {
				fin.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void close(FilterOutputStream fout) {
		if(fout != null) {
			try {
				fout.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
		
}
