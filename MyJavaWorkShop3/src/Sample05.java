import java.util.*;


public class Sample05 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		char ch = ' ';
		
		System.out.printf("���ڸ� �ϳ� �Է��ϼ���.");
	
		String input = scanner.nextLine();
		System.out.println(input.charAt(0));
		ch = input.charAt(0);//chatAt(0) ù��° ���� �ϳ��� ��� 
//		//char 0~9
//		//0<= input.chaAt(0) <=9
//		//0<= input.charAt(0) and input.charAt(0) =9
		String msg = (('0'<= ch) && (ch <= '9'))? "Yes" : "No";
		System.out.println(msg);
		
//		if('0' <= ch && ch <= '9') {
//			System.out.printf("�Է��Ͻ� ���ڴ� �����Դϴ�. %n");
//			
//		}
//		if(('a'<=ch && ch <= 'z') || ('A'<= ch && ch <= 'Z')) {
//			System.out.printf("�Է��Ͻ� ���ڴ� �������Դϴ�. %n");
//		}
	
		
		
		
		
		
	}

}
