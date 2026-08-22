import java.util.Scanner;
public class SimpleCalc
{
	public static void main (String[] args)
	{
		// Update the blank in the code below
		Scanner read = new Scanner(System.in);
		int a = read.nextInt();
		int b = read.nextInt() ;
		int sum = a+b;
		int diff = a-b;
		System.out.println("Sum is: " + sum);
		System.out.println("Difference is: " + diff);
        read.close();
	}
}