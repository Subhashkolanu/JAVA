
import java.util.Scanner;
public class Scholarship {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float percentage,attendance;
        int income;
        System.out.println("Enter percentage : ");
        percentage=sc.nextFloat();
        if (percentage>=85){
            System.out.println("Enter annual income : ");
            income=sc.nextInt();
            if (income<=300000){
                System.out.println("Enter attendance :");
                attendance=sc.nextFloat();
                if (attendance>=75){
                    System.out.println("Scholoarship approved");
                }
                else{
                    System.out.println("");
                }
            }

        }
    }
}
