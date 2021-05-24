package test;
public class Member {

	public static void main(String[] args) {
		System.out.println("조성덕");
		//인스턴스생성 => 클래스의 정의가 필요(필요한 변수,필요한 메소드)
//	       클래스이름     참조변수 = new  클래스이름 
		Calculator calc = new Calculator(); // 메모리에 메소드 코드,저장. 주소가 저장 
		calc.add(20, 30); 
		calc.add(50, 30);
		calc.divide(10, 3);
	}

}
