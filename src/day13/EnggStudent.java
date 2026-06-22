package day13;
public class EnggStudent extends Student{
	String branch;
	int semester;
	void setEnggDetails(String branch, int semester) {
		this.branch = branch;
		this.semester = semester;
	}
	void displayEnggDetails() {
		displayDetails();
		System.out.println("The Branch is : "  + branch);
		System.out.println("The Semester is : " + semester);
	}
	public static void main(String[] args) {
		EnggStudent e = new EnggStudent();
		e.setDetails("Sanjay",11,18);
		e.setEnggDetails("CSE", 4);
		e.displayEnggDetails();
	}
}