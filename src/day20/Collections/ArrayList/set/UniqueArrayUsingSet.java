package day20.Collections.ArrayList.set;
import java.util.*;
public class UniqueArrayUsingSet {
	public static void main(String[] args) {
		int arr[] = new int[5];
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the Array elements : ");
		for(int i = 0; i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		Set<Integer> unique = new HashSet<>();
		for(int i : arr) {
			unique.add(i);
		}
		int u[] = new int[unique.size()];
		int c = 0;
		System.out.println("Unique Array (Duplicate Removed)");
		for(int j : unique) {
			u[c++] = j;
			System.out.println(u[c-1]+" ");
			
		}
	}

}
