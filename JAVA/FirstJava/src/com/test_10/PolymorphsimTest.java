package com.test_10;
class AAA{}
class BBB extends AAA{}
class CCC extends BBB{}

public class PolymorphsimTest {

	public static void main(String[] args) {
		AAA ref1 = new BBB();
		AAA ref2 = new CCC(); // ok
		BBB ref3 = new CCC(); // ok
		//자손의 기능이 조상의 기능보다 최소  같거나 많기 때문에 가능 
		CCC ref4 = new CCC();
		BBB ref5 = ref4; //  BBB ref3 = new CCC() ok 자손 -> 조상
		AAA ref6 = ref4; // ok
		
		//조상의 기능은 자손의 기능보다 같거나 적기 때문에 자손의 기능을 전부 사용하지 못한다.
		AAA ref7 = new CCC();
//		BBB ref8 = ref7; not ok 조상 -> 자손 X
//		CCC ref9 = ref7; not ok 
	}

}
