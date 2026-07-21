import java.util.Scanner;
public class AdmissionForm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float percentage;
        boolean Entrance_qualified,Document_verified;
        System.out.println("Enter your percentage : ");
        percentage=sc.nextFloat();
        if (percentage>=60){
            System.out.println("Entrance qualified (True/False) : ");
            Entrance_qualified=sc.nextBoolean();
            if (Entrance_qualified){
                System.out.println("Documents verified (True/False) : ");
                Document_verified=sc.nextBoolean();
                if (Document_verified){
                    System.out.println("Admission confirmed");
                }
                else{
                    System.out.println("Documents pending");
                }
            }
            else{
                System.out.println("Entrance not qualified");
            }
        }
        else{
            System.out.println("Not eligible");
        }
        sc.close();
    }   
}
