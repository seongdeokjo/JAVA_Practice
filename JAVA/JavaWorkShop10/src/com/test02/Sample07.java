package com.test02;
class Test extends Exception {
	Test(String msg) {
		super(msg);
	}
}
public class Sample07 {

	public static void main(String[] args) {
		int a = 0;
		try {
			if(a == 0) {
			throw new Test("�����߻�");
			}
			
		}catch(Test e) {
			System.out.println(e.getMessage());
		}
	}

}
