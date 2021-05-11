
package com.work;

public class BBSItem {
	int seqNo; //일련번호 필드
	String writer; //작성자 필드
	String writtenDate; //작성일자 필드
	String title; // 제목필드
	String content; // 내용필드
	//모든 객체가 공통적으로 접근할 데이터는 정적 필드로 선언해야 한다.
	//그러므로 마지막 일련번호를 모든 객체가 공통적으로 접근할 데이터는 정적 필드로 선언해야 합니다. 
	//생성자에서 그 필드를 사용하여 seqNo 필드의 값을 설정한 후 정적 필드의 값을 1만큼 증가시키면 됩니다.


	static int count = 0; //정적 필드로 마지막 일련번호 선언 

	public BBSItem(int seqNo, String writer, String writtenDate, 
					String title, String content) {
	
		this.seqNo = ++count; //생성자에서 일련번호에 정적필드 값을 1만큼 증가
		this.writer = writer;
		this.writtenDate = writtenDate;
		this.title = title;
		this.content = content;
	}
	
	
}
