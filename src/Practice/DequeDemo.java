package Practice;
import java.util.*;

public class DequeDemo {
    public static void main(String[] args) {
        Deque<Integer> dq = new ArrayDeque<>();

        dq.addFirst(10);
        dq.addLast(20);
        dq.addFirst(5);

        System.out.println("Deque: " + dq);

        dq.removeFirst();
        dq.removeLast();

        System.out.println("After removals: " + dq);
    }
}
