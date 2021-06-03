package ex.th;

import java.util.Scanner;

public class HighLowMain {
	public static boolean check = false;

	public static void main(String[] args) {

		Count ct = new Count();
		CheckNumber num = new CheckNumber();
		// 4.10초 이전에 맞추면 미션 성공, 10초가 지나면 프로그램 종료하는 흐름으로 만들어봅시다.
		num.start();
		ct.start();
	}
}

// 3.10초 카운팅은 스레드를 이용해서 처리해봅시다.
class Count extends Thread {

	@Override
	public void run() {
		for (int i = 10; i > 0; i--) {
			// 10초이내에 정답입력시
			if (HighLowMain.check) {
				System.out.println("미션 성공입니다.");
				return;
			}
			System.out.println(i);
			try {
				// 1초 간격
				sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		System.out.println("입력시간 초과입니다.");
		System.out.println("10초이내에 정답을 못 맞췄으므로 프로그램이 종료됩니다.");
		System.exit(0);
	}
}

class CheckNumber extends Thread {

	@Override
	public void run() {
		// 1.1~100 사이의 랜덤 한 숫자를 추출합니다.

		int random = (int) (Math.random() * 100) + 1;

		System.out.println(random);

		// 2.사용자에게 숫자를 입력 받고, 랜덤 숫자와 비교하고, 높은 숫자인지 낮은 숫자인지 출력

		Scanner scan = new Scanner(System.in);

		boolean ck = false;

		while (!ck) {
			System.out.println("숫자를 입력해주세요. >>");
			int num = scan.nextInt();
			if (num != random) {
				if (num > random) {
					System.out.println("입력하신 숫자보다 작은 수로 입력하세요.");
				} else {
					System.out.println("입력하신 숫자보다 큰 수로 입력하세요.");
				}
				ck = false;
			} else {
				HighLowMain.check = true;
				System.out.println("정답입니다.");
				ck = true;
				break;
			}
		}
	}
}