package day17.stringClass;
public class StringMethods{
	String name1 = "Sanjay D";
	String name2 = "Luffy";
	String name3 = "sanjay d";

	public static void main(String[] args) {
		StringMethods s = new StringMethods();
		System.out.println("Name 1 : "+s.name1);
		System.out.println("Name 2 : "+s.name2);
		System.out.println("Name 3 : "+s.name3);
		System.out.println("Equals method : "+ s.name1.equals(s.name2));
		System.out.println("Equals Ignore Case method : "+s.name1.equalsIgnoreCase(s.name3));
		System.out.println("Contains method : "+s.name1.contains("San"));
		System.out.println("Replace method : "+s.name3.replace('d','D'));
		System.out.println("Index Of method : "+s.name3.indexOf('s'));
	}
}