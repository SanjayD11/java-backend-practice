package day19.wrapperClass;
import java.io.*;
public class ParsingUsingWrapperClass{
	public void parsing(String s1, String s2) {
	int a = Integer.parseInt(s1);
	int b = Integer.parseInt(s2);
	System.out.println("Sum : " +(a+b));
	System.out.println("Difference : "+(a-b));
	System.out.println("Product : "+(a*b));
	if(b>0)
		System.out.println("Quotient : "+(a/b));
	else
		System.out.println("DivideByZero Error occured");
	}
	public static void main(String[] args) throws IOException{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		System.out.print("Enter the first string value : ");
		String s1 = br.readLine();
		System.out.print("Enter the second string value : ");
		String s2 = br.readLine();
		ParsingUsingWrapperClass wc = new ParsingUsingWrapperClass();
		wc.parsing(s1,s2);
	}
}