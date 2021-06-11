package com.test1;

 class Board {
	String title;
	String content;
	String writer;
	String date;
	int hitcount;
	
	Board(String title, String content) { // Board1
		this(title,content,"�α����� ȸ�����̵�","���� ��ǻ�� ��¥",0);
	}
	Board(String title, String content, String writer) { //2
		this(title,content,writer,"���� ��ǻ�� ��¥",0);
	}
	Board(String title, String content, String writer, String date) {
		this(title,content,writer,date,0);
	}
	Board(String title, String content, String writer, String date, int hitcount) {
		this.title = title;
		this.content = content;
		this.writer = writer;
		this.date = date;
		this.hitcount = hitcount;
	}
	public String toString() {
		return "����: "+this.title +" ����: "+this.content+" �ۼ���: "+this.writer+" �ۼ� ��¥: "+this.date+" ��ȸ��: "+this.hitcount;
	}
	public static void main(String args[]) {
		Board board1 = new Board("����1","����1");
		System.out.println(board1);
		Board board2 = new Board("����2","����2","�ۼ���2");
		System.out.println(board2);
		Board board3 = new Board("����3","����3","�ۼ���3","��¥3");
		System.out.println(board3);
		Board board4 = new Board("����4","����4","�ۼ���4","��¥4",1);
		System.out.println(board4);
	}

}
