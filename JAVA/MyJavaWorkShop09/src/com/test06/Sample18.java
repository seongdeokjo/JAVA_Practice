package com.test06;

public class Sample18 {

	public static void main(String[] args) {
		try {
			Exception e = new Exception("고의로 발생시킴");
			throw e;
			// throw e = new Exception("고의로 발생시킴"); 위의2줄을 한줄로 만듬 
		}catch(Exception e) {
			System.out.println("에러 메세지: "+ e.getMessage());
			e.printStackTrace();
		}
		System.out.println("프로그램이 정상 종료되었음 ");
	}

}
