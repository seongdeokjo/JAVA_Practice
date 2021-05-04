import java.util.*;
public class Sample08 {

	public static void main(String[] args) {
		
//		###############
//		# 1.덧셈
//		# 2.뺄셈
//		# 3.곱셈
//		# 4.나눗셈
//		# 5.종료
//		###############
//		# 메뉴 번호를 입력해주세요. :
		
		// ver.1
		System.out.println("#########################");
		System.out.println("1.덧셈");
		System.out.println("2.뺄셈");
		System.out.println("3.곱셈");
		System.out.println("4.나눗셈");
		System.out.println("5.종료");
		System.out.println("#########################");
		System.out.printf("메뉴 번호를 입력해 주세요. :");
		Scanner scanner = new Scanner(System.in);
		String num= scanner.nextLine();
		//  서로다른 객체이기 때문에 형태를 비교하기 위해서 equals 사용 
		// if(num.equals("1") {
		// System.out.println("덧셈입니다.");
		int num2 = Integer.parseInt(num);
		if (num2 == 1) {
			System.out.println("덧셈입니다.");
		} else if(num2 == 2) {
			System.out.println("뺄셈입니다.");
		} else if(num2 == 3) {
			System.out.println("곱셈입니다.");
		} else if(num2 == 4) {
			System.out.println("나눗셈입니다.");
		} else if(num2 == 5) {
			System.out.println("종료.");
		} else {
			System.out.println("다시 입력해주세요");
		}
		
		
		
		
		//ver.2
		//if 문 이용
//		System.out.println("##########################");
//		Scanner scanner = new Scanner(System.in);
//		char ch = ' ';
//		System.out.println("#메뉴 번호를 입력해 주세요.");
//		String input = scanner.nextLine();
//		ch = input.charAt(0);
//		int a = 10;
//		int b = 20;	
//		if(ch =='1') {
//			System.out.println("1. 덧셈");
////			System.out.printf("%d+%d=%d %n", a,b,c);
//			System.out.println(a+b);
//		
//		}else if (ch =='2') {
//			System.out.println("2.뺄셈");
//			System.out.println(a-b);
////			System.out.printf("%d-%d=%d %n", a,b,d);
//		}else if(ch =='3') {
//			System.out.println("3.곱셈");
//			System.out.println(a * b);
////			System.out.printf("%d*%d=%d %n", a,b,e);
//		}else if(ch == '4') {
//			System.out.println("4.나눗셈");
//			System.out.println(a / b);
////			System.out.printf("%d/%d = %d %n", a,b,f);
//		}	
//		else {
//			System.out.println("5.종료 :프로그램을 종료합니다.");
//		}
//		System.out.println("##########################");
//		
		
		
		//ver.3
	// switch 문 이용 	
//		System.out.println("##########################");
//		Scanner scanner = new Scanner(System.in);
//		
//		System.out.println("#메뉴 번호를 입력해 주세요.");
//		
//		int num = scanner.nextInt();
//		
//		int a1 = 10;
//		int b1= 20;	
//		switch(num) {
//		case 1:
//			System.out.println("1.덧셈입니다.");
//			System.out.println(a1 + b1);
//			break;
//		case 2:
//			System.out.println("2.뺄셈입니다.");
//			System.out.println(a1 - b1);
//			break;
//		case 3:
//			System.out.println("3.곱셈입니다.");
//			System.out.println(a1 * b1);
//			break;
//		case 4:
//			System.out.println("4.나눗셈입니다.");
//			System.out.println(a1 / b1);
//			break;
//			default :
//			System.out.println("5.종료 프로그램을 종료합니다.");
//		}

	}

}
