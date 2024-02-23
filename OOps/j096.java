import java.util.Scanner;

interface factorial
{
	void input();
	void fact();
}

class A implements factorial
{
	int n;
	
	public void input()
	{
		System.out.println("Enter the Number to insert : ");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
	}
	
	public void fact()
	{
		System.out.print("Factorial of "+n+" is- "); 
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				System.out.print(i+" ");
			}
		}
	}
	
	public static void main(String ar[])
	{
		A ob=new A();
		ob.input();
		ob.fact();
	}
}
		