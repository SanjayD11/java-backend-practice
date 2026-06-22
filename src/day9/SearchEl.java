package day9;

public class SearchEl {
public static void main (String[] args) {
	int x[] = new int[5];
	int value=10;
	int i;
	for ( i = 0; i <5; i++) {
		x[i]=value;
		value+=10;
	}
	int key = 30;
	for (i =0 ; i < 5 ; i ++) {
		if (x[i]== key) {
			System.out.println("the element " + key + " is found at index " + i);
		}
		
	}
}
}
