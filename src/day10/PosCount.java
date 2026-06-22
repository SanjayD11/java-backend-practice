package day10;

public class PosCount {
public static void main(String[] args) {
  int arr[] ={-1,-3,-5,7,2};
int count = 0;
  for ( int i = 0 ; i < arr.length ; i++) {
	  if (arr[i]>=0) {
		  count++;
	  }
  }
System.out.println("the count of positive number is " + count);
}
}
