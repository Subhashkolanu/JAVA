import java.util.Scanner;
class Employee{
    String name;
    long emp_id;
    int salary;
    void read(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Name : ");
        name = sc.nextLine();
        System.out.print("Enter Employee id : ");
        emp_id=sc.nextLong();
        System.out.print("Enter salary : ");
        salary=sc.nextInt();
        sc.close();
    }
    void display(){
        System.out.println("\n-----EMPLOYEE PAYSLIP-----");
        System.out.println("\nName : "+name+"\nEmployee ID : "+emp_id+"\nSalary : "+salary);
    }
}
public class EmployeeDemo{
    public static void main(String[] args){
        Employee e = new Employee();
        e.read();
        e.display();
    }
}