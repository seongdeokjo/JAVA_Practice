package com.test_10;

public class BuyerMain {

	public static void main(String[] args) {
		//구매자 객체 생성
		Buyer b = new Buyer();
		//제품객체 생성
		Tv tv = new Tv(100);
		Computer com = new Computer(30);
		//구매 
		b.buy(tv);
		b.buy(com);
		
		System.out.println("현재 남은 돈은 "+b.money+"원");
		System.out.println("현재 보너스점수는 "+b.bounsPoint+"점");
	}

}
