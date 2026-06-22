package day21.generics;
public class StringPrinter implements Printer<String> {
  public void print (String value) {
	System.out.println("The String value is : "+ value);
}
}
