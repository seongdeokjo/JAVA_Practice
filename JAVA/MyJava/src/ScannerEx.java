import java.util.*;
public class ScannerEx {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("������ �ϳ� �Է��Ͻÿ�. :");
		String input = scanner.nextLine();
		int num = Integer.parseInt(input);
		System.out.println("���ڴ� :" + num);
		System.out.printf("���ڴ� : %d", num);
	}

}
