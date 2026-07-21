import java.util.Scanner;
public class AtmWithdrawal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int registered_pin=1234,pin,withdrawal_amt;
        float balance;
        System.out.print("Enter pin : ");
        pin=sc.nextInt();
        if (pin==registered_pin){
            System.out.print("Enter balance : ");
            balance=sc.nextFloat();
            System.out.print("Enter withdrawal ammount : ");
            withdrawal_amt=sc.nextInt();
            if (balance>=withdrawal_amt){
                System.out.println("Transaction successful");
            }
            else{
                System.out.println("Insufficient balance");
            }
        }
        else{
            System.out.println("Incorrect pin");
        }
    sc.close();
    }
}
