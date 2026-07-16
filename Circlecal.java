import java.util.Scanner;
public class CircleCal{
    public static void main(String[] args){
        //General methods
        double pi=3.1416;
        double radius;
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter radius : ");
        radius=scanner.nextDouble();
        System.out.println("Area of circle : "+pi*radius*radius);
        System.out.println("Circumference of circle : "+2*pi*radius);
        System.out.println("Diameter : "+2*radius);
        scanner.close();
        //Using Math methods
        double circumference = 2*Math.PI*radius;
        System.out.printf("Circumference : %.1f\n",circumference);

        double area = Math.PI*Math.pow(radius,2);
        System.out.printf("Area : %.1f\n",area);
        

    }
}