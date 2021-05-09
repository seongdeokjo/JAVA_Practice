package com.workshop;
class Data{ int x;}
public class Sample18 {

	public static void main(String[] args) {
		Data d = new Data();
		d.x = 10;
		System.out.println(d.x);
		
		change(d.x);
		// 호출이 끝나고 매개변수 x가 스택에서 제거되기 때문에 10이 출력
		System.out.println(d.x);

	}
	static void change(int x) { //기본형 매개변수 
		x = 1000;
		System.out.println(x);
	}
}
