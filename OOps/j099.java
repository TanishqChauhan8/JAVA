import java.util.Scanner;

abstract class ABC
{
	int a=10,b=20;
	
	void mul()
	{
	a*=b;
	}
	
	abstract void sum();
}

class XYZ extends ABC
{
	void sum()
	{
		a+=10;
	}
	
	void display()
	{
		System.out.println(a);
	}
	
	public static void main(String ar[])
	{
		XYZ ob=new XYZ();
		ob.sum();
		ob.display();
	}
}
