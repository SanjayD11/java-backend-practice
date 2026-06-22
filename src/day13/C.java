package day13;
public class C extends B {

	int z;

	public C() {
		super();
	}
	
	public C(int x, int y, int z) {
		super(y,x);
		this.z = z;
	}

	public void methodThree() {
		System.out.println("Class C Method Three");
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
	}

	public static void main(String[] args) {
//		C c = new C();
//
//		c.methodTwo(); // B
//		c.methodOne(); // A
//		c.methodThree(); // C
//
//		A a = new C();
//		a.methodOne();
//
//		B b = new C();
//		b.methodOne();
//		b.methodTwo();
		
		C c1 = new C(100, 200, 300);
		c1.methodThree();
		

	}
}