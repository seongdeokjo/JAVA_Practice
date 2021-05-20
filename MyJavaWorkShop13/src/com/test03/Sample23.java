package com.test03;
@FunctionalInterface
interface ITest {
	void printVar();
}
public class Sample23 {
	static void execute(ITest f) {
		f.printVar();
	}
	static ITest getITest() {
		ITest f = () -> System.out.println("f3.printVar()");
		return f;
	}
	public static void main(String[] args) {
		ITest i = () -> System.out.println("f1.printVar()");
		ITest i2 = new ITest() {
			public void printVar() {
				System.out.println("f2.printVar()");
			}
		};
		ITest i3 = getITest();
		i.printVar(); // 람다식으로 ITest의  printVar() 구현
		i2.printVar(); // 익명클래스로 printVar() 구현 
		i3.printVar(); //static 메서드호출
		execute( () -> System.out.println("printVar()"));
	}
}