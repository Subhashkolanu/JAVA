import java.util.Scanner;
public class EmailVerification {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String mail;
        System.out.print("Enter mail address : ");
        mail=sc.nextLine();
        if(mail.contains("@")){
            System.out.println("Username : "+mail.substring(0,mail.indexOf("@")));
            System.out.println("Domain : "+mail.substring(mail.indexOf("@")+1));
        }
        else{
            System.out.println("Invalid email");
        }
        sc.close();

    }
}
