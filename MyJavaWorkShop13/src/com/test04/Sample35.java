package com.test04;

import java.util.HashMap;
import java.util.Scanner;
interface IMap<T>{
	void check();
}
class Info<T> {
	private	T id;
	private T pass;
	Info(T id, T pass) {
		this.id = id;
		this.pass = pass;
	}
	public T getId() {
		return this.id;
	}
	public T getPass() {
		return this.pass;
	}
}
class Login<T extends Info> implements IMap<T> {
	

			
	
	@Override
	public void check() {
		
	}
	
}
public class Sample35 {

	public static void main(String[] args) {
		HashMap map = new HashMap();
		map.put("myId", "1234");
		map.put("asdf", "1111");
		map.put("asdf", "1234");
		map.put("1111", "1111");
		
		Scanner s = new Scanner(System.in);
		
		while(true) {
			System.out.println("id와 password를 입력하세요.");
			System.out.println("id :");
			String id = s.nextLine().trim();
			
			System.out.println("password :");
			String pass = s.nextLine().trim();
			System.out.println();
			
			if(!map.containsKey(id)) {
				System.out.println("입력하신 id는 존재하지 않습니다. 다시 입력해");
				continue;
			}
			if((map.get(id)).equals(pass)) {
				System.out.println("id와 비밀번호는 일치할 수 없습니다.");
				continue;
			}else {
				System.out.println("id와 비밀번호가 일치합니다.");
				break;
			}
			
		}
	}

}
