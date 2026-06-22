package day13;
	public class A extends Object{

		int x;

		public A() {
			super();
			this.x = 0;
		}

		public A(int x) {
			this.x = x;
		}

		public void methodOne() {
			System.out.println("Class A Method One");
		}

		public static void main(String[] args) {
			A a = new A();
			a.methodOne();
		}

	}

