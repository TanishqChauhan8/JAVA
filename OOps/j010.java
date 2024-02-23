import java.util.Scanner;

class j010
{
	public static void main(String arr[])
	{
		Scanner sc=new Scanner(System.in);
		int f[]=new int[2];
		double c=0;
		System.out.println("Enter temperatures in farahehite ----->");
		for(int i=0;i<f.length;i++)
			f[i]=sc.nextInt();
		
		for(int i=0;i<f.length;i++)
		{
			c=(5.0/9.0)*(f[i]-32);
			System.out.println(c+" ");
		}
	}
}	