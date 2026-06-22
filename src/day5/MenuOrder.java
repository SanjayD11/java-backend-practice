package day5;

public class MenuOrder
{
    public static void main(String[] args) {
      
        int choice = 2;    
        int quantity = 3;  

        int price = 0;

        switch (choice) {
            case 1:
                price = 30; // Idli
                break;
            case 2:
                price = 50; // Dosa
                break;
            case 3:
                price = 40; // Poori
                break;
            case 4:
                price = 45; // Pongal
                break;
            default:
                System.out.println("Invalid choice!");
                return;
        }

        int total = price * quantity;
        System.out.println("Total amount: ₹" + total);
    }
}