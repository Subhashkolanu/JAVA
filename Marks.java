import java.util.Scanner;
class Marks {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] marks = new int[20];

        // Input
        for (int i = 0; i < marks.length; i++) {
            marks[i] = sc.nextInt();
        }

        int highest = marks[0];
        int lowest = marks[0];

        // Find highest and lowest
        for (int i = 1; i < 20; i++) {

            if (marks[i]>highest) {
                highest = marks[i];
            }

            if (marks[i]<lowest) {
                lowest = marks[i];
            }
        }

        System.out.println("Highest = " + highest);
        System.out.println("Lowest = " + lowest);
    }
}