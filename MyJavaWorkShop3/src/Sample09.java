
public class Sample09 {

	public static void main(String[] args) {
//		int num = 1;
//		switch (num) {
//		case 1 :
//			System.out.println("1입니다.");
//			break;
//		case 2 :
//			System.out.println("2입니다.");
//			break;
//		default :
//			System.out.println("다시 입려해주세요.");
//		}
		String name = "홍길동";
		int level = 0;
		switch (name) {
		case "홍길동" :
			level = 100;
			break;
		case "이순신" :
			level = 200;
			break;
		default :
			level = 0;
		
		}
		System.out.println(level);
	}

}
