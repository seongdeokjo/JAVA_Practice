
package com.work;

public class BBSItem {
	int seqNo; //�Ϸù�ȣ �ʵ�
	String writer; //�ۼ��� �ʵ�
	String writtenDate; //�ۼ����� �ʵ�
	String title; // �����ʵ�
	String content; // �����ʵ�
	//��� ��ü�� ���������� ������ �����ʹ� ���� �ʵ�� �����ؾ� �Ѵ�.
	//�׷��Ƿ� ������ �Ϸù�ȣ�� ��� ��ü�� ���������� ������ �����ʹ� ���� �ʵ�� �����ؾ� �մϴ�. 
	//�����ڿ��� �� �ʵ带 ����Ͽ� seqNo �ʵ��� ���� ������ �� ���� �ʵ��� ���� 1��ŭ ������Ű�� �˴ϴ�.


	static int count = 0; //���� �ʵ�� ������ �Ϸù�ȣ ���� 

	public BBSItem(int seqNo, String writer, String writtenDate, 
					String title, String content) {
	
		this.seqNo = ++count; //�����ڿ��� �Ϸù�ȣ�� �����ʵ� ���� 1��ŭ ����
		this.writer = writer;
		this.writtenDate = writtenDate;
		this.title = title;
		this.content = content;
	}
	
	
}
