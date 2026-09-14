import java.util.Scanner;
public class ArrayInit{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int size;
        System.out.print("Enter size of array : ");
        size = sc.nextInt();
        int a[] = new int[size];
        for(int i = 0 ;i<size;i++){
            a[i]=sc.nextInt();
        }
        sc.close();
    }
}