import java.util.Scanner;

class Attendance {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double attendance = sc.nextDouble();

        if (attendance>=75) {
            System.out.println("Eligible");
        }
        else {
            System.out.println("Not Eligible");
        }
    }
}