import java.util.Scanner;
public abstract class datacollection {
    public static void main(String[] args){
    String name;
    int age;
    String college;
    float cgpa;
    String discipline;
    Scanner scanner=new Scanner(System.in);
    System.out.print("Enter name : ");
    name=scanner.nextLine();
    System.out.print("Enter age : ");
    age=scanner.nextInt();
    System.out.print("Enter cgpa : ");
    cgpa=scanner.nextFloat();
    scanner.nextLine();
    System.out.print("Enter college : ");
    college=scanner.nextLine();
    /*System.out.println("Enter discipline/branch : ");
    discipline=scanner.nextLine(); */
    System.out.print("College : "+college);
    scanner.close();
    }
}

