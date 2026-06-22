package Practice;
import java.util.*;
public class IdentityMatrix {

public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	int arr[][] = new int[3][3];
	boolean id = true;
	System.out.println("Enter the 3 * 3 matrix : ");
	for(int i = 0; i < arr.length; i++) {
		for(int j = 0; j < arr[i].length; j++) {
		arr[i][j] = s.nextInt();
	}	
	}
	for(int i = 0; i < (arr.length); i++) {
		for(int j = 0; j < (arr[i].length); j++) {
		if(i==j && arr[i][j]!=1) {
			id = false;
		}
		else if(i!=j && arr[i][j]!=0) {
			id = false;
		}
	}
	}
	if(id == true) {
	System.out.println("The resultant matrix is a Identity matrix ");
	}
	else{
		System.out.println("The resultant matrix is not a Identity matrix");
	}
}
}
