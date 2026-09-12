import java.util.Scanner;
class Student{
    String name;
    Long rno;
    int marks;
    void read(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Name : ");
        name=sc.nextLine();
        System.out.print("Enter Roll number : ");
        rno=sc.nextLong();
        System.out.print("Enter marks : ");
        marks=sc.nextInt();
        sc.close();
    }
    void display(){
        System.out.println("\n-----REPORT CARD-----");
        System.out.println("\nName : "+name+"\nRoll No : "+rno+"\nMarks : "+marks);
    }
}
public class StudentDemo{
    public static void main(String[] args){
        Student s = new Student();
        s.read();
        s.display();
    }
}