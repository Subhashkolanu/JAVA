import java.util.Scanner;
public class typeodoperators {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int x;
        int y;
        System.out.print("Assign value for X : ");
        x=sc.nextInt();
        System.out.print("Assign value for Y : ");
        y=sc.nextInt();
        //Arthimetic operators
        int a=x+y;
        int s=x-y;
        int m=x*y;
        int d=x/y;
        int modulus=x%y;
        System.out.println("Addition : "+a);
        System.out.println("Subtraction : "+s);
        System.out.println("Multiplication : "+m);
        System.out.println("Division : "+d);
        System.out.println("Modulus : "+modulus);
        //Augumented assignment operators
        a+=x;
        s-=x;
        m*=x;
        d/=x;
        m%=x;
        System.out.println("Augumented Addition : "+a);
        System.out.println("Augumented Subtraction : "+s);
        System.out.println("Augumented Multiplication : "+m);
        System.out.println("Augumented Division : "+d);
        System.out.println("Augumented Modulus : "+modulus);
        //Increment operators
        x++; //x increment
        System.out.println("X Increment : "+x);
        y++; //y increment
        System.out.println("Y Increment : "+y);
        x--; //x decrement
        System.out.println("X Decrement : "+x);
        y--; //y decrement
        System.out.println("Y Decrement : "+y);
    sc.close();
    }
}
