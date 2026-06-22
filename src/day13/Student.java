package day13;

public class Student {
		String name;
		int rollNumber;
		int age;
		void setDetails(String name, int rollNumber, int age){
			this.name = name;
			this.rollNumber = rollNumber;
			this.age = age;
		}
		void displayDetails() {
			System.out.println("The Student's name is : "+name);
			System.out.println("The Roll Number is : "+rollNumber);
			System.out.println("The Age is : "+age);
	}
}
