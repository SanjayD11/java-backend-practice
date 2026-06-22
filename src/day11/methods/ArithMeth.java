package day11.methods;
import java.util.Scanner;
public class ArithMeth {
	public static void add(int a[]) {
		int sum =0;
		for(int i =0; i<a.length;i++) {
		sum = sum+a[i];
		
		}
		System.out.println("The sum is :"+sum);	
	}
	public static void sub(int c, int d) {
		System.out.println("Subraction :"+ (c-d));
	}
	public static void prod(int c, int d) {
		System.out.println("Multiplication :"+ (c*d));
	}
	public static void division(int c, int d) {
		System.out.println("Division :" + ((d!=0)? (double)c/d:"Divide by Zero Error"));
	}
	public static void main(String[] args) {
		int a[] = new int[3];
	
		int c;
		int d;
		Scanner s = new Scanner(System.in);
		for(int i =0;i < a.length;i++) {
		System.out.print("Enter the value of a["+i+"] :");
		a[i]=s.nextInt();
		}
		System.out.print("Enter the C value :");
		c = s.nextInt();
		System.out.print("Enter the D value :");
		d = s.nextInt();
		System.out.println("Arithmetic Operations");
		add(a);
		sub(c,d);
		prod(c,d);
		division(c,d);
	}

}
