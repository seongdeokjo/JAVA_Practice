package ex1.io3;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class PlayerTest {

	public static void main(String[] args) {
		try {
			//인스턴스 저장 
			ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("Object.ser"));
			out.writeObject(new Player("son",7,"tot",28));
			out.writeObject(new Player("park",7,"mu",38));
			out.close();
			
			//인스턴스 복원 
			ObjectInputStream in = new ObjectInputStream(new FileInputStream("Object.ser"));
			try {
				Player p1 = (Player) in.readObject();
				Player p2 = (Player) in.readObject();
				
				in.close();
				
			//복원된 정보 출력 
				p1.showData();
				p2.showData();
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
