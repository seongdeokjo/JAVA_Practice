package Workshop;

import java.util.*;


public class WorkShop1 {
	public static int getUserInput() {
		 Scanner scanner = new Scanner(System.in);
		 String inputString = scanner.nextLine();
		 return Integer.parseInt(inputString);
	}

	public static void main(String[] args) {
		int b1,b2,b3,b4; //메뉴 금액 변수를 저장
		b1 = 2000;
		b2 = 3000;
		b3 = 1500;
		b4 = 500;
		
		System.out.println("=========메뉴=========");
		 System.out.println("1.아메리카노 2000원");
		 System.out.println("2.카페라떼 3000원");
		 System.out.println("3.베이글 1500원");
		 System.out.println("4.크림치즈 500원"); 
		 System.out.println("=========주문=========");
		 System.out.println("1.아메리카노 주문 수량:");
		 int a1 = getUserInput(); // 
		 System.out.println("2.카페라떼 주문수량 :");
		 int a2 = getUserInput();
		 System.out.println("3.베이글 주문수량 :");
		 int a3 = getUserInput();
		 System.out.println("4.크림치즈 주문수량 :");
		 int a4 = getUserInput();
		 System.out.println("=========금액=========");
		 System.out.printf("아메리카노: %d원%n", a1*b1);
		 System.out.printf("카페라떼: %d원%n", a2*b2);
		 System.out.printf("베이글: %d원%n", a3*b3 );
		 System.out.printf("크림치즈: %d원%n", a4*b4);
		 
		 System.out.println("=========주문=========");
		 int totalPrice = (a1 * b1) + (a2 * b2) + (a3 *b3) + (a4 * b4);
		 System.out.println("총 구매 금액:" + totalPrice+"원");
		 float point = 0;
		 if(totalPrice>= 30000) {
			 point = totalPrice*0.02f;
		 }else if(12000 <=totalPrice && 30000 >totalPrice) {
			 point = totalPrice*0.01f;
		 }else {
			 System.out.println("포인트 적립은 12000원 이상부터 입니다 더 사세요.^^");
		 }
		 System.out.println("포인트적립:"+(int)point+"원");	
	
	}

}
