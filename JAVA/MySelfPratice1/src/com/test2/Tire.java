package com.test2;

public class Tire {
	public int maxRotation; // �ִ� ȸ����[Ÿ�̾� ����]
	public int accumulatedRotation; // ���� ȸ����
	public String location; // Ÿ�̾��� ��ġ
	
	public Tire(String location, int maxRotation) {
		this.location = location;
		this.maxRotation = maxRotation;
	}
	public boolean roll() {
		++accumulatedRotation; //���� ȸ����1����
		if(accumulatedRotation<maxRotation) { //���� ȸ�� (����<�ִ�)�� ��� ���� 
			System.out.println(location+"tire ����:"+(maxRotation-accumulatedRotation)+"ȸ");
			return true;
		}else { // ��ũ (���� ==ȸ��) �� ��� ���� 
			System.out.println("***"+ location+"tire��ũ***");
			return false;
		}
	}
}
