import java.util.Scanner;
public class Bank {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){

        double balance = 0;
        boolean isRunning = true;
        int choice;
    
        while(isRunning){
            System.out.println("\n-----Banking program-----\n");
            System.out.println("1.Balance");
            System.out.println("2.Deposit");
            System.out.println("3.Withdraw");
            System.out.println("4.Exit");
            System.out.print("\nEnter choice 1 - 4 : ");
            choice = sc.nextInt();
            switch (choice) {
                case 1 -> showBalance(balance);
                case 2 -> balance += moneyDeposit();
                case 3 -> {balance -= moneyWithdraw(balance);
                System.out.println("Available balance : "+balance);}
                case 4 -> isRunning = false;
                default -> System.out.println("Invalid operator");
        }
    }
    }
    static void showBalance(double balance){
        System.out.printf("\nBalance : %.2f\n",balance);
    }
    static double moneyDeposit(){
        System.out.print("Enter ammount to deposit : ");
        double ammount = sc.nextDouble();
        if (ammount<0){
            System.out.println("Negative number");
            return 0;
        }
        else{
            return ammount;
        }
    }
    static double moneyWithdraw(double balance){
        System.out.print("Enter ammount to Withdraw : ");
        double ammount = sc.nextDouble();
        if (ammount>balance){
            System.out.println("Insuffcient balance");
            return 0;
        }
        else{
            return ammount;
        }
    }
}
