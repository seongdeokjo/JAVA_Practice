package com.test03;
interface MyFunction {
	void run();
}
public class Sample21 {
	static void execute(MyFunction f) { // 매개변수타입이 MyFunction인 메서드
		f.run();
	}
	static MyFunction getMyFunction() { // 반환 타입이 MyFunction인 메서드 
		MyFunction f = () -> System.out.println("f3.run()");
		return f;
	}

	public static void main(String[] args) {
		MyFunction f1 = () -> System.out.println("f1.run()");
		MyFunction f2 = new MyFunction() { //익명클래스로 run()을 구현 
			public void run() { //public을 반드시 붙여야함 
				System.out.println("f2.run()");
			}
		};
		MyFunction f3 = getMyFunction();
		f1.run();
		f2.run();
		f3.run();
		execute(f1);
		execute( () -> System.out.println("run()"));
	}

}
