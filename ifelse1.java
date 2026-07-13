import java.util.Scanner;
public class ifelse1{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

    //Even or odd
      int num;
      System.out.print("Enter a number : ");
      num=sc.nextInt();
      if (num%2==0){
        System.out.println("Even number");
      }
      else{
        System.out.println("Odd number");
      }

    //Pass or fail calculator
    /*int marks;
    System.out.print("Enter marks (max=100) : ");
    marks=sc.nextInt();
    if (marks>=75){
        System.out.println("Distinction");
    }
    else if (marks>=35){
        System.out.println("Passed");
    }
    else{
        System.out.println("Failed");
    }*/

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