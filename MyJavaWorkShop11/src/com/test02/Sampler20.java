package com.test02;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Sampler20 {

	public static void main(String[] args) throws Exception {
		
		Scanner scan = new Scanner(new File("data2.txt"));
		int sum = 0;
		int cnt = 0;
		while(scan.hasNextInt()) {
			sum += scan.nextInt();
			cnt ++;
		}
		System.out.println("sum :"+sum);
		System.out.println("average="+ (double)sum/cnt);
	}

}
