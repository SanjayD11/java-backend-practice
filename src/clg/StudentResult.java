package clg;

import java.util.Scanner;

public class StudentResult {
	int mark1;
	int mark2;
	int mark3;
	public void total() {
		int sum=mark1+mark2+mark3;
		System.out.println("the total marks is: "+sum);
		
	}
	public void average() {
		int average=(mark1+mark2+mark3)/3;
		System.out.println("the average marks is: "+average);
		
	}
	public static void main(String[] args) {
		  Scanner scan = new Scanner(System.in);
	        StudentResult s1 = new StudentResult();
	        System.out.print("Enter mark 1: ");
	        s1.mark1 = scan.nextInt();
	        System.out.print("Enter mark 2: ");
	        s1.mark2 = scan.nextInt();
	        System.out.print("Enter mark 3: ");
	        s1.mark3 = scan.nextInt();
	        s1.total();
	        s1.average();

	}

}