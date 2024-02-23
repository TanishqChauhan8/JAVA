import java.util.Scanner;

interface A
{
	int a=10;
	void add();
	void display();
	void print();
}

class B implements A
{
	int c;
	public void add()
	{
		int b=10;
		c=0;
		c=a+b;
	}
	
	public void display()
	{
		System.out.println(c);
	}
	
	public void print()
	{
	}
}

class C implements A
{
	public void add()
	{
	}
	
	public void display()
	{
	}
	
	public void print()
	{
		int d=20;
		System.out.print(d);
	}
	
	public static void main(String ar[])
	{
		C ob=new C();
		B ob1=new B();
		ob1.add();
		ob1.display();
		ob.print();
	}
}