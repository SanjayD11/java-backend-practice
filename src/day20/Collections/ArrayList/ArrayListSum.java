package day20.Collections.ArrayList;
import java.util.ArrayList;
public class ArrayListSum {
public static void main(String[] args) {
	ArrayList<Integer> arrL1 = new ArrayList<>();
	arrL1.add(10);
	arrL1.add(20);
	arrL1.add(30);
	int sum = 0;
	for (Integer n : arrL1) {
		 sum += n; 
	}
	System.out.println("The Sum of Elements in the ArrayList is : "+ sum);
}
}
