import java.util.Scanner;

class Search {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] marks = {75, 82, 61, 90, 55, 73, 88, 69, 95, 40};

        int search = sc.nextInt();

        boolean found = false;

        for (int i = 0; i < marks.length; i++) {

            if (search==marks[i]) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("Found");
        }
        else {
            System.out.println("Not Found");
        }
    }
}