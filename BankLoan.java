import java.util.Scanner;
public class BankLoan{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int age,salary,cibil;
    System.out.print("Enter age : ");
    age=sc.nextInt();
    if (age>=21){
        System.out.print("Enter salary : ");
        salary=sc.nextInt();
        if (salary>=30000){
            System.out.print("Enter cibil : ");
            cibil=sc.nextInt();
            if (cibil>=750){
                System.out.println("Loan approved!");
            }
            else{
                System.out.println("Low cibil score");
            }
        }
        else{
            System.out.println("Insufficient salary");
        }
    }
    else{
        System.out.println("Age not eligible");
    }
    sc.close();
    }
}