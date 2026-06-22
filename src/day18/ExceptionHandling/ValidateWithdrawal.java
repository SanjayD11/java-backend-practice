package day18.ExceptionHandling;
public class ValidateWithdrawal{
public  static void validateAmount(int amount, int balance) throws InsufficientBalanceException{
	if(amount > balance) {
		throw new InsufficientBalanceException("The Withdrawal amount is not valid (Exceeds the current Balance");
	}
	else {
		System.out.println("The Withdrawal Amount is Valid");
		System.out.println("Your Witdrawn amount is "+amount+" and the Balance is "+ (balance-amount));	
		}
}
}