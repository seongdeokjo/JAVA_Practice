package com.test06;

public class Sample18 {

	public static void main(String[] args) {
		try {
			Exception e = new Exception("���Ƿ� �߻���Ŵ");
			throw e;
			// throw e = new Exception("���Ƿ� �߻���Ŵ"); ����2���� ���ٷ� ���� 
		}catch(Exception e) {
			System.out.println("���� �޼���: "+ e.getMessage());
			e.printStackTrace();
		}
		System.out.println("���α׷��� ���� ����Ǿ��� ");
	}

}
