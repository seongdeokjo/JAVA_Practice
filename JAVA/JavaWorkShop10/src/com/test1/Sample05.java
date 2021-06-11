package com.test1;
class MyException2 extends Exception {
	MyException2(String msg) {
		super(msg);
	}
}
public class Sample05 {
	public static void main(String[] args) {
	int i = 2;
		try {
			if( i == 2) { //조건을 통해 사용자정의로 예외문을 만들 수 있다.
		throw new MyException2("안녕하세요"); //예외 발생 시킴
				}
			}catch(MyException2 e) {
			System.out.println(e.getMessage());	
				}
		}
}
