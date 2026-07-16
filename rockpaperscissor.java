import java.util.Random;
import java.util.Scanner;
public class rockpaperscissor {
    public static void main(String[] args){
        Random rd=new Random();
        Scanner sc=new Scanner(System.in);
        int computer = rd.nextInt(1,4);
        int player;
        System.out.print("Enter your choice 1. Rock 2. Paper 3. Scissors ");
        player = sc.nextInt();
        if (player == 1){
            System.out.println("Player choice : Rock");
        }
        else if (player == 2){
            System.out.println("Player choice : Paper");
        }
        else if (player ==3){
            System.out.println("Player choice : Scissors");
        }
        else{
            System.out.println("Invalid choices");
        }
        if (computer == 1){
            System.out.println("Computer choice : Rock");
        }
        else if (computer == 2){
            System.out.println("Computer choice : Paper");
        }
        else if (player == 3){
            System.out.println("Computer choice : Scissors");
        }
        else{
            System.out.println("Invalid choices");
        }
        if (computer==1 && player ==1){
            System.out.println("Tie");
        }
        else if (computer==1 && player == 2){
            System.out.println("Player wins!");
        }
        else if (computer ==1 && player == 3){
            System.out.println("Computer wins!");
        }
        else if (computer == 2 && player == 1){
            System.out.println("Computer wins!");
        }
        else if (computer == 2 && player == 2){
            System.out.println("Tie");
        }
        else if (computer == 2 && player == 3 ){
            System.out.println("player wins");
        }
        else if (computer == 3 && player == 1){
            System.out.println("Player wins!");
        }
        else if (computer == 3 && player == 2){
            System.out.println("Computer wins");
        }
        else if (computer == 3 && player == 3 ){
            System.out.println("Ties");
        }
        else{
            System.out.println("Invalid choices");
        }
        sc.close();
    }
}
