package com.test;
class Data {
	 int x;
	 int y;
	 public Data() {}
	public Data(Data d) {
		this.x = d.x;
		this.y = d.y;
	}
	int operate() {
		int result = this.x + this.y;
		return result;
	}
}
public class Sample04 {

	public static void main(String[] args) {
		Data data = new Data();
		data.x = 10;
		data.y = 20;
		Data data2 = new Data(data);
		int result = data2.operate();
		System.out.println(result);
	}
}
