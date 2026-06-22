package day18.ExceptionHandling;
public class ProductOutOfStockException extends Exception{
public ProductOutOfStockException(String message) {
	super(message);
}
}