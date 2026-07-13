import java.util.Scanner;
public class Shopping{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String item;
        int quantity;
        double price;
        double total;
        char currency='$';
        System.out.print("Enter product name : ");
        item=sc.nextLine();
        System.out.print("Enter quantity : ");
        quantity=sc.nextInt();
        System.out.print("Enter price : ");
        price=sc.nextDouble();
        total=quantity*price;
        System.out.println("\n----- Bill summary -----\n");
        System.out.println("Item name : "+item);
        System.out.println("Quantity : "+quantity);
        System.out.println("Price : "+price);
        System.out.println("Total : "+currency+total);
    sc.close();
    }

}