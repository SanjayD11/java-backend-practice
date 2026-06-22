package clg;
import java.util.Scanner;
public class ShoppingCart {
    String itemName;
    int quantity;
    double price;
    double totalCost;
    public void calculateTotal() {
        totalCost = quantity*price;
        System.out.println("Item Name: " +itemName);
        System.out.println("Quantity: " +quantity);
        System.out.println("Price per item: " +price);
        System.out.println("Total Cost: " +totalCost);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ShoppingCart item = new ShoppingCart();
        System.out.print("Enter item name: ");
        item.itemName = sc.nextLine();
        System.out.print("Enter quantity: ");
        item.quantity = sc.nextInt();
        System.out.print("Enter price per item: ");
        item.price = sc.nextDouble();

        item.calculateTotal();

    
    }
}

