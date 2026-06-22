package day7.whileanddowhile;
import java.util.*;
public class Palindrome {
public static void main ( String[] args) {
	int num;
	Scanner obj = new Scanner (System.in);
	num = obj.nextInt();
	int i =0;
	int rev = 0;
	do{
		int digit = num %10;
		rev = rev * 10 + digit;
		num = num/10;
	}while(num!=0);
		if ( rev == num) {
			System.out.println(rev);
		}
	}
	
}


