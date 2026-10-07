//Cannot change the values of constant 
//Cannot inherit for Classes
//Cannot MethodOveride for Methods
/*final class Parent{
    void msg(){
        System.out.println("I am Batman!");
    }
}
class Child extends Parent{
    void msg(){
        System.out.println("I am IronMan!");
    }
}*/
public class finalKeyword {
    public static void main(String[] args) {
        final int age = 76;
        final String Name = "Bharat";
        final String Gender = "BoY";
        System.out.println(Name+"\n"+age+"\n"+Gender);
        
    }
    
}
