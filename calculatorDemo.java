
import calculator.Arithmetic;

public class CalculatorDemo {
    public static void main(String[] args) {
        Arithmetic obj = new Arithmetic();

        System.out.println("Addition: " + obj.add(20, 5));
        System.out.println("Subtraction: " + obj.subtract(20, 5));
        System.out.println("Multiplication: " + obj.multiply(20, 5));
        System.out.println("Division: " + obj.divide(20, 5));
    }
}
