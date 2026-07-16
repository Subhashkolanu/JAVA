import java.util.Random;
public class random {
public static void main(String[] args){
    Random rd =  new Random();
    int n;
    double num;
    boolean isgood;
    n=rd.nextInt(); // Range from -2B to 2B
    System.out.println("Random integer : "+n);
    n=rd.nextInt(1,101); // Range from 1 to 100 (100 is inclusive)
    System.out.println("Random integer : "+n);
    num = rd.nextDouble();
    System.out.println("Random double : "+num);
    num = rd.nextDouble(1,101);
    System.out.println("Random double : "+num);
    isgood= rd.nextBoolean();
     System.out.println("Random boolean : "+isgood);



}

    
}
