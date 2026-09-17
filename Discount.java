import java.util.Scanner;

class Discount {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double amount = sc.nextDouble();
        boolean premium = sc.nextBoolean();

        double discount;

        if (amount>=10000.0) {
            discount = amount/5.0;
        }
        else if (amount>=5000.0) {
            discount = amount/10.0;
        }
        else {
            discount = amount/5.0;
        }

        if (premium) {
            discount = discount + amount/20.0;
        }

        double finalAmount = amount-discount;

        System.out.println("Discount = " + discount);
        System.out.println("Final Amount = " + finalAmount);
    }
}