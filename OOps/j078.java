import java.util.Scanner;

class ABC
{
	int a,b,c;
	ABC()
	{
		a=10;
		b=20;
		c=0;
	}
	
	void sum()
	{
		c=a+b;
		System.out.print(c);
	}
	
	public static void main(String ar[])
	{
		ABC ob=new ABC();
		ob.sum();
	}
}
