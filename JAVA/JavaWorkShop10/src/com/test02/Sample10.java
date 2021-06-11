package com.test02;
class CloseableResource implements AutoCloseable {
	public void exceptionWork(boolean exception) throws WorkException {
		System.out.println("exceptionWrok(" +exception+ ") 가 호출됨");	
		if(exception) 
			throw new WorkException("WorkException 발생!!");
		}
		public void close() throws CloseException {
			System.out.println("close()가 호출됨");
			throw new CloseException("CloseException발생!");
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
