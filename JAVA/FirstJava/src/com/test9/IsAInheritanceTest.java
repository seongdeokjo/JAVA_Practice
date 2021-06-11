package com.test9;

public class IsAInheritanceTest {

	public static void main(String[] args) {
		NotebookComp nc = new NotebookComp("이수종",5);
		TabletNoteBook tn = new TabletNoteBook("정수영",5,"ISE-241-242");
		nc.movingCal();
		tn.write("ISE-241-242");
	}

}
