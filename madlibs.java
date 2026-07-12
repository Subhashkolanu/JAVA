import java.util.Scanner;
public class madlibs{
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        String job;
        String verb;
        String name;
        System.out.print("Enter the job name : ");
        job=scanner.nextLine();
        System.out.print("Enter the action word : ");
        verb=scanner.nextLine();
        System.out.print("Enter the name : ");
        name=scanner.nextLine();
        System.out.println("\n Here is the conversation : \n");
        System.out.println("Who are you ? ");
        System.out.println("You all know me.");
        System.out.println("I am the "+job+"!");
        System.out.println("I am the man who "+verb+" Gus fring.");
        System.out.println("Say my name");
        System.out.println("you're "+name);
        System.out.println("You're goddamn right!");
        scanner.close();

    }
}