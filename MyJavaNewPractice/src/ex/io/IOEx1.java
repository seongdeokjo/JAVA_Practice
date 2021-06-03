package ex.io;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.Arrays;

public class IOEx1 {

	public static void main(String[] args) {
		byte[] inSrc = {0,1,2,3,4,5,6};
		byte[] outSrc = null;
		
		ByteArrayInputStream input =null;
		ByteArrayOutputStream output = null;
		
		input = new ByteArrayInputStream(inSrc);
		output = new ByteArrayOutputStream();
		
		int data = 0; 
		
		while( (data = input.read() ) !=-1) {
			output.write(data);
		}
		outSrc = output.toByteArray();
		
		System.out.println(Arrays.toString(inSrc));
		System.out.println(Arrays.toString(outSrc));
		
	}

}
