import java.util.Scanner;
class BankAccount{
    Long AccNo;
    String CustName;
    double balance,minBal;
    void read(){
        Scanner sc = new Scanner(System.in);
        System.out.print("User ID : ");
        CustName=sc.nextLine();
        System.out.print("Enter Account number : ");
        AccNo=sc.nextLong();
        System.out.print("Enter Balance : ");
        balance=sc.nextDouble();
        minBal=2000.00;
        sc.close();
    }
    void display(){
        System.out.println("\n------Profile------");
        System.out.println("\nAccount Holder : "+CustName+"\nAccount no : "+AccNo);
        if (balance<minBal)
            System.out.println("Insuffient balance : "+balance);
        else
            System.out.println("Balance : "+balance);
    }
}
public class BankAccountDemo{
    public static void main(String[] args){
        BankAccount b = new BankAccount();
        b.read();
        b.display();
    }
}