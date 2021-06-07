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
			
			System.out.println("서버 실행");
			
			System.out.println("=================================");
		
			socket = ss.accept();
			
			System.out.println("client 접속");
			System.out.println("=================================");
			
			din = new DataInputStream(socket.getInputStream());
			dout = new DataOutputStream(socket.getOutputStream());
			
			Scanner scan = new Scanner(System.in);
					//초기화시 공백문자열도 인스턴스가 생기므로 null사용
			String str1  = null; // 받는 메세지
			String str2 = ""; // 보내는 메세지 
			
			while(!str2.equals("exit")) {
				
				str1 = din.readUTF();
				System.out.println("Client Message : "+str1);
				
				str2 = scan.nextLine();
				dout.writeUTF(str2);
				dout.flush();
			}		
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			
			Util.close(din);
			Util.close(dout);
			Util.close(ss);
			Util.close(socket);
		}
			/*if(din != null) {
				try {
				din.close();
				} catch (IOException e) {
				e.printStackTrace();
				}
			}
			if(dout != null) {
				try {
					dout.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if(socket != null) {
				try {
					socket.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if(ss != null) {
				try {
					ss.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}*/		
	}
}