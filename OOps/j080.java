import java.util.Scanner;

class Calculate
{

	int num,f,rev;
	Calculate(int n)
	{
		num=n;
		f=0;
		rev=0;
	}
	
	int prime()
	{
		int count=0;
		for(int i=2;i<=num/2;i++)
		{
			if(num%i==0)
			{
			  count++;
			  break;
			}
		}
		
		if(count!=0)
			return 1;
	  
	  return 0;
	}
	
	
	int reverse()
	{
		int temp=num;
		while(temp!=0)
		{
		rev=rev*10+temp%10;
		temp=temp/10;
		}
		return rev;
	}
	
	
	void display()
	{
		if(prime()==0)
		{
			if(reverse()==num)
				System.out.print("Number is prime Pallindrome");
			else
				System.out.print("Number is not Prime Pallindrome");
		}
		
		if(prime()==1)
		System.out.print("Number is not prime Pallindrome");
	}
	
	
	public static void main(String ar[])
	{
		int n;
		Scanner sc=new Scanner (System.in);
		System.out.print("Enter the Number : ");
		n=sc.nextInt();
		Calculate ob=new Calculate(n);
		ob.display();
	}
}