import java.util.Scanner;
public class Circlecal{
    public static void main(String[] args){
        double pi=3.1416;
        double radius=0;
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter radius : ");
        radius=scanner.nextDouble();
        System.out.println("Area of circle : "+pi*radius*radius);
        System.out.println("Circumference of circle : "+2*pi*radius);
        System.out.println("Diameter : "+2*radius);
        scanner.close();
    }
}