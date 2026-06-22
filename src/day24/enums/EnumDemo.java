package day24.enums;
public class EnumDemo {
	enum Status{
		SUCCESS(200), FAILURE(400);
		int code;
		Status(int code) {
			this.code = code;
		}
		int getCode() {
			return code;
		}
	}	
public static void main(String[] args) {
	int a = 10;
	Status s1 = Status.SUCCESS;
	Status s2 = Status.FAILURE;
	System.out.println(s1 +" : " +s1.getCode());
	System.out.println(s2 +" : " +s2.getCode());
	if(s1  == Status.SUCCESS) {
		System.out.println("The Response is Sucessfull !");
	}
	else {
		System.out.println("The Response is Failed !");
	}
}
}
