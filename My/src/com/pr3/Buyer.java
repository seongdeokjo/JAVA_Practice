package com.pr3;

import java.util.*;

public class Buyer {
	int money = 1000;
	int bounsPoint = 0;
	Vector v = new Vector();
	void buy(Product p) {
		if(money < p.price) {
			System.out.println("�ܾ��� �����Ͽ� ������ �� �� �����ϴ�.");
			return;
		}else {
			money -= p.price;
			bounsPoint += p.bounsPoint;
			v.add(p);
			System.out.println(p+"��/�� �����ϼ̽��ϴ�.");
		}
	}
	void refund(Product p) {
		if(v.remove(p)) {
			money += p.price;
			bounsPoint = p.bounsPoint;
			System.out.println(p+" ��/�� ��ǰ�ϼ̽��ϴ�.");
		}else {
			System.out.println("�����Ͻ� ��ǰ �� �ش� ��ǰ�� �����ϴ�.");
		}
	}
	void summary() {
		int sum = 0;
		String itemList = "";
		
		if(v.isEmpty()) {
			System.out.println("�����Ͻ� ��ǰ�� �����ϴ�.");
			return;
		}
		for(int i = 0; i < v.size(); i++) {
			Product p = (Product)v.get(i);
			sum += p.price;
			itemList += (i==0) ? "" + p : ", " + p;
		}
		System.out.println("�����Ͻ� ��ǰ�� �ѱݾ���" +sum +"�����Դϴ�.");
		System.out.println("�����Ͻ� ��ǰ�� "+ itemList+ "�Դϴ�.");
	}
}
