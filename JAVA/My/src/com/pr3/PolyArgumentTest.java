package com.pr3;

public class PolyArgumentTest {
	public static void main(String args[]) {
		Buyer b = new Buyer();
		// buy�޼��忡 �Ű������� Tv�ν��Ͻ��� Computer�ν��Ͻ��� �����ϴ� ���� ���� 
		// Tv t = new Tv(); + b.buy(t); �� �ѹ������� ����
		Tv t = new Tv();
		Computer c = new Computer();
		Audio a = new Audio();
		
		b.buy(t);
		b.buy(c);
		b.buy(a);
		b.summary();
		System.out.println();
		b.refund(a);
		b.refund(new Audio()); // �����Ͻ� ��ǰ �� �ش� ��ǰ�� �����ϴ�. 
		b.summary();
		
		
//		System.out.println("���� ���� ���� "+b.money+"�����Դϴ�.");
//		System.out.println("���� ������ ���ʽ��� "+b.bounsPoint+"�� �Դϴ�.");
	}
}
