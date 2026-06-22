package clg;

class Producer extends Thread {
    private Item item;

    public Producer(Item item) {
        this.item = item;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            try {
                synchronized (item) {
                    System.out.println("Producing: " + i);
                    Thread.sleep(1000);
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}