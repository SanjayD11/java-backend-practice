package Practice;

import java.util.*;

public class RowWithMaxSum {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int arr[][] = new int[3][3];
		int n = arr[0].length - 1;
		System.out.println("Enter the Matrix : ");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				arr[i][j] = s.nextInt();
			}
		}
		int i = 0;
		int r1 = 0;
		int r2 = 0;
		int r3 = 0;
		while (i <= n) {
			if (i == 0) {
				for (int j = 0; j <= n; j++) {
					r1 += arr[i][j];
				}
			}

			if (i == 1) {
				for (int j = 0; j <= n; j++) {
					r2 += arr[i][j];
				}
			}

			if (i == 2) {
				for (int j = 0; j <= n; j++) {
					r3 += arr[i][j];
				}

			}
			i++;
		}
		if (r1 > r2 && r1 > r3) {
			System.out.println("The Row 1 has the maximum sum value : " + r1);
			if (r1 == r2) {
				System.out.println("The Rows 1 & 2 has the max sum value");
			} else if (r1 == r3) {
				System.out.println("The Rows 1 & 3 has the max sum value");
			}
		} else if (r2 > r1 && r2 > r3) {
			System.out.println("The Row 2 has the maximum sum value : " + r2);
			if (r2 == r1) {
				System.out.println("The Rows 1 & 2 has the max sum value");
			} else if (r2 == r3) {
				System.out.println("The Rows 2 & 3 has the max sum value");
			}
		} else {
			System.out.println("The row 3 has the maximum sum value : " + r3);
			if (r3 == r2) {
				System.out.println("The Rows 3 & 2 has the max sum value");
			} else if (r3 == r1) {
				System.out.println("The Rows 1 & 3 has the max sum value");
			}
		}

	}
}
