package clg;

class Item {
    String name;
    static Object lock = new Object();

    public Item(String name) {
        this.name = name;
    }

    public synchronized void produceAndConsume() {
        
    }
}