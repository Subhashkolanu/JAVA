import java.util.Scanner;
public class Hypotenuse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a,b,c;
        System.out.print("Enter the value of side A : ");
        a = sc.nextDouble();
        System.out.print("Enter the value of side B : ");
        b = sc.nextDouble();
        c=Math.sqrt(Math.pow(a,2)+Math.pow(b,2));
        System.out.printf("Hypotenuse : %.1f",c);
        sc.close();
    }
}
