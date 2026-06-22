package day25.regex;
public class StringMatches {
	public static void main(String[] args) {
		String regex1 = "^\\d+$";  //only digits
		String regex2 = "[sa]";
		String value1 = "712381";
		String value2 = "s";
		
		System.out.println(value1.matches(regex1));
		System.out.println(value2.matches(regex2));
		
		
	}
}