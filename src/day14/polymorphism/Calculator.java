package day14.polymorphism;

public class Calculator {
	void add(int a, int b){
		System.out.println("Sum 1(using 2 integers) : "+(a+b));
	}
	void add(double a, double b) {
		System.out.println("Sum 2(using double) : "+(a+b));
	}
	void add(int a, int b, int c) {
		System.out.println("Sum 3(using three integers) : "+(a+b+c));
	}
	void add(String a, String b) {
		System.out.println("Concatenation using Two Strings :"+ a+" "+b);
	}

public static void main(String[] args) {
	Calculator c = new Calculator();
	c.add(10, 20);
	c.add(15.45,16.89);
	c.add(10, 20, 30);
	c.add("Hello", "World");
}
}
