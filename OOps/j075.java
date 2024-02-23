import java.util.Scanner;

class j075
{
	public static void main(String ar[])
	{
		Scanner sc=new Scanner (System.in);
		int n;
		System.out.print("Enter the Number of words yo enter : ");
		n=sc.nextInt();
		String a[]=new String[n];
		sc=new Scanner (System.in);
		for(int i=0;i<a.length;i++)
		{
			System.out.print("Enter the Words : ");
			a[i]=sc.nextLine();
		}
		for(int i=0;i<n;i++)
		{
			StringBuilder s=new StringBuilder(a[i]);
			String s1=String.valueOf(s.reverse());
			
			if(s(a[i]))
			System.out.println(s);
		}
	}
}