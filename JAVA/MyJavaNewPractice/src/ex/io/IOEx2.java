package ex.io;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.Arrays;

public class IOEx2 {

	public static void main(String[] args) {
		byte[] inSrc = {0,1,2,3,4,5,6,7,8};
		byte[] outSrc = null;
		byte[] temp = new byte[9];
		
		ByteArrayInputStream input = null;
		ByteArrayOutputStream output = null;
		
		input = new ByteArrayInputStream(inSrc);
		output = new ByteArrayOutputStream();
		
		input.read(temp, 0, temp.length);
		output.write(temp,5,4);
		
		outSrc = output.toByteArray();
		
		System.out.println(Arrays.toString(inSrc));
		System.out.println(Arrays.toString(outSrc));
		System.out.println(Arrays.toString(temp));
		
		
	}

}
