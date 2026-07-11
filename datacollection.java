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
    System.out.print("Enter discipline/branch : ");
    discipline=scanner.nextLine();
    System.out.println("Verify your details ");
    System.out.println("Name : "+name);
    System.out.println("Age : " +age);
    System.out.println("CGPA : "+cgpa);
    System.out.println("College : "+college);
    System.out.println("Branch : "+discipline);
    System.out.print("College : "+college);
    scanner.close();
    }
}

