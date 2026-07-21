import java.util.Scanner;
public class Scholarship {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float percentage,attendance;
        int income;
        System.out.print("Enter percentage : ");
        percentage=sc.nextFloat();
        if (percentage>=85){
            System.out.print("Enter annual income : ");
            income=sc.nextInt();
            if (income<=300000){
                System.out.print("Enter attendance :");
                attendance=sc.nextFloat();
                if (attendance>=75){
                    System.out.println("Scholoarship approved");
                }
                else{
                    System.out.println("Attendance too low");
                }
            }
            else{
                System.out.println("Income limit exceeded");
            }
        }
        else{
            System.out.println("Not eligible");
        }
        sc.close();
    }
}
