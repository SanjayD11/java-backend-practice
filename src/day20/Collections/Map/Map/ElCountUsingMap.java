package day20.Collections.Map.Map;
import java.util.*;
public class ElCountUsingMap {
public static void main(String[] args) {
	HashMap<Integer, Integer> map = new HashMap<>();
	Scanner sc = new Scanner(System.in);
	int arr[] = new int[5];
	System.out.println("Enter the Array Elements : ");
	for (int i = 0; i < arr.length ; i++) {
		arr[i] = sc.nextInt();
	}
	for ( int j : arr) {
		if(map.containsKey(j)) {
			map.put(j, map.get(j) + 1);
			
		}
		else {
			map.put(j, 1);
		}
	}
	System.out.println("Count of the Elements : "+map);
}
}
//public class CountFrequency {
//    public static void main(String[] args) {
//
//        // Array containing numbers
//        int[] arr = {1, 2, 3, 2, 4, 1, 2};
//
//        // Outer loop: picks one element at a time
//        for (int i = 0; i < arr.length; i++) {
//
//            int count = 1; // Start count as 1 (the element itself)
//
//            // Variable to check if this element was already processed earlier
//            boolean visited = false;
//
//            // Loop to check all previous elements before index i
//            for (int k = 0; k < i; k++) {
//
//                // If the same number appeared before
//                if (arr[i] == arr[k]) {
//                    visited = true; // Mark as already counted
//                    break;          // Stop checking further
//                }
//            }
//
//            // If the element was already counted earlier, skip this iteration
//            if (visited) {
//                continue;
//            }
//
//            // Loop to count occurrences of arr[i] after index i
//            for (int j = i + 1; j < arr.length; j++) {
//
//                // If the same element appears again
//                if (arr[i] == arr[j]) {
//                    count++; // Increase frequency count
//                }
//            }
//
//            // Print the number and its frequency
//            System.out.println(arr[i] + " appears " + count + " times");
//        }
//    }
//}
