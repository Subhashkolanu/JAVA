import java.util.Scanner;
public class ifelse1{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        //Positive number checker:
        int number;
        System.out.print("Enter a number : ");
        number=sc.nextInt();
        if (number>=0){
            System.out.println("Positive number");
        }
        else{
            System.out.println("Negative number");
        }
    }
}