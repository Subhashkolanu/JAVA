import java.util.Scanner;

class StudentMarks2D {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[][] marks = new int[3][5];

        // Input
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                marks[i][j] = sc.nextInt();
            }
        }

        // Calculate each student's total and average
        for (int i = 0; i < 3; i++) {

            int total = 0;

            for (int j = 0; j < 5; j++) {
                total = total+marks[i][j];
            }

            double average = total/5.0;

            System.out.println("Student " + (i + 1));
            System.out.println("Total = " + total);
            System.out.println("Average = " + average);
        }
    }
}