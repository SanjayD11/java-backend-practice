package LinkedList;

public class Demo {

    public static void main(String[] args) {

        LinkedList<Integer> list = new LinkedList<>();
        // Insert at Beginning
        list.insertAtBeginning(30);
        list.insertAtBeginning(20);
        list.insertAtBeginning(10);
        System.out.print("After insertAtBeginning: ");
        list.display();
        // Insert at End
        list.insertAtEnd(40);
        list.insertAtEnd(50);
        System.out.print("After insertAtEnd: ");
        list.display();
        // Insert at Position
        list.insertAtPos(2, 25);
        System.out.print("After insertAtPos(2, 25): ");
        list.display();
        // Delete at Beginning
        list.deleteAtBeginning();
        System.out.print("After deleteAtBeginning: ");
        list.display();
        // Delete at End
        list.deleteAtEnd();
        System.out.print("After deleteAtEnd: ");
        list.display();
        // Delete at Position
        list.deleteAtPos(2);
        System.out.print("After deleteAtPos(2): ");
        list.display();
        // Search
        System.out.println("Search 25: " + list.search(25));
        System.out.println("Search 100: " + list.search(100));
        // Get
        System.out.println("Element at index 1: " + list.get(1));
        // Update
        list.update(1, 99);
        System.out.print("After update(1, 99): ");
        list.display();
        // Size
        System.out.println("Size = " + list.size());
    }
}