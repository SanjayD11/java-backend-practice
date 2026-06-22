package day21.generics;
public class TestMain2 {
public static void main(String[] args) {
	Calculator<Integer> i = new Calculator<>(10,20);
	Calculator<Double> d = new Calculator<>(10.5,20.5);

	i.sum();
	d.sum();
	
}
}


