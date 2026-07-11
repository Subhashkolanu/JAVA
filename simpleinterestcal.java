import java.util.Scanner;
public class simpleinterestcal {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int principle=0;
        float interest=0;
        float time=0;
        float simpleinterest=0;
        float total=0;
        System.out.print("Principle amount : ");
        principle=sc.nextInt();
        System.out.print("Interest : ");
        interest=sc.nextFloat();
        System.out.print("Time (MONTHS) : ");
        time=sc.nextFloat();
        simpleinterest=(principle*interest*time)/100;
        System.out.println("Simple interest : "+simpleinterest);
        total=simpleinterest+principle;
        System.out.println("Total amount : "+total);
        sc.close();
    }
}
