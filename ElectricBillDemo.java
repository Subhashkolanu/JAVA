import java.util.Scanner;
class ElectricBill{
    String name;
    int units;
    long cid;
    void read(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter consumer name : ");
        name = sc.nextLine();
        System.out.print("Consumer id : ");
        cid = sc.nextLong();
        System.out.print("Units consumed : ");
        units = sc.nextInt();
        sc.close();
    }
    void display(){
        System.out.println("\n-----ELECTRIC BILL-----");
        System.out.println("\nCustomer : "+name+"\nConsumer id : "+cid+"\nUnits : "+units+"\nBill : "+(units*5));
    }
}
public class ElectricBillDemo {
    public static void main(String[] args){
        ElectricBill c = new ElectricBill();
        c.read();
        c.display();
    }
    
}
