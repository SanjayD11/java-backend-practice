package day18.ExceptionHandling;
public class Test2 {
public static void main(String[] args) {
	try {
		ValidatePassword.checkPassword("1234567");
	}
	catch(WeakPasswordException e) {
		System.out.println(e);
	}
}
}
