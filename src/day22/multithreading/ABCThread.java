package day22.multithreading;
public class ABCThread implements Runnable {
	public void run() {
		synchronized(this){
			if(Thread.currentThread().getName().equals("A")) {
				for (int i = 1; i <= 10; i++) {
				int a = 1;
				System.out.print(a);
				this.notify();
				try {
					this.wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			}
			else {
					for (int i = 1; i <= 10; i++) {
						int b = 2;
						System.out.print(b);
						this.notify();
						try {
							this.wait();
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
				}
			 

		}
		}
	public static void main(String[] args) {
		ABCThread obj = new ABCThread();
		Thread A = new Thread(obj);
		Thread B = new Thread(obj);
		A.setName("A");
		B.setName("B");
		A.start();
		B.start();
	
	}

}
