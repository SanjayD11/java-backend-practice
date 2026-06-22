package day21.generics;

public class Calculator<T extends Number> {

    T num1;
    T num2;

    Calculator(T num1, T num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    void sum() {
        double result = num1.doubleValue() + num2.doubleValue();
        System.out.println("The sum is : " + result);
    }

}