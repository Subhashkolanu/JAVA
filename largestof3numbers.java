import java.util.Scanner;
public class largestof3numbers {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a,b,c;
        System.out.print("Enter a value (A) : ");
        a=sc.nextInt();
        System.out.print("Enter a value (B) : ");
        b=sc.nextInt();
        System.out.print("Enter a value (C) : ");
        c=sc.nextInt();
        
        if(a>b & a>c){
            System.out.println(a+" is the largest among "+b+","+c);
        }
        else if (b>a & b>c){
            System.out.println(b+" is the largest among "+a+","+c);
        }
        else{
            System.out.println(c+" is the largest among "+a+","+b);
        }
        sc.close();
    }
}
