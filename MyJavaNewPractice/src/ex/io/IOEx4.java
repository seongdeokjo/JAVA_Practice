package ex.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class IOEx4 {

	public static void main(String[] args) throws IOException {
		FileInputStream f = new FileInputStream(args[0]);
		int data = 0;
		
		while((data = f.read())!= -1) {
			char c = (char)data;
			System.out.print(c);
		}
	}
}