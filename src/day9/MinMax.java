package day9;

public class MinMax {
	 public static void main(String[] args) {
		int min;
		int max;
		int value =10;
		int i;
		int x[]= new int[5];
	
	
		for (i =0; i <5; i++) {
			x[i]= value;
			value+=10;
		}
		min = x[0];
		max = x[0];
		for (i = 0; i < 5; i++) {
			if ( x[i]< min) {
				min = x[i];
			}
			else {
				max = x[i];
			}
		}
		System.out.println("minimum element is " + min +" and max element is " + max);
		
	}
		
	}
