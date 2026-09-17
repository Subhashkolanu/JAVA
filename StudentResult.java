import java.util.Scanner;

class StudentResult {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[][] marks = new int[10][5];

        // Input
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 5; j++) {
                marks[i][j] = sc.nextInt();
            }
        }

        int topper = 0;
        int highestTotal = 0;

        // Process each student
        for (int i = 0; i < 10; i++) {

            int total = 0;
            boolean pass = true;

            for (int j = 0; j < 5; j++) {

                total = total+marks[i][j];

                if (marks[i][j]<40) {
                    pass = false;
                }
            }

            double average = total/5.0;

            if (total>highestTotal) {
                highestTotal = total;
                topper = i;
            }

            System.out.println("Student " + (i + 1));
            System.out.println("Total = " + total);
            System.out.println("Average = " + average);

            if (pass) {
                System.out.println("Pass");
            }
            else {
                System.out.println("Fail");
            }
        }

        System.out.println("Topper = Student " + (topper + 1));
        System.out.println("Highest Total = " + highestTotal);
    }
}