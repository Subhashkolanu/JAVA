import java.util.Random;
import java.util.Scanner;
public class rockpaperscissor {
    public static void main(String[] args){
        Random rd=new Random();
        Scanner sc=new Scanner(System.in);
        int computer = rd.nextInt();
        int player;
        System.out.print("Enter your choice 1. Rock 2. Paper 3. Scissors");
        player = sc.nextInt();
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
        else{
            System.out.println("Ties");
        }
    }
}
