import java.util.Scanner;
interface A
{
	int x=10;
	void input();
	void sum();
}

class B implements A
{
	int a,b,c;
	public void input()
	{
		a=10;
		b=20;
		c=0;
	}
	
	public void sum()
	{
		c=a+b+x;
		System.out.print(c);
	}
	
	public static void main(String ar[])
	{
		B ob1=new B();
		ob1.input();
		ob1.sum();
	}
}
