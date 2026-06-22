package day22.multithreading;

import java.util.Iterator;

public class ThreadState implements Runnable {

	@Override
	public void run() {
		
		try {
			Thread.currentThread().sleep(8000);  // putting T1 to sleep for (TIMED_WAITING) State
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}

	public static void main(String[] args) throws InterruptedException {
		ThreadState obj = new ThreadState();
		
		Thread t1 = new Thread(obj);
		
		System.out.println(t1.getState());  //NEW
		
		t1.start();
		System.out.println(t1.getState());  //RUNNABLE
	
		Thread.currentThread().sleep(5000);  // Putting main thread to sleep
		
		System.out.println(t1.getState());  //TIMED_WAITING
		
		Thread.currentThread().sleep(3001);
		System.out.println(t1.getState());
	}
}