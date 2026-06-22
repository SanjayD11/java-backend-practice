package day13;



public class B extends A{

	int y;
	
	public B() {
		super();
		this.y = 0;
	}
	
	public B(int y, int x) {
		super(x);
		this.y = y;
	}
	
	public B(int y) {
		
		this.y = y;
	}
	
	

	public void methodTwo() {
		System.out.println("Class B Method Two");
	}

	public static void main(String[] args) {
		B b = new B();
		b.methodTwo();
		b.methodOne();
	}
}