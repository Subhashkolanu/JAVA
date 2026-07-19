import java.util.Scanner;
public class compoundinterest {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double principal;
        double ammount;
        double rate;
        int time;
        System.out.print("Enter principal ammount : ");
        principal = sc.nextDouble();
        System.out.print("Enter interest rate (%) : ");
        rate = sc.nextDouble()/100;
        System.out.print("Enter time (years) : " );
        time = sc.nextInt();
        ammount=principal*Math.pow(1+rate,time);
        System.out.printf("Ammount : %.2f\n",ammount);
        double compound = ammount-principal;
        System.out.printf("Compound interest : %.2f",compound);
        sc.close();
    }
}
