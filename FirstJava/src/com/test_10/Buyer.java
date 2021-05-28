package com.test_10;

public class Buyer {
	int money;
	int bounsPoint;
	public Buyer() {
		this.money = 10000;
		this.bounsPoint =0;
	} 
	
	//제품들을 구매
	void buy(Product p) {
		//보유금액을 확인하고 구매여부 체크
		if(this.money < p.price) {
			System.out.println("잔액이 부족하여 물건을 살 수 없습니다.");
			return; //진행이 되면 안되기 때문에 return -> 메서드의 종료, 값의 반환 
		}
		this.money -= p.price; // 가진 돈에서 구입한 제품의 가격을 뺀다.
		this.bounsPoint += p.bounsPoint; // 제품의 보너스 점수를 추가한다.
		System.out.println(p);
	}
	
	
}
