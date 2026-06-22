package Practice;
	import java.util.*;

	public class BasicQueueDemo {
	    public static void main(String[] args) {
	        Queue<Integer> q = new LinkedList<>();

	        // Insert
	        q.offer(10);
	        q.offer(20);
	        q.offer(30);

	        System.out.println("Queue: " + q);

	        // Peek (front element)
	        System.out.println("Peek: " + q.peek());

	        // Remove elements
	        while (!q.isEmpty()) {
	            System.out.println("Removed: " + q.poll());
	        }
	    }
	}

