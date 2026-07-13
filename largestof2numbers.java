import java.util.Scanner;
public class largestof2numbers{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
    //Largest of two numbers
    int a;
    int b;
    System.out.print("Enter value for a : ");
    a=sc.nextInt();
    System.out.print("Enter value for b : ");
    b=sc.nextInt();
    if(a>b){
        System.out.println("Value A is greater than Value of B");
    }
    else if (a==b){
        System.out.println("Both are equal");
    }
    else{
        System.out.println("Value of B is greater than Value A");
    }

    sc.close();
    }
}