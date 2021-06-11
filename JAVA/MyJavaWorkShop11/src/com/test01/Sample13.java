package com.test01;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Sample13 {

	public static void main(String[] args) {
		String[] data = {"bat","baby","bouns","cA","ca","co","c.","c0","car","combat","count",
						"date","disc","000ca","11","1a","2a","31","aAAAa","aA"};
		Pattern p = Pattern.compile("[a-z0-9][A-Z].*");
		
		for(int i = 0; i <data.length; i++) {
			Matcher m = p.matcher(data[i]);
			if(m.matches()) {
				System.out.println(data[i] +", ");
			}
		}
	}

}
