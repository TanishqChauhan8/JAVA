import java.util.Scanner;

interface prime
{
	void input();
	void checkprime();
}

class A implements prime
{
	int n;
	public void input()
	{
		Scanner sc=new Scanner (System.in);
		System.out.print("Enter the Number to insert : ");
		n=sc.nextInt();
	}
	
	public void checkprime()
	{
		int c=0;
		for(int i=2;i<=n/2;i++)
		{
			if(n%i==0)
			{
				c++;
				return;
			}
		}
		
		if(c!=0)
		System.out.println("Not a prime Number");
		
		else
		System.out.println("Its a prime Number");
	}
	
	public static void main(String ar[])
	{
		A ob=new A();
		ob.input();
		ob.checkprime();
	}
}