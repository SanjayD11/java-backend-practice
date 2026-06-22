package day8;

public class Fibonacci {

 public static void main (String[] args) {
	 int a=0;
	 int b= 1;
	 int i = 0;
	do  {
		 int fibo = a;
		 int temp= fibo+b;
		 a= b;
		 b=temp;
		 System.out.println(fibo);
		 i++;
 }while(i<=10);
	
	 
 }
}
