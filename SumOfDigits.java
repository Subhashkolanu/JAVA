import java.util.*;
public class SumOfDigits {
    public static void main(String[] args){
        int n,r,sum=0,a;
        Scanner read = new Scanner(System.in);
        System.out.print("Enter a positive integer : ");
        n=read.nextInt();
        a=n;
        while(n>0){
            r=n%10;
            sum=sum+r;
            n=n/10;
        }
        System.out.println("Sum of digits : "+sum);
        read.close();
    }
}
