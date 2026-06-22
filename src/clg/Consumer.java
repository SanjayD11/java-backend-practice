package clg;

class Consumer extends Thread {
    private Item item;

    public Consumer(Item item) {
        this.item = item;
    }

    @Override
    public synchronized  void run() {
        for (int i = 0; i < 5; i++) {
            try {
               
                    item.wait();
                    System.out.println("Consuming: " + i);
                    item.notifyAll();
                
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}