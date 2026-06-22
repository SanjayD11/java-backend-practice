package day22.multithreading;

public class BankingThread implements Runnable {

    int balance = 5000;
    int f_amount;
    int m_amount;
    int d_amount;

    BankingThread(int f, int m, int d) {
        this.f_amount = f;
        this.m_amount = m;
        this.d_amount = d;
    }

    @Override
    public synchronized void run() {

        String name = Thread.currentThread().getName();

        if (name.equals("Father")) {

            for (int i = 1000; i <= f_amount; i += 1000) {

                balance += 1000;
                System.out.println("Father deposited 1000 and Balance is : " + balance);

                notifyAll();

                try {
                    Thread.sleep(1000); // ✅ delay for visibility
                    wait();             // give chance to others
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

        else if (name.equals("Mother")) {

            for (int i = 1000; i <= m_amount; i += 1000) {

                while (balance < 1000) {
                    try {
                        System.out.println("Mother waiting due to insufficient balance...");
                        wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                balance -= 1000;
                System.out.println("Mother withdrew 1000 and Balance: " + balance);

                notifyAll();

                try {
                    Thread.sleep(1000); // ✅ delay
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

        else if (name.equals("Daughter")) {

            for (int i = 1000; i <= d_amount; i += 1000) {

                while (balance < 1000) {
                    try {
                        System.out.println("Daughter waiting due to insufficient balance...");
                        wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                balance -= 1000;
                System.out.println("Daughter withdrew 1000 | Balance: " + balance);

                notifyAll();

                try {
                    Thread.sleep(1000); // ✅ delay
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

        notifyAll(); // final wake-up
    }

    public static void main(String[] args) {

        BankingThread b = new BankingThread(10000, 5000, 10000);

        Thread Father = new Thread(b);
        Thread Mother = new Thread(b);
        Thread Daughter = new Thread(b);

        Father.setName("Father");
        Mother.setName("Mother");
        Daughter.setName("Daughter");

        Father.start();
        Mother.start();
        Daughter.start();
    }
}