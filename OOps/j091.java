import java.util.Scanner;

interface A
{
	int a=10;
	void input();
	void display();
}

interface B extends A
{
	int b=20;
	void add();
}

class C implements B
{
	int c;
	public void input()
	{
		int c=0;
	}
	
	public void add()
	{
		c=a+b;
	}
	
	public void display()
	{
		System.out.print(c);
	}
		
	public static void main(String ar[])
	{
		C ob=new C();
		ob.input();
		ob.add();
		ob.display();
	}
}
		