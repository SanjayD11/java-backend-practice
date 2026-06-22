package day15.accessModifiers;
public class A{
	public void methOne() {
		System.out.println("public method 1");
	}
	protected void methTwo() {
		System.out.println("protected method 2");
	}
	 void methThree() {
		System.out.println("default method 3");
	}
	private void methFour() {
		System.out.println("private method 4");
	}
	
}