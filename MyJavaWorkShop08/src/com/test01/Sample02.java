package com.test01;
class BBSItem {
	static int seqNo;
	BBSItem() {
		seqNo++;
		System.out.println(seqNo);
	}
}
public class Sample02 {
	public static void main(String[] args) {
		BBSItem a = new BBSItem();
		BBSItem b = new BBSItem();

	}
}
