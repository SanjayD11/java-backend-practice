package day22.multithreading;
public class JoinDemo extends Thread{
	public void run() {
		System.out.println(Thread.currentThread().getName()+" is waiting for 3s");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
public static void main(String[] args) throws InterruptedException {
	JoinDemo t1 = new JoinDemo();
	JoinDemo t2 = new JoinDemo();
	t1.setName("Thread 1");
	t2.setName("Thread 2");
	t1.start();
	t1.join();
	t2.start();
	t2.join();
	System.out.println("Main Thread is now executing after waiting for both the T1 and T2 to be completed!");
}
}
