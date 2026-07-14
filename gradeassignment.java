import java.util.Scanner;
public class gradeassignment {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int marks;
        System.out.print("Enter marks (Max:100) : ");
        marks=sc.nextInt();
        if (marks>75){
            System.out.println("Grade A");
        }
        else if (marks > 65 & marks < 75){
            System.out.println("Grade B");
        }
        else if (marks > 55 & marks < 65){
            System.out.println("Grade C");
        }
        else if(marks > 45 & marks < 55){
            System.out.println("Grade D");
        }
        else if (marks > 35 & marks < 45){
            System.out.println("Grade E");
        }
        else{
            System.out.println("Failed");
        }
        sc.close();
    }    
}
