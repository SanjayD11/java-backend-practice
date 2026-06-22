package day11.methods;
import java.util.Scanner;
public class DemoMethods {
	public static void add(int x, int y) {
		System.out.println("Addition :"+ (x+y));
	}
	public static void sub(int x, int y) {
		System.out.println("Subraction :"+ (x-y));
	}
	public static void prod(int x, int y) {
		System.out.println("Multiplication :"+ (x*y));
	}
	public static void division(int x, int y) {
		System.out.println("Division :" + ((y!=0)? (double)x/y:"Divide by Zero Error"));
	}
	public static void main(String[] args) {
		int a,b;
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the value 1 : ");
		a=s.nextInt();
		System.out.print("Enter the value 2 : ");
		b=s.nextInt();
		System.out.println("Arithmetic Operations");
		add(a,b);
		sub(a,b);
		prod(a,b);
		division(a,b);
	}

}
