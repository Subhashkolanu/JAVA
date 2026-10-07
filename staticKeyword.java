//Static can be initilized in 8 different places
class Account {
    int accNo;
    String Cname;
    double balance;
    static double minBal = 2500.00; // static variable 
    public Account(int x,String y,double z){
        accNo=x;
        Cname=y;
        balance=z;
    }
    static void changeMinBal(double x){ //static method
        minBal+=x;
    }
    void display(){
        System.out.println("Customer name : "+Cname);
        System.out.println("Account No : "+accNo);
        System.out.println("Available balance : "+balance);
        System.out.println("Minimum Balance : "+minBal);
    }
}
public class staticKeyword{
    public static void main(String[] args) {
        Account ac = new Account(555, "Subhash", 10000);
        System.out.println("Before updation");
        ac.display();
        Account.changeMinBal(500.00); // Call by Class name not by object name
        System.out.println("After updation");
        ac.display();
    }
}