import java.util.Scanner;
public class Circlecal{
    public static void main(String[] args){
        double pi=3.14;
        double radius=0;
        double diameter=2*radius;
        double area=0;
        double circumference=0;
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter radius : ");
        radius=scanner.nextDouble();
        System.out.println("Area of circle : "+pi*radius*radius);
        System.out.println("Circumference of circle : "+2*pi*radius);
    }
}