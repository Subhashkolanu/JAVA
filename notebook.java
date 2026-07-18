import java.util.Random;
public class notebook {
    public static void main(String[] args){
        //testing random
        /*Random random = new Random();
        int n = random.nextInt(10)+1;
        System.out.println(n);*/
        //testing printf statements
        /*String name = "Subhash";
        int age = 18;
        double cgpa = 7.13;
        boolean isstudent=true;
        char currency='$';
        System.out.printf("User name : %s\n",name);
        System.out.printf("Age : %d\n",age);
        System.out.printf("cgpa : %.4f\n",cgpa);
        System.out.printf("Student : %b\n",isstudent);
        System.out.printf("currency : %c\n",currency);*/
        
        /*double price1=859626.25;
        double price2=486668.59;
        double price3=-78316.32;
        System.out.printf("% .3f\n",price1);
        System.out.printf("% .3f\n",price2);
        System.out.printf("% .3f\n",price3);*/

        int id1=1;
        int id2=23;
        int id3=456;
        int id4=7890;

        System.out.printf("%04d\n",id1);
        System.out.printf("%04d\n",id2);
        System.out.printf("%04d\n",id3);
        System.out.printf("%04d\n",id4);

        System.out.printf("%4d\n",id1);
        System.out.printf("%4d\n",id2);
        System.out.printf("%4d\n",id3);
        System.out.printf("%4d\n",id4);

        System.out.printf("%-4d\n",id1);
        System.out.printf("%-4d\n",id2);
        System.out.printf("%-4d\n",id3);
        System.out.printf("%-4d\n",id4);

        
    }
    
}
