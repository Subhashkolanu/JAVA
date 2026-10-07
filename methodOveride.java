class Parent{
    void msg(){
        System.out.println("I am Batman!");
    }
}
class Child extends Parent{
    void msg(){
        System.out.println("I am IronMan!");
    }
}
public class methodOveride{
    public static void main (String[] args){
        Parent obj1 = new Parent();
        obj1.msg();
        Child obj2 = new Child();
        obj2.msg();
        //Method overiding
        Parent obj3 = new Child();
        obj3.msg();
    }
}