package day7.whileanddowhile;

public class Factorial {

 public static void main (String[] args) {
	 int i =0;
	 int fact = 1;
	 int n = 5;
	 
	 
	 while(i<n) {
		 fact += fact * i;
		 i++;
	 }
	 System.out.println(fact);
 }
}
