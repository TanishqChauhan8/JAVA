import java .util.Scanner;

class main
{
	public static void main(String ar[])
	{
	int a[]=new int[5];
	Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter Character into the Array : ");
	for (int i=0;i<a.length;i++)
	{
		a[i]=sc.nextInt();
	}
	for(int i=0;i<a.length;i++)
	{
		if(a[i]==7)
		System.out.println("7 found");
	}
	}
}