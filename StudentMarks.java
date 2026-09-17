import java.util.Scanner;

class StudentMarks {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Create array for 10 students
        int[] marks = new int[10];

        // Input marks
        for (int i = 0; i < 10; i++) {
            marks[i] = sc.nextInt();
        }

        // Assume first mark is highest and lowest
        int highest = marks[0];
        int lowest = marks[0];

        // Find highest and lowest
        for (int i = 1; i < 10; i++) {

            if (marks[i]>highest) {
                highest = marks[i];
            }

            if (marks[i]<lowest) {
                lowest = marks[i];
            }
        }

        // Calculate total
        int total = 0;

        for (int i = 0; i < 10; i++) {
            total = total+marks[i];
        }

        // Calculate average
        double average = total/10.0;


        // Display results
        System.out.println("Highest = " + highest);
        System.out.println("Lowest = " + lowest);
        System.out.println("Average = " + average);
    }
}