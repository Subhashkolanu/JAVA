import java.util.Scanner;
public class currencyconverter{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        double rupees=0;        
        System.out.print("Enter the amount in rupees : ");
        rupees=sc.nextInt();
        double usd = rupees / 95.53;
        double eur = rupees / 108.92;
        double jpy = rupees / 0.59;
        double gbp = rupees / 128.03;
        double aed = rupees / 25.97;
        System.out.println("Exchange rate");
        System.out.printf("USD : %.2f%n",usd);
        System.out.printf("YEN : %.2f%n",jpy);
        System.out.printf("EURO : %.2f%n",eur);
        System.out.printf("DIRHAM : %.2f%n",aed);
        System.out.printf("POUND : %.2f%n",gbp); 
    }
}