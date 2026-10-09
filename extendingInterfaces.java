interface payment{
    void pay(double amount);
}
interface UPI extends payment{
    void verifyUPI();
}
interface card extends payment{
    void validateCard();
}
interface netBanking{
    void validateNetBanking();
}
class GooglePay implements UPI{
    public void pay(double amt){
        System.out.println("Payment : $"+amt+" recieved");
    }
    public void verifyUPI(){
        System.out.println("Verified succesfully!");
    }
}
class visa implements card{
    public void pay(double amt){
        System.out.println("Payment : $"+amt+" recieved");
    }
    public void validateCard(){
        System.out.println("Validated succesfully!");
    }
}
class RazorPay implements netBanking{
    public void pay(double amt){
        System.out.println("Payment : $"+amt+" recieved");
    }
    public void validateNetBanking(){
        System.out.println("Validated succesfully!");
    }
}
public class extendingInterfaces{
    public static void main(String[] args){
        /*GooglePay g = new GooglePay();
        g.pay(2500.00);
        g.verifyUPI();*/
        /*visa c = new visa();
        c.pay(2500.00);
        c.validateCard();*/
        RazorPay nb = new RazorPay();
        nb.pay(2500.00);
        nb.validateNetBanking();
    }
}
