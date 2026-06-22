
package day11;
import java.util.Scanner;

public class ZeroDiagMat {
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	String a[][]=new String[4][4];
	System.out.println("the Zero array is :");
	for ( int i =0;i<4;i++) {
		for( int j=0;j<4;j++) {
			if(i==j) {
			a[i][j]="0";
		}
			else {
				a[i][j]="*";
			}

			
	
	}	
	}
	for ( int i =0;i<4;i++) {
		for( int j=0;j<4;j++) {
			System.out.print("  "+a[i][j]);
		}
		System.out.println();
	
	}	
	

}
}

