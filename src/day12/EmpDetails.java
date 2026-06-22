package day12;
public class EmpDetails{
int emp_id;
String name;
String department;
String designation;
String newDesignation;
double basicSalary;
double inc ;
double bonus ;
double salary;
boolean ispromote = false;
int experience;


EmpDetails(int emp_id, String name, String department, String designation, double basicSalary, int experience){
	this.emp_id = emp_id;
	this.name = name;
	this.department = department ;
	this.designation = designation;
	this.basicSalary = basicSalary;
	this.experience = experience;
}
void calculateAnnualSalary() {
	this.salary = basicSalary*12;
}
static int i=0;
void displayProfile() {

	System.out.println("Employee "+ ++i +":");
	System.out.println("Name : "+ this.name);
	System.out.println("Emp id : " + this.emp_id);
	System.out.println("Department : " + this.department);
	System.out.println("Designation : " + this.designation);
	System.out.println("Basic Salary : "+this.basicSalary);
	System.out.println("Experience : "+ this.experience);
	System.out.println("Bonus : "+ this.bonus);
	this.promote("Senior", (basicSalary*0.1));
	System.out.println("The salary of "+ this.name+ " is : " + (this.salary + this.inc + this.bonus));
}
void callMethods() {
	this.calculateBonus();
	this.calculateAnnualSalary();
	this.isEligibleForPromotion();
	this.displayProfile();
	System.out.println();
}
void calculateBonus() {
	if(experience<2) {
		bonus = basicSalary * 0.05;
		salary += bonus; 
	}
	else if(experience >=2 && experience <=5) {
		bonus = basicSalary * 0.1;
		salary += bonus;
	}
	else {
		bonus = basicSalary * 0.2;
		salary += bonus;
	}
}

void promote(String newDesignation,double inc) {
	if(ispromote==true) {
		this.newDesignation = newDesignation;
		this.inc = inc;
		System.out.println("You are promoted !");
		System.out.println("the New Designation is : "+ this.newDesignation);
		System.out.println("the New Salary increment is : "+this.inc);

	}
	else {
		System.out.println("Sorry, u are not eligible for promption !");
	}
}
boolean isEligibleForPromotion() {
	if(experience >= 3) {
		ispromote = true;
	}
return ispromote;
}
public static void main(String[] args) {
	EmpDetails aswin = new EmpDetails(10,"Aswin","Sales","CEO",15000.0,1);
	EmpDetails harish = new EmpDetails(11,"Harish","Marketing","Developer",20000.0,4);
	EmpDetails kabil = new EmpDetails(12,"Kabil","Finance","Manager",21000.0,4);
	EmpDetails Aadhav = new EmpDetails(13,"Aadhav","Administration","Admin",18000.0,2);
	aswin.callMethods();
	harish.callMethods();
	kabil.callMethods();
	Aadhav.callMethods();
}

}

