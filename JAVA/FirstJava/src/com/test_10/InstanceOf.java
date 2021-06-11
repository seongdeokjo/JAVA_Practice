package com.test_10;
class Box {
//	public void simpleWrap() {
//		System.out.println("simpleWrap");
//	} 
	
	public void wrap() {
		System.out.println("simpleWrap");
	}
}

class PaperBox extends Box {
//	public void paperWrap() {
//		System.out.println("paperWrap");
//	}
	
	public void wrap() {
		System.out.println("paperWrap");
	}
}

class GoldPaperBox extends PaperBox	{
//	public void GoldPaperWrap() {
//		System.out.println("goldPaperWrap");
//	}
//	
	public void wrap() {
		System.out.println("goldPaperWrap");
	}
}

public class InstanceOf {
	
	public static void wrapBox(Box box) {
		
		box.wrap();
		//형변환 여부 확인 
//		if(box instanceof GoldPaperBox) {
//			((GoldPaperBox)box).GoldPaperWrap();
//		}else if(box instanceof PaperBox) {
//			((PaperBox)box).paperWrap();
//		}else {
//			box.simpleWrap();
//		}
	}
	
	public static void main(String[] args) {
		Box box1 = new Box();
		PaperBox box2 = new PaperBox();
		GoldPaperBox box3 = new GoldPaperBox();
		//오버라이딩을 적절히 이용하게 되면 코드의 중복을 줄이고 효율적으로 사용할 수 있다.
		
		wrapBox(box1);
		wrapBox(box2);
		wrapBox(box3);
	}
}