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
//			throw new MyException("�� ������");
//			}
//		}catch(MyException e ) {
//			System.out.println("�ƴϾ� "  +e.getMessage());
//		}
//	}
		if(num % 2 == 0) {
			throw new MyException("¦����");
		}

	}

	public static void main(String[] args) throws MyException {
//		try {
//		throw new MyException("���� ������");
//		}catch(MyException e) {
//			System.out.println("������ " + e.getMessage());
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
