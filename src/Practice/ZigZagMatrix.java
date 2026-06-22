package Practice;
import java.util.*;
public class ZigZagMatrix {
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	int arr[][]= new int[3][3];
	int n = arr[0].length-1;
	System.out.println("Enter the Matrix : ");
	for(int i = 0; i < arr.length; i++) {
		for(int j = 0; j < arr.length; j++) {
		arr[i][j] = s.nextInt();
	}	
	}
	System.out.println("The Resultant ZigZagged Matrix is : ");
	for(int i = 0; i < arr.length; i++) {
		if(i%2 == 0) {
			int j = 0;
			while(j<=n) {
				System.out.print(" "+arr[i][j]);
				j++;
			}
			System.out.println();
		}
		else{
			int j = n;
			while(j>=0) {
				System.out.print(" "+arr[i][j]);
                j--;			
			}
			System.out.println();
		}
	}
}
}
