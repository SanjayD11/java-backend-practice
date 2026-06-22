package day22.multithreading;

public class SyncThreads implements Runnable {

	public synchronized void run() {
		for (int i = 1; i <= 100; i++) {
			if (Thread.currentThread().getName().equals("ODD") && i % 2 != 0) {

				System.out.println(Thread.currentThread().getName() + " : " + i);

			}  if (Thread.currentThread().getName().equals("EVEN") && i % 2 == 0) {
				System.out.println(Thread.currentThread().getName() + " : " + i);
			}

		}
	}

	public static void main(String[] args) {
		SyncThreads obj = new SyncThreads();
		Thread t1 = new Thread(obj);
		Thread t2 = new Thread(obj);
		t1.setName("ODD");
		t2.setName("EVEN");
		t1.start();
		t2.start();
	}

}
