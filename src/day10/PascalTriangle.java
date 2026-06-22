package day10;
public class PascalTriangle {
public static void main(String[] args) {
	for (int i = 0; i < 8; i++) {
	    int val = 1;
	    for (int j = 0; j <= i; j++) {
	        System.out.print(val + " ");
	        val = val * (i - j) / (j + 1);
	    }
	    System.out.println();
	}
}
}