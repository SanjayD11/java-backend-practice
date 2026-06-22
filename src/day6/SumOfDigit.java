package day6;

public class SumOfDigit {

	public static void main(String args[]) {
		int num = 4589;
		int count =0;
		int sum =0;
		int digit;
		for (int i = 0 ; num !=0 ; i ++) {
			count = count +1;
			digit = num % 10;
			num = num/10;
			sum = sum +digit;
		}
		System.out.println("the count of the given number is "+count);
		System.out.println("the sum of the digits is "+sum);

		
	}

}
