package com.pr9;

import java.util.regex.*;

public class RegularEx {

	public static void main(String[] args) {
		//����ǥ���� ��,�ҹ��� ����
		// 
		String[] data = {"who^","^who are who","who is who","$12$"};
		Pattern p = Pattern.compile("[w].");
		for(int i = 0; i <data.length; i++) {
			Matcher m = p.matcher(data[i]);
			if(m.matches()) 
				System.out.println(data[i]+" , ");
		}

	}
}