//javac *d . Box.java
//Package statement should be first line of program if package exist
package packageDemo;
public class Box{
    int length,breadth,height;
    public Box(int x,int y,int z){
        length = x;
        breadth = y;
        height = z;
    }
    public void display(){
        System.out.println("Length : "+length);
        System.out.println("Breadth : "+breadth);
        System.out.println("Height : "+height);
    }
    public long volume(){
        return length*breadth*height;
    }
}