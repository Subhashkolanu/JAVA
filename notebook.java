import java.util.Random;
public class notebook {
    public static void main(String[] args){
        //testing random
        /*Random random = new Random();
        int n = random.nextInt(10)+1;
        System.out.println(n);*/
        //testing printf statements
        String name = "Subhash";
        int age = 18;
        double cgpa = 7.13;
        boolean isstudent=true;
        char currency='$';
        System.out.printf("User name : %s\n",name);
        System.out.printf("Age : %d\n",age);
        System.out.printf("cgpa : %.4f\n",cgpa);
        System.out.printf("Student : %b\n",isstudent);
        System.out.printf("currency : %c\n",currency);

    }
    
}
