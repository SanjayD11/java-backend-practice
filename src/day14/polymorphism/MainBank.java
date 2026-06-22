package day14.polymorphism;

public class MainBank {
	public static void main(String[] args) {
		Bank b;
		 b = new SBI();
		System.out.println("SBI bank's Interest : "+(b.getInterestRate()));
		 b = new HDFC();
		System.out.println("HDFC bank's Interest : "+(b.getInterestRate()));
		 b = new ICICI();
		System.out.println("ICICI bank's Interest : "+(b.getInterestRate()));
		
	}

}
