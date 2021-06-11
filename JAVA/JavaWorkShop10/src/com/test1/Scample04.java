package com.test1;
class MyException extends Exception {
	public MyException(String msg) {
		super(msg);
		
	}
}

public class Scample04 {
	static void checkMethod(int num) throws MyException{
//		try {
//		if(num %2 == 0) {
//			throw new MyException("응 오류고");
//			}
//		}catch(MyException e ) {
//			System.out.println("아니야 "  +e.getMessage());
//		}
//	}
		if(num % 2 == 0) {
			throw new MyException("짝수야");
		}

	}

	public static void main(String[] args) throws MyException {
//		try {
//		throw new MyException("나의 오류라구");
//		}catch(MyException e) {
//			System.out.println("오류야 " + e.getMessage());
//		}
		checkMethod(1);
//		checkMethod(2);
//		Exception ex = new Exception();
//		try {
//		throw ex;
//	}catch(Exception e) {
//		System.out.println(ex.getMessage());
//	}
	}

}
