package com.test05;

class Product {
	int price;
	int bounsPoint;

	Product(int price) {
		this.price = price;
		bounsPoint = (int) (price/10.0);

	}

	Product() {
	}

}

class Tv extends Product {
	Tv() {
		super(100);
	}

	public String toString() {
		return "Tv";
	}
}

class Computer extends Product {
	Computer() {
		super(200);
	}

	public String toString() {
		return "Computer";
	}
}

class Audio extends Product {
	Audio() {
		super(50);
	}

	public String toString() {
		return "Audio";
	}
}

class Buyer {
	int money = 1000;
	int bounsPoint = 0;
	Product[] item = new Product[10];
	int i = 0;

	void buy(Product p) {
		if (money < p.price) {
			System.out.println("�ܾ��� �����Ͽ� ������ �� �� �����ϴ�.");
			return;
		}
		money -= p.price;
		bounsPoint += p.bounsPoint;
		item[i++] = p;
		System.out.println(p + "��/�� �����ϼ̽��ϴ�.");
	}

	void summary() {
		int sum = 0;
		String itemList = "";
		for (int i = 0; i < item.length; i++) {
			if (item[i] == null) break;
			sum += item[i].price;
			itemList += item[i] + ", ";
		}
		System.out.println("�����Ͻ� ��ǰ�� �ѱݾ��� " + sum + "�����Դϴ�");
		System.out.println("�����Ͻ� ��ǰ�� " + itemList + "�Դϴ�.");
	}
}

public class Sample10 {

	public static void main(String[] args) {
		Buyer b = new Buyer();
		b.buy(new Tv());
		b.buy(new Computer());
		b.buy(new Audio());
		b.summary();
	}

}
