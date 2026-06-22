package day18.ExceptionHandling;
public class ValidatePassword {
public static void checkPassword(String password) throws WeakPasswordException{
	if(password.length()<8) {
		throw new WeakPasswordException("The Password is Weak (less than 8 characters) ! try a different password with min 8 characters");
	}
	else {
		System.out.println("The entered password is considerably Strong ! : "+password);
	}
}
}

