import packageDemo.Box;
public class userdefinedPackageDemo {
    void main(){
        Box b1 = new Box (10,20,30);
        b1.display();
        System.out.println("Volume of Box : "+b1.volume());
    } 
}
