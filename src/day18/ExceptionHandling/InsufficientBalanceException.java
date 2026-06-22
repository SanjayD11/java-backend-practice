package day18.ExceptionHandling;
public class InsufficientBalanceException extends Exception{
	public InsufficientBalanceException(String m) {
		super(m);
	}
}