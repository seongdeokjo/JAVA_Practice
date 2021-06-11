package com.test_10;

public class Buyer {
	int money;
	int bounsPoint;
	
	Product[] cart;
	int cnt; //구매한 제품의 개수 -> 배열의 입력 index값 
	public Buyer() {
		this.money = 10000;
		this.bounsPoint =0;
		this.cart = new Product[10];
		this.cnt = 0;
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
		
//******************구매내역에 제품을 추가***********************중요
		cart[cnt++] = p;
		System.out.println(p + "구매");
	}
	void summary() {
		//구매 상품 리스트, 구매금액의 총합 출력
		int sum = 0; // 구매 총액 
		int bounsPoint = 0;
		String itemList = ""; // 뒤쪽에 문자열을 붙여나가기위해 null대신에 사용
		//배열을 반복 문을 이용해서 구매 내역을 완성
		for(int i = 0; i<cnt; i++) {
			//금액의 합
			sum += cart[i].price;
			//적립될 보너스 포인트
			bounsPoint += cart[i].bounsPoint;
			//구매 상품 이름
			itemList += cart[i] + ", ";
		}
		System.out.println("구매하신 제품은 "+itemList + " 입니다.");
		System.out.println("구매하신 제품의 총 금액은 "+ sum+"원 입니다.");
		System.out.println("구매하신 제품의 적립 포인트는"+bounsPoint+"점 입니다.");
	}
}