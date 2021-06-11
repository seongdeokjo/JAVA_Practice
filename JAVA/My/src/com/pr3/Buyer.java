package com.pr3;

import java.util.*;

public class Buyer {
	int money = 1000;
	int bounsPoint = 0;
	Vector v = new Vector();
	void buy(Product p) {
		if(money < p.price) {
			System.out.println("잔액이 부족하여 물건을 살 수 없습니다.");
			return;
		}else {
			money -= p.price;
			bounsPoint += p.bounsPoint;
			v.add(p);
			System.out.println(p+"을/를 구매하셨습니다.");
		}
	}
	void refund(Product p) {
		if(v.remove(p)) {
			money += p.price;
			bounsPoint = p.bounsPoint;
			System.out.println(p+" 을/를 반품하셨습니다.");
		}else {
			System.out.println("구입하신 제품 중 해당 제품이 없습니다.");
		}
	}
	void summary() {
		int sum = 0;
		String itemList = "";
		
		if(v.isEmpty()) {
			System.out.println("구입하신 제품이 없습니다.");
			return;
		}
		for(int i = 0; i < v.size(); i++) {
			Product p = (Product)v.get(i);
			sum += p.price;
			itemList += (i==0) ? "" + p : ", " + p;
		}
		System.out.println("구입하신 물품의 총금액은" +sum +"만원입니다.");
		System.out.println("구입하신 제품은 "+ itemList+ "입니다.");
	}
}
