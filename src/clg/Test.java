package clg;

public class Test {
    public static void main(String[] args) throws InterruptedException {
        Item item = new Item("Initial");

        Producer producer = new Producer(item);
        Consumer consumer = new Consumer(item);

        producer.start();
        consumer.start();

        producer.join();
        consumer.join();

        System.out.println("Produced items:");
        for (int i = 0; i < 5; i++) {
            System.out.println(i + 1);
        }

        System.out.println("Consumed items:");
        for (int i = 0; i < 5; i++) {
            System.out.println(i + 1);
        }
    }
}