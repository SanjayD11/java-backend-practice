package day18.ExceptionHandling;
public class ValidateStocks {
public static void checkAvailabilty(String productName, int stockCount) throws ProductOutOfStockException{
	if(stockCount <= 0) {
		throw new ProductOutOfStockException(productName+" is not Available right now !");
	}
	else {
		System.out.println(productName+" is available for purchase !");
	}
}

}
