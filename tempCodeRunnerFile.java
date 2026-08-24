import java.util.Scanner;
public class EvenorOddv2{
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        System.out.print("Enter integer : ");
        int num = read.nextInt();
        if ((num/2)*2 == num){
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }
        read.close();
    }
}