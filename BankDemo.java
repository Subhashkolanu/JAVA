
class BankAc {
    private double balance;

    public BankAc(double initialBalance) {
        this.balance = initialBalance;
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException(
                "Withdrawal amount must be positive."
            );
        }

        if (amount > balance) {
            throw new ArithmeticException(
                "Withdrawal failed: Insufficient balance. Available balance is $" + balance
            );
        }

        balance -= amount;
        System.out.println("Successfully withdrew $" + amount
                + ". New balance: $" + balance);
    }
}

public class BankDemo {
    public static void main(String[] args) {
        BankAc account = new BankAc(1000.0);

        try {
            account.withdraw(500.0);
            account.withdraw(800.0);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
