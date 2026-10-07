abstract class shape{
    abstract void area();
}
class circle extends shape{
    double radius;
    public circle(double r){
        radius=r;
    }
    public void area(){
        double ar = Math.PI*(radius*radius);
        System.out.println("Area of circle : "+ar);
    }
}
public class abstractClasses{
    public static void main(String[] args){
        shape s = new circle(5.0);
        s.area();
    }
}