package Practice;
import java.util.*;

public class ArrayDequeQueue {
    public static void main(String[] args) {
        Queue<Integer> q = new ArrayDeque<>();

        q.offer(1);
        q.offer(2);
        q.offer(3);

        while (!q.isEmpty()) {
            System.out.println(q.poll());
        }
    }
}
