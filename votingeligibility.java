import java.util.Scanner;
public class votingeligibility {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
    //Voting eligibility test
       int age;
       System.out.print("Enter age : ");
       age=sc.nextInt();
       if (age>=18){
        System.out.println("Eligible for voting!");
       }
       else{
        System.out.println("Not eligible for voting");
       }
    sc.close();
    }
}
