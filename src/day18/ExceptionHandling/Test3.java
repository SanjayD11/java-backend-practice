package day18.ExceptionHandling;
public class Test3 {
public static void main(String[] args) {
	try {
		ValidateStocks.checkAvailabilty("IPhone 17 Pro Max", 0);
	}catch(ProductOutOfStockException pe) {
		System.out.println(pe);
	}
}
}