package day20.Collections.ArrayList;
import java.util.ArrayList;
public class LargestNum {
public static void main(String[] args) {
	ArrayList<Integer> arrL1 = new ArrayList<>();
	arrL1.add(20);
	arrL1.add(30);
	arrL1.add(10);
	int largest = arrL1.get(0);
	int n = arrL1.size();
	for (int i = 0; i < n; i++) {
		if(arrL1.get(i) > largest) {
			largest = arrL1.get(i);
		}
	}
	System.out.println("The largest element in the ArrayList is : "+ largest);
}
}
