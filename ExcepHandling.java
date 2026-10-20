/* 2025dcsbt10448 - write a java programme to demo exceptional handling */

public class ExcepHandling
{
	public static void main(String[] args)
{
	int a[]={30,10,20,40,50};
	try{
		System.out.print(a[6]);
	}
	catch (ArrayIndexOutOfBoundsException aie)
	{
		aie.printStackTrace();
	}
}
}