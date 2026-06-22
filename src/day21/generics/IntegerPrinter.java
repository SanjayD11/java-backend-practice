package day21.generics;
public class IntegerPrinter implements Printer<Integer>{
public void print(Integer value) {
	System.out.println("The integer value is : "+value);
}
}
