package ex1.io3;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PlayerList {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		// file의 경로지정 
		File playerInfo = new File("C:\\myTextEx\\player");
		
		if(!playerInfo.exists()) {
			playerInfo.mkdirs();
			System.out.println("player 폴더를 생성하였습니다!");
		}
		// 인스턴스 저장
		ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(playerInfo+"\\Player.ser"));
		List<Player> player = new ArrayList<>();
		player.add(new Player("son",7,"tot",28));
		player.add(new Player("park",7,"mu",38));
		player.add(new Player("cha",1,"ger",33));
		player.add(new Player("ji",5,"ch",22));
		player.add(new Player("son",10,"tot",27));
				
		out.writeObject(player);
		out.close();
		System.out.println("저장을 완료하였습니다.");
		
		// 인스턴스 복원
		ObjectInputStream in = new ObjectInputStream(new FileInputStream(playerInfo+"\\Player.ser"));
			ArrayList<Player> rePlayer =(ArrayList<Player>) in.readObject();
			in.close();
			System.out.println("인스턴스 복원 완료!");
			//인스턴스 출력 
			System.out.println("인스턴스 출력");
			
			
			Iterator itr = rePlayer.iterator();
			while(itr.hasNext()) {
		System.out.println(itr.next());

			}
	}
}