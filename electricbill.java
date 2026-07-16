import java.util.Scanner;
public class electricbill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String cname; int units,price;
        System.out.println("Enter customer name : ");
        cname = sc.nextLine();
        System.out.println("Enter no of units consumed : ");
        units = sc.nextInt();
        if (units>=0 && units<=100){
            price=units*5;
        }
        else if (units>100 && units<=200){
            price=units*7;
        }
        else{
            price=units*10;
        }
        System.out.println("Customer name : "+cname);
        System.out.println("Units : "+units);
        System.out.println("Price : "+price);
        sc.close();
    }
}
