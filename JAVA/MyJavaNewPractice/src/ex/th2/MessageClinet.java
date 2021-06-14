package ex.th2;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class MessageClinet {

	public static void main(String[] args) {
		
		Socket socket = null;
		
		DataInputStream din =null;
		DataOutputStream dout = null;
		
		try {
											//중복되지않는 포트번호부여
			 socket = new Socket("localhost",8888);
			 
			 din = new DataInputStream(socket.getInputStream());
			 dout = new DataOutputStream(socket.getOutputStream());
			 
			 Scanner scan = new Scanner(System.in);
			 
			 String str1 = null; // 받는 데이터
			 String str2 = ""; // 보내는 데이터
			 
			 System.out.println("Server가 접속완료했습니다.");
			 System.out.println("======================================");
			 //str2의 참조하는 인스턴스가 없기 때문에 null을 사용할 수 없다.
			 while(!str2.equals("exit")) {
				
				 //데이터 전송
				 str2 = scan.nextLine();
				 dout.writeUTF(str2);
				 
				 str1 = din.readUTF();
				 System.out.println("Server Message : "+str1 );
			 }
					
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			Util.close(socket);
			Util.close(din);
			Util.close(dout);
		}
	}
}