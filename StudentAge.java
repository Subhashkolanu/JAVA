
import java.util.Scanner;

public class StudentAge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter student age: ");
        int age = sc.nextInt();

        try {
            if (age < 17 || age > 30) {
                throw new IllegalArgumentException(
                    "Invalid age! Age must be between 17 and 30."
                );
            }

            System.out.println("Registration successful.");

        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        sc.close();
    }
}
