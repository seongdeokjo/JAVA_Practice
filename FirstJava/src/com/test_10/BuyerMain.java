package com.test_10;

public class BuyerMain {

	public static void main(String[] args) {
		//구매자 객체 생성
		Buyer b = new Buyer();
		//제품객체 생성
		Tv tv = new Tv(1000);
		Computer com = new Computer(300);
		//구매 
		b.buy(tv);
		b.buy(com);
		b.buy(com);
		b.buy(tv);
		//결과 지표
//		System.out.println("현재 남은 돈은 "+b.money+"원");
//		System.out.println("현재 보너스점수는 "+b.bounsPoint+"점");
		//구매 지표 출력
		b.summary();
	}

}
