package com.work;
import com.work.BBSItem;
public class PrintBBS {

	public static void main(String[] args) {
		BBSItem bbs = new BBSItem(0, "kim","17:50", "자바", "1234");
		BBSItem bbs1 = new BBSItem(0, "park", "18:00 ", "공부", "5678");
		BBSItem bbs2 = new BBSItem(0, "jay", "18:10 ", "하자", "9012");
		printBbsItem(bbs);
		printBbsItem(bbs1);
		printBbsItem(bbs2);
	}
	static void printBbsItem(BBSItem bbs) {	
		
		System.out.println(bbs.seqNo);
		System.out.println(bbs.writer);
		System.out.println(bbs.writtenDate);
		System.out.println(bbs.title);
		System.out.println(bbs.content);
		System.out.println("------여백-----");
		}
	}

