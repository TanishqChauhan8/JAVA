import java.util.Scanner;

class j020
{
	public static void main(String ar[])
	{
		Scanner sc=new Scanner(System.in);
		double num[]=new double[5];
		int x[]=new int[5];
		double y[]=new double[5];
		for(int i=0;i<5;i++)
		{
			System.out.println("Eneter the Number : ");
			num[i]=sc.nextDouble();
		}
		System.out.println("\nIntegral part of each Number------>");
		for(int i=0;i<5;i++)
		{
		    x[i]=(int)num[i];
			System.out.println(x[i]);
		}
		System.out.println("\nDecimal part of each Number------>");
		for(int i=0;i<5;i++)
		{
			y[i]=num[i]-x[i];
			System.out.println(y[i]);
		}
	}
}
		
			
			
		