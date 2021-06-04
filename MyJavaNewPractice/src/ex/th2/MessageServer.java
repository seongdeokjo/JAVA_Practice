package ex.th2;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class MessageServer {

	
	
	
	public static void main(String[] args) {
		DataInputStream din = null;
		DataOutputStream dout = null;
		ServerSocket ss = null;
		Socket socket = null;
				
		try {
			 ss = new ServerSocket(8888);
		
			 socket = ss.accept();
			
		din = new DataInputStream(socket.getInputStream());
		 dout = new DataOutputStream(socket.getOutputStream());
			
			Scanner scan = new Scanner(System.in);
					//초기화시 공백문자열도 인스턴스가 생기므로 null사용
			String str1  = null; // 받는 메세지
			String str2 = null; // 보내는 메세지 
			
			while(!str2.equals("exit")) {
				
				str1 = din.readUTF();
				System.out.println(str1);
				
				str2 = scan.nextLine();
				dout.writeUTF(str2);
				dout.flush();
			}
			
			
		
			
			
			
			
		
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			din.close();
			dout.close();
			socket.close();
			ss.close();
		}
	}
}