import java.util.Scanner;
import java.util.Random;
public class numberguessingv1 {
    public static void main(String[] args){
        Random rd = new Random();
        Scanner sc = new Scanner(System.in);
        int number = rd.nextInt(101);
        System.out.print("Enter a number : ");
        int guess = sc.nextInt();
        if (number == guess){
            System.out.println("correct guess");
        }
        else{
            System.out.println("OOPS! the number was : "+number);
        }
        /*else if (number>guess){
            System.out.println("Too ahead");
        }
        else if (number<guess){
            System.out.println("Too backward");
        }
        else{
            System.out.println("oops! generated number : "+number);
        }
        sc.close();*/
    }
}
