
import java.util.Scanner;

public class StudentMarks12{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] marks = {85, 90, 78, 88, 95};

        System.out.print("Enter student position (0-4): ");
        int position = sc.nextInt();

        try {
            System.out.println(marks[position]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid student position!");
        }

        sc.close();
    }
}
