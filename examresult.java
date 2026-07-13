import java.util.Scanner;
public class examresult{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

    //Pass or fail calculator
    int marks;
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
    }
    sc.close();
}
    
}
