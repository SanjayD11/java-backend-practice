package day16.encapsulation;

public class B extends A {
	public static void main(String[] args) {
		B b = new B();
		b.setA(10);
		b.setB(20);
		System.out.println(b.getA());
		System.out.println(b.getB());
	}

}