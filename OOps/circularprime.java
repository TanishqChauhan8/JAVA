import java.util.Scanner;

class j077
{
	int checkprime(int n)
	{
		int c=0;
		for(int i=2;i<n;i++)
		{
			if(n%i==0)
			c++;
		}
		return c;
	}
	
	int changeprime(int n)
	{
	}
	
	public static void main(String []arg)
	{
		j077 ob = new j077();
		
		Scanner sc=new Scanner(System.in);
		int n,count=0,c1=0;
		System.out.print("Enter the Number : ");
		n=sc.nextInt();
		int k=n;
		while(count<100)
		{
		c1=ob.checkprime(k);
		
		if(c1!=0)
		{
			System.out.print("Not A circular prime Number");
			break;
		}
		
		if(c1==0)
		k=ob.changeprime(n);
		
		if(k==n)
		{
		System.out.print("Its a CircularPrime");
		break;
		}
		count++;
		}
	}
}