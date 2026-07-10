import java.util.Scanner;
public class Rectanglecalc{
    public static void main(String[] args) {
        double length=0;
        double breadth=0;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter length : ");
        length=sc.nextDouble();
        System.out.print("Enter Breadth : ");
        breadth=sc.nextDouble();
        System.out.println("Area of rectangle : "+length*breadth+"cm");
        System.out.println("Perimeter of rectangle : "+2*(length+breadth));
    }
}
