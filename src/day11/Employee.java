package day11;

public class Employee{
int emp_id;
String name;
int age;
int salary;
int basic, da, conveyance;
Employee(int emp_id, String name, int age, int basic, int da, int conveyance){
	this.emp_id = emp_id;
	this.name = name;
	this.age = age;
	this.basic = basic;
	this.da = da;
	this.conveyance = conveyance;
}
void empSalary() {
	salary = basic+da+conveyance;
}
void display() {
	System.out.println("Name : "+ this.name);
	System.out.println("Emp id : " + this.emp_id);
	System.out.println("Age : " + this.age);
	System.out.println("The salary of "+ this.name+ " is : " + salary);
}
void callMethods() {
	this.empSalary();
	this.display();
}
public static void main(String[] args) {
	Employee aswin = new Employee(10,"Aswin",18,15000,2000,4000);
	Employee harish = new Employee(11,"Harish",19,18000,3000,4000);
	Employee kabil = new Employee(12,"Kabil",20,17000,2500,3800);
	Employee Aadhav = new Employee(13,"Aadhav",18,18000,1700,4500);
	aswin.callMethods();
	harish.callMethods();
	kabil.callMethods();
	Aadhav.callMethods();
}

}

