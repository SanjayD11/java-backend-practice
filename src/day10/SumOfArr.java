package day10;

public class SumOfArr {
public static void main(String[] args) {
	int a[] = {1,2,3,4};
	int sum = 0;
	for (int i = 0; i < a.length; i++) {
		sum = sum + a[i];
	}
	System.out.println("the sum of elements in the array is :" + sum);
}
}
