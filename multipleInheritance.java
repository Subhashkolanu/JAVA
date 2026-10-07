class Person{
    int uid;
    String pname;
    public Person(){
       this(2337133,"Subhash");
    }
    public Person(int x , String y){
        System.out.println("Parent class constructor");
         uid = x;
        pname = y;
    }
}
class Employee extends Person {
        String occupation;
        public Employee (String occup){
            occupation = occup;
            System.out.println("Intermediate class constructor");
        }
 }
class salariedEmployee extends Employee{
    double salary;
    public salariedEmployee(String occupation,double x){
        super(occupation);
        salary = x;
        System.out.println("Child class constructor");
    }
    void display(){
        System.out.println("UID : "+uid);
        System.out.println("Name : "+pname);
        System.out.println("Occupation : "+occupation);
        System.out.println("Salary : "+salary);
    }
}
public class multipleInheritance{
    public static void main(String [] args){
        salariedEmployee emp = new salariedEmployee("Software Engineer",10000.0);
        emp.display();
    }
}