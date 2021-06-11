package com.test02;

import java.util.ArrayList;
import java.util.Iterator;

class Food {
	public String toString() {
		return "Food";
	}
}
class ChinaFood extends Food {
	public String toString() {
		return "ChinaFood";
	}
}
class KoreanFood extends Food{
	public String toString() {
		return "KoreanFood";
	}
}

public class Sample15 {

	public static void main(String[] args) {
		Food[] foods = new Food[3];
		foods[0] = new Food();
		foods[1] = new ChinaFood();
		foods[2] = new KoreanFood();
	
		ArrayList al = new ArrayList();
		al.add(new Food());
		al.add(new ChinaFood());
		al.add(new KoreanFood());
		
		Iterator itr = al.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
