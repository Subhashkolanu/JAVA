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
            System.out.println("Child class constructor");
        }
        void display(){
            System.out.println("UID : "+uid);
            System.out.println("Name : "+pname);
            System.out.println("Occupation : "+occupation);
        }
}
public class singleInheritance{
    public static void main(String [] args){
        Employee emp = new Employee("Software Engineer");
        emp.display();
    }
}