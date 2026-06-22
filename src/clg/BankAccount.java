package clg;
import java.util.Scanner;
public class BankAccount {
    int accountNumber;
    String name;
    int balance;
    BankAccount(int aNumber, String n, int b){
    	this.accountNumber = aNumber;
    	this.name = n;
    	this.balance = b;
    }
    Scanner scan = new Scanner(System.in);
    public void deposit(){
        if(accountNumber == 543){
            System.out.println("Enter the amount you want to deposit:");
            int amount = scan.nextInt();
            balance = balance + amount;
            System.out.println("Amount " + amount + " deposited successfully!");
            System.out.println("Total balance is: " + balance);
        } else {
            System.out.println("This account number does not exist.");
        }
    }
    public void withdraw(){
        if(accountNumber == 543){
            System.out.println("Enter the amount you want to withdraw:");
            int amount = scan.nextInt();
            if (amount <= balance){
                balance = balance - amount;
                System.out.println("Amount " + amount + " withdrawn successfully!");
            } else {
                System.out.println("Insufficient balance!");
            }

            System.out.println("Total balance is: " + balance);
        } else {
            System.out.println("This account number does not exist.");
        }
    }
    public static void main(String[] args) {
        BankAccount b1 = new BankAccount(543, "Sanjay", 50000 );
        b1.deposit();
        b1.withdraw();
    }
}
