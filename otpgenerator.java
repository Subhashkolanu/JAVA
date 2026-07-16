import java.util.Random;
public class otpgenerator{
    public static void main(String[] args){
        Random rd = new Random();
        int otp = rd.nextInt(1000,9999);
        System.out.println("Generated otp : "+otp);
    }
}
