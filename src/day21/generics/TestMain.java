package day21.generics;
public class TestMain {
public static void main(String[] args) {
	StringPrinter sp = new StringPrinter();
	IntegerPrinter ip = new IntegerPrinter();
	sp.print("Hello");
	ip.print(100);
}
}
