package ex;

public class ShowThreadMian {

	public static void main(String[] args) {
		
		//스레드 인스턴스 생성
		 ShowThread r1 = new ShowThread("스레드1");
		 ShowThread r2 = new ShowThread("        스레드2");
		 r1.start();
		 r2.start();
	}
}