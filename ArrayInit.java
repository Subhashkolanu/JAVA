import java.util.Scanner;
public class ArrayInit{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int size;
        System.out.print("Enter size of array : ");
        size = sc.nextInt();
        int a[] = new int[100];
        System.out.print("Enter elements of array : ");
        for(int i = 0 ;i<size;i++){
            a[i]=sc.nextInt();
        }
        System.out.print("Array : ");
        for(int i = 0;i<size;i++){
            System.out.print(a[i]+" ");
        }
       System.out.print("\nNew position : ");
       int NewPosition = sc.nextInt();
       System.out.print("New Element : ");
       int NewElement = sc.nextInt();
       for(int i=size;i>NewPosition;i--){
        a[i]=a[i-1];
       }
       a[NewPosition]=NewElement;
       size++;
       System.out.print("Updated Array : ");
        for(int i = 0;i<size;i++){
            System.out.print(a[i]+" ");
        }
        sc.close();
    }
}