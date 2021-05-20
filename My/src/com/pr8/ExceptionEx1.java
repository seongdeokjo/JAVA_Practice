package com.pr8;

import java.io.File;

public class ExceptionEx1 {

static File createFile(String fileName) {
	try {
		if(fileName == null || fileName.equals(""))
			throw new Exception("���� �̸��� ��ȿ���� �ʾƿ�");
	}catch(Exception e) {
		fileName = "�������.txt";
	}finally {
		File f = new File(fileName);
		createNewFile(f);
		return f;
	}
}
static void createNewFile(File f) {
	try {
		f.createNewFile();
	}catch(Exception e) { }
}
	public static void main(String[] args) {
		File f = createFile(args[0]);
		System.out.println(f.getName()+ "������ ���������� �����Ǿ����ϴ�.");
	}

}
