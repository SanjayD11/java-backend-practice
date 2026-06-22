package day10;
import java.util.Scanner;
public class PrintOddNum {
public static void main(String[] args) {
	int i;
	int n;
	Scanner sc = new Scanner(System.in);
	n = sc.nextInt();
	for ( i = 0 ; i < n ; i++) {
		if (i%2!=0) {
			System.out.println("The odd numbers are "+i);
		}
	}
	
	

}
}
