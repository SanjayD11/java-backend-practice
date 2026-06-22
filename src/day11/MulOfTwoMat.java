package day11;
import java.util.Scanner;
public class MulOfTwoMat {
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	int a[][]=new int[3][3];
	int b[][]=new int[3][3];
	int mul[][]=new int[3][3];
	for ( int i =0;i<3;i++) {
		for( int j=0;j<3;j++) {
			System.out.print("enter the value for a["+i+"]["+j+"] :");
			a[i][j]=s.nextInt();
		}
	}
	for ( int i =0;i<3;i++) {
		for( int j=0;j<3;j++) {
			System.out.print("enter the value for b["+i+"]["+j+"] :" );
			b[i][j]=s.nextInt();
		}
	}
	for ( int i =0;i<3;i++) {
		for( int j=0;j<3;j++) {
			mul[i][j] = a[i][j]*b[i][j];
		}
	
	}
	
	System.out.println("the resultant array is :");
	for ( int i =0;i<3;i++) {
		for( int j=0;j<3;j++) {
			System.out.print("  "+mul[i][j]);
		}
		System.out.println();
	
	}


}
}
