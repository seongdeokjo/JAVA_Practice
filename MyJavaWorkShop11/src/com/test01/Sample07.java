package com.test01;

public class Sample07 {

	public static void main(String[] args) {
		String msg1 = "�̼���";
		String msg2 = "����";
		String msg3 = msg1 + msg2;
		
		StringBuffer sb = new StringBuffer("�̼���");
		System.out.println(sb.capacity());
		sb.append("����");
		sb.insert(1, "�������");
		sb.replace(1, 3, "�߰�");
		sb.delete(1, 3);
			System.out.println(sb.toString());
			System.out.println();	
			
	}

}
