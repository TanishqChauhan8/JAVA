import java.util.Scanner;

class ABC
{
	int a,b;
	ABC()
	{
	a=10;
	b=20;
	}
	
	ABC(ABC x)
	{
	  a=x.b;
	  b=x.a;
	}
	
	void display()
	{
		System.out.println(a);
		System.out.println(b);
	}
	
	public static void main(String ar[])
	{
		ABC ob=new ABC();
		ABC ob1=new ABC(new ABC());
		ob.display();
		ob1.display();
	}
}
	