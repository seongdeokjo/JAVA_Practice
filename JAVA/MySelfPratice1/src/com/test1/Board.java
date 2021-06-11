package com.test1;

 class Board {
	String title;
	String content;
	String writer;
	String date;
	int hitcount;
	
	Board(String title, String content) { // Board1
		this(title,content,"로그인한 회원아이디","현재 컴퓨터 날짜",0);
	}
	Board(String title, String content, String writer) { //2
		this(title,content,writer,"현재 컴퓨터 날짜",0);
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
		return "제목: "+this.title +" 내용: "+this.content+" 작성자: "+this.writer+" 작성 날짜: "+this.date+" 조회수: "+this.hitcount;
	}
	public static void main(String args[]) {
		Board board1 = new Board("제목1","내용1");
		System.out.println(board1);
		Board board2 = new Board("제목2","내용2","작성자2");
		System.out.println(board2);
		Board board3 = new Board("제목3","내용3","작성자3","날짜3");
		System.out.println(board3);
		Board board4 = new Board("제목4","내용4","작성자4","날짜4",1);
		System.out.println(board4);
	}

}
