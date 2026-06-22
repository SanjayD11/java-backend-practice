package day18.ExceptionHandling;

public class Test {
public static void main(String[] args) {
	try {
		ValidateWithdrawal.validateAmount(1000, 10000);
	}
	catch( InsufficientBalanceException e) {
		System.out.println(e);
	}
}
}
