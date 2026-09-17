import java.util.Scanner;

class Performance {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] marks = new int[n];

        // Input
        for (int i = 0; i < marks.length; i++) {
            marks[i] = sc.nextInt();
        }

        // Calculate total
        int total = 0;

        for (int i = 0; i < marks.length; i++) {
            total = total+marks[i];
        }

        double average = total/ (double)n;

        // Count passed + find highest
        int passed = 0;
        int highest = 0;

        for (int i = 0; i < marks.length; i++) {

            if (marks[i]>=40) {
                passed++;
            }

            if (marks[i]>highest) {
                highest = marks[i];
            }
        }

        // Count above average
        int aboveAverage = 0;

        for (int i = 0; i < marks.length; i++) {
            if (average<marks[i]) {
                aboveAverage++;
            }
        }

        System.out.println("Average = " + average);
        System.out.println("Passed = " + passed);
        System.out.println("Highest = " + highest);
        System.out.println("Above Average = " + aboveAverage);
    }
}