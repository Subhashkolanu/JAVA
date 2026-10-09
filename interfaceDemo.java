//Implements is used to inherits the properties or methods of Interface
interface Animal{
    void makeSound();
    void food();
}
class Dog implements Animal{
    //public should be mentioned along with returntype when overriding
    public void makeSound(){ 
        System.out.println("Dog BARKS!");
    }
    public void food(){
        System.out.println("Dog eats Bones");
    } 
}
class Cat implements Animal{
    public void makeSound(){
        System.out.println("Cat Meow!");
    }
    public void food(){
        System.out.println("Cat drinks Milk");
    }
}
public class interfaceDemo{
    public static void main(String[] args){
        Dog dog = new Dog();
        dog.makeSound();
        dog.food();
        Cat cat = new Cat();
        cat.makeSound();
        cat.food();
    }
}