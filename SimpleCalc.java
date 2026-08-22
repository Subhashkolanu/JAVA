import java.util.Scanner;

public class SimpleCalc {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        System.out.print("A: ");
        int a = read.nextInt();

        System.out.print("B: ");
        int b = read.nextInt();

        int sum = a + b;
        int diff = a - b;

        System.out.println("Sum is: " + sum);
        System.out.println("Difference is: " + diff);

        read.close();
    }
}