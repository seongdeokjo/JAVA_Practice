package com.test06;

import java.util.Arrays;

public class Sort {

	public static void main(String[] args) {
		People[] arr = { new People("a", 20),
					new People("b", 14),
					new People("c",31),
					new People("d", 40),
					new People("e", 24)
		};
		Arrays.sort(arr);
		for(People i : arr) {
			System.out.println("["+i.print()+"]");
		}
	}

}
