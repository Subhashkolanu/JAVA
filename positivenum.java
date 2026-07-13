import java.util.Scanner;
public class positivenum{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        //Positive number checker:
        int number;
        System.out.print("Enter a number : ");
        number=sc.nextInt();
        if (number>0){
            System.out.println("Positive number");
        }
        else if(number==0){
            System.out.println("0 is the number");
        }
        else{
            System.out.println("Negative number");
        }
        sc.close();
    }
}
