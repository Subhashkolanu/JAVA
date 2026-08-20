import java.util.Scanner;
public class terinary_age {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter age : ");
        int age = s.nextInt();
        System.out.println((age >= 18) ? "True": "False");
        s.close();
    }
}
