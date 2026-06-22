package LinkedList;
import java.util.Iterator;

public class LinkedList<T> implements Iterable<T> {

    Node head;

    class Node {
        T data;
        Node next;

        Node(T val) {
            data = val;
            next = null;
        }
    }

    public LinkedList() {
        head = null;
    }

    public void insertAtBeginning(T val) {
        Node newNode = new Node(val);

        if (head == null) {
            head = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    public void insertAtPos(int pos, T val) {
        if (pos == 0) {
            insertAtBeginning(val);
            return;
        }

        Node newNode = new Node(val);
        Node temp = head;

        for (int i = 1; i < pos; i++) {
            if (temp == null) {
                System.out.println("Invalid Position");
                return;
            }
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Invalid Position");
            return;
        }

        newNode.next = temp.next;
        temp.next = newNode;
    }
    
    public void insertAtEnd(T val) {

        Node newNode = new Node(val);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    public void display() {
    	Iterator<T> it = iterator();
    	while(it.hasNext()) {
    		System.out.print(it.next() + " ");
    	}
        System.out.println();
    }

    public void deleteAtBeginning() {
        if (head == null) {
            System.out.println("List is empty, cannot delete");
            return;
        }

        head = head.next;
    }

    public void deleteAtPos(int pos) {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        if (pos == 0) {
            deleteAtBeginning();
            return;
        }

        Node temp = head;
        Node prev = null;

        for (int i = 1; i <= pos; i++) {
            if (temp == null) {
                System.out.println("Invalid Position");
                return;
            }

            prev = temp;
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Invalid Position");
            return;
        }

        prev.next = temp.next;
    }
    
    public void deleteAtEnd() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        if (head.next == null) {
            head = null;
            return;
        }
        Node temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;
    }
    
    public T get(int pos) {
        Node temp = head;
        for (int i = 1; i <= pos; i++) {
            if (temp == null) {
                throw new IndexOutOfBoundsException();
            }
            temp = temp.next;
        }
        if (temp == null) {
            throw new IndexOutOfBoundsException();
        }
        return temp.data;
    }
    
    public void update(int pos, T val) {
        Node temp = head;
        for (int i = 1; i <= pos; i++) {
            if (temp == null) {
                System.out.println("Invalid Position");
                return;
            }
            temp = temp.next;
        }
        if (temp == null) {
            System.out.println("Invalid Position");
            return;
        }
        temp.data = val;
    }
    
    public boolean search(T key) {
        Node temp = head;
        while (temp != null) {
            if (temp.data.equals(key)) {
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    @Override
    public Iterator<T> iterator() {

        return new Iterator<T>() {

            Node temp = head;

            @Override
            public boolean hasNext() {
                return temp != null;
            }

            @Override
            public T next() {
                T val = temp.data;
                temp = temp.next;
                return val;
            }
        };
    }
    
    public int size() {

        int count = 0;
        Node temp = head;

        while (temp != null) {
            count++;
            temp = temp.next;
        }

        return count;
    }
}