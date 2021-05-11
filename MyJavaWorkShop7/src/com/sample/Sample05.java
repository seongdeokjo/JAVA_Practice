package com.sample;
class Tv {
	boolean power;
	int channel;
	
	void power() { power= !power; }
	void channelUp() { ++channel; }
	void channelDown() { --channel;}
}
class CaptionTv extends Tv{
	boolean caption;
	void dispalayCaption(String text) {
		if(caption) {
			System.out.println(text);
		}
	}
}
public class Sample05 {

	public static void main(String[] args) {
		CaptionTv ctv = new CaptionTv();
		ctv.channel = 10;
		ctv.channelUp();
		System.out.println("현재 채널: "+ctv.channel);
		ctv.dispalayCaption("Hello, World");
		ctv.caption = true;
		ctv.dispalayCaption("Hello, world");

	}

}
