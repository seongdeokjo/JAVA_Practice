package ex.io;

import java.io.IOException;
import java.io.PipedReader;
import java.io.PipedWriter;
import java.io.StringWriter;

public class IOEx5 {

	public static void main(String[] args) {
		 InputThread inThread = new InputThread("InputTread");
		 OutputThread outThread = new OutputThread("OutputThread");
		 
		 inThread.connect(outThread.getOutput());
		 
		 inThread.start();
		 outThread.start();
		 
	}

}
class InputThread extends Thread {
	PipedReader input = new PipedReader();
	StringWriter sw = new StringWriter();
	
	InputThread(String name) {
		super(name);
	}
	public void run() {
		int data = 0;
		
		try {
			while((data = input.read()) != -1) {
				sw.write(data);
			}
			System.out.println(sw.toString());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public PipedReader getInput() {
		return input;
	}
	
	public void connect(PipedWriter output) {
		try {
			input.connect(output);
		}catch(IOException e) {
			
		}
	}
	
}


class OutputThread extends Thread {
	PipedWriter output = new PipedWriter(); 
	
	OutputThread(String name) {
		super(name);
	}
	
	public void run() {
		try {
			String msg = "Hello";
			System.out.println(getName()+ msg);
			output.write(msg);
			output.close();
			
		}catch(IOException e) {
			
		}
		
	}
	public PipedWriter getOutput() {
		return output;
	}
	public void connect(PipedReader input) {
		try {
			output.connect(input);
			
		}catch(IOException e) {
			
		}
	}
}
