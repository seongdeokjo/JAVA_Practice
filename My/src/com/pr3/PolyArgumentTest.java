package com.pr3;

public class PolyArgumentTest {
	public static void main(String args[]) {
		Buyer b = new Buyer();
		// buy메서드에 매개변수로 Tv인스턴스와 Computer인스턴스를 제공하는 것이 가능 
		// Tv t = new Tv(); + b.buy(t); 를 한문장으로 정리
		Tv t = new Tv();
		Computer c = new Computer();
		Audio a = new Audio();
		
		b.buy(t);
		b.buy(c);
		b.buy(a);
		b.summary();
		System.out.println();
		b.refund(a);
		b.refund(new Audio()); // 구입하신 제품 중 해당 제품이 없습니다. 
		b.summary();
		
		
//		System.out.println("현재 남은 돈은 "+b.money+"만원입니다.");
//		System.out.println("현재 적립된 보너스는 "+b.bounsPoint+"점 입니다.");
	}
}
