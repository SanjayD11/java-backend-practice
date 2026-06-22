package Practice;
import java.util.*;
public class OddEvenCount {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int arr[][] = new int[2][3];
		int evenCount = 0;
		int oddCount = 0;
		System.out.println("Enter the 2 * 3 matrix : ");
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
			arr[i][j] = s.nextInt();
		}	
		}
		for(int i = 0; i < (arr.length); i++) {
			for(int j = 0; j < (arr[i].length); j++) {
			   if(arr[i][j] % 2 == 0) {
				   evenCount+=1;
			   }
			   else {
				   oddCount+=1;
			   }
			
			}	
		}
		System.out.println("The Even and Odd counts of the given Matrix are : "+evenCount+" and "+oddCount);
	
	}
}
