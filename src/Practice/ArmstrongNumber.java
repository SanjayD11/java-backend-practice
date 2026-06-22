package Practice;
import java.util.*;
public class ArmstrongNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int num = sc.nextInt();
		int org = num;
		int temp = num;
		int digit;
		int sum = 0;
		int count = 0;
		while (temp != 0) {
			count++;
			temp /= 10;
		}
		temp = num;
		while (temp != 0) {
			digit = temp % 10;
			int power = 1;
			for (int i = 0; i < count; i++) {
				power = power * digit;
			}
			sum += power;
			temp /= 10;
		}
		if (sum == org) {
			System.out.println("The given number " + org + " is a Armstrong number");
		} else {
			System.out.println("The given number is not a Armstrong number");
		}
	}

}
