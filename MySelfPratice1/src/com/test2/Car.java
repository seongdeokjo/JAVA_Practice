package com.test2;

public class Car {
	Tire frontLeftTire = new Tire("�� ����",6);
	Tire frontRightTire = new Tire("�� ������",2);
	Tire backLeftTire = new Tire("�� ����",3);
	Tire backRightTire = new Tire("�� ������",4);
	// ��� Ÿ�̾ 1ȸ ȸ����Ű�� ���� �� tire ��ü�� roll()�޼ҵ带 ȣ��, false�����ϴ� roll()�� ������� 
	// stop() �޼ҵ带 ȣ���ϰ� �ش� Ÿ�̾� ��ȣ�� ����
	int run() {
		System.out.println("[�ڵ����� �޸��ϴ�.]");
		if(frontLeftTire.roll() == false) {
			stop();
			return 1;
		}
		if(frontRightTire.roll() == false) {
			stop();
			return 2;
		}
		if(backLeftTire.roll() == false) {
			stop();
			return 3;
		}
		if(backRightTire.roll() == false) {
			stop();
			return 4;
		}
		return 0;
	}
	void stop() {
		System.out.println("[�ڵ����� ����ϴ�.]");
	}
}
