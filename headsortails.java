import java.util.Random;
public class headsortails{
    public static void main(String[] args){
        Random rd = new Random();
        int num = rd.nextInt(2);
        if (num==1){
            System.out.println("Heads");
        }
        else{
            System.out.println("Tails");
        }
    }
}