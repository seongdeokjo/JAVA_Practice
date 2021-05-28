package com.test_10;
class AAA{}
class BBB extends AAA{}
class CCC extends BBB{}

public class PolymorphsimTest {

	public static void main(String[] args) {
		AAA ref1 = new BBB();
		AAA ref2 = new CCC(); // ok
		BBB ref3 = new CCC(); // ok
		
		CCC ref4 = new CCC();
		BBB ref5 = ref4; // ok
		AAA ref6 = ref4; // ok
		
		AAA ref7 = new CCC();
//		BBB ref8 = ref7; not ok 
//		CCC ref9 = ref7; not ok 
	}

}
