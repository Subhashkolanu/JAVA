import java.util.Scanner;
public class EvenorOddv3{
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        System.out.print("Enter integer : ");
        int num = read.nextInt();
        if ((num&1)==0){
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }
        read.close();
    }
}