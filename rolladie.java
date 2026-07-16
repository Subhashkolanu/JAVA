import java.util.Random;
public class rolladie {
    public static void main(String[] args){
        Random rd = new Random();
        int roll = rd.nextInt(6);
        System.out.println("Rolling dice.....");
        System.out.println("Rolled : "+roll);
    }
}
