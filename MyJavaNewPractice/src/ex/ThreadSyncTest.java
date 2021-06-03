package ex;

public class ThreadSyncTest {

	public static void main(String[] args) {

		Increment inc = new Increment();
		
		//Threa 생성 
		IncThread it1 = new IncThread(inc);
		IncThread it2 = new IncThread(inc);
		IncThread it3 = new IncThread(inc);
		
		it1.start();
		it2.start();
		it3.start();
		
		try {
			it1.join();
			it2.join();
			it3.join();

		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println(inc.getNum());
		
	}
}

class Increment { 
	int num;
	
	public synchronized void increment() {
		num++; // num = num + 1;
		
	}
	public int getNum() {
		return num;
	}
}

//Thread class 생성 
class IncThread extends Thread {
	
	Increment inc;
	
	IncThread(Increment inc) {
		this.inc = inc;
	}
	
	@Override
	public void run() {
		for(int i =0; i <10000; i++) {
			inc.increment();
		}
	}
}