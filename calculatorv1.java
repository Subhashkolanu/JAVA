import java.util.Scanner;
public class calculatorv1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b;
        char op;
        System.out.print("Enter a value : ");
        a=sc.nextInt();
        System.out.print("Enter a value : ");
        b=sc.nextInt();
        sc.nextLine();
        System.out.print("Choose an operator (+,-,*,/,%) : ");
        op = sc.next().charAt(0);
        if (op=='+'){
            System.out.println(a+" + "+b +" = " +(a+b));
        }
        else if (op=='-'){
            System.out.println(a+" - "+b +" = " +(a-b));
        }
        else if(op=='*'){
            System.out.println(a+" * "+b +" = " +(a*b));
        }
        else if(op=='/'){
            System.out.println(a+" / "+b +" = " +(a/b));
        }
        else{
            System.out.println(a+" % "+b +" = " +(a%b));
        }
        sc.close();
    }
}
