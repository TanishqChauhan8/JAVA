import java.util.Scanner;

class ABC
{
	int a,b;
	void input()
	{
		a=10;
		b=20;
	}
	
}

class XYZ extends ABC
{
	int c=0;
	void sum()
	{
		c=a+b;
		System.out.print(c);
	}
	
	public static void main(String ar[])
	{
		XYZ ob=new XYZ();
		ob.input();
		ob.sum();
	}
}