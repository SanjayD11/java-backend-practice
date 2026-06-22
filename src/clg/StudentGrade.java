package clg;

import java.util.Scanner;

public class StudentGrade {
	int marks;
	public  void GradeCalculation()
	{
		if(marks>=90) {
			System.out.println("the student has achieved A grade");
		}else if(marks>=80){
			System.out.println("the student has achieved B grade");	
		}
		else if(marks>=70) {
			System.out.println("the student has achieved C grade");
		}
		else if(marks>=60) {
			System.out.println("the student has achieved D grade");
		}
		else if(marks>=50) {
			System.out.println("the student has achieved E grade");	
		}
		else {
			System.out.println("the student has failed the examination");
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StudentGrade s1=new StudentGrade();
		System.out.println("Enter the mark: ");		
		s1.marks=sc.nextInt();
		s1.GradeCalculation();

}
}
