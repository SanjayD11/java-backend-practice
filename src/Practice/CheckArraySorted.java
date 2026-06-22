package Practice;
import java.util.*;
public class CheckArraySorted {
	
public boolean checkIfSorted(int arr[]) {
	int count = 0;
	for(int  i = 0; i < arr.length - 1; i++) {
		if(arr[i] <= arr[i+1] ) {
			count ++;
		}
		if(count == arr.length - 1) {
			return true;
		}
	}
	return false;
}
public static void main(String[] args) {
	int arr[] = new int[6];
	CheckArraySorted c = new CheckArraySorted();
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the Array Elements : ");
	for(int i = 0; i < arr.length; i++) {
		arr[i] = sc.nextInt();
	}
	boolean b = c.checkIfSorted(arr);
	if(b) {
		System.out.println("The given array is sorted");
	}
	else {
		System.out.println("The array is not sorted");
	}
}
}
