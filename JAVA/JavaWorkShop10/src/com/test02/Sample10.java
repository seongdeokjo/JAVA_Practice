package com.test02;
class CloseableResource implements AutoCloseable {
	public void exceptionWork(boolean exception) throws WorkException {
		System.out.println("exceptionWrok(" +exception+ ") �� ȣ���");	
		if(exception) 
			throw new WorkException("WorkException �߻�!!");
		}
		public void close() throws CloseException {
			System.out.println("close()�� ȣ���");
			throw new CloseException("CloseException�߻�!");
			}
	}
class WorkException extends Exception {
	WorkException(String msg){
		super(msg);
	}
}
class CloseException extends Exception {
	CloseException(String msg) {
		super(msg);
	}
}
public class Sample10 {
	public static void main(String[] args) {
		try(CloseableResource cr = new CloseableResource()) {
			cr.exceptionWork(false);
		}catch(WorkException e) {
			e.printStackTrace();
		}catch(CloseException e) {
			e.printStackTrace();
		}
		System.out.println();		
		try(CloseableResource cr = new CloseableResource()) {
			cr.exceptionWork(true);
		}catch(WorkException e) {
			e.printStackTrace();
		}catch(CloseException e) {
			e.printStackTrace();
		}
	}
}
