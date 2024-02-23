import java.util.Scanner;

class ABC
{
	int a,b,c;
	ABC(int x,int y)
	{
		a=x;
		b=y;
		c=0;
	}
	
	void sum()
	{
		c=a+b;
		System.out.print(c);
	}
	
	public static void main(String ar[])
	{
		ABC ob=new ABC(30,20);
		ob.sum();
	}
}