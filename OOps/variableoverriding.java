import java.util.Scanner;

class j113
{
	int p=10;
}

class XYZ extends j113
{
	int p=20;
	void display(int p)
	{
		System.out.println("Value of p "+super.p);
		System.out.println("Value of p "+this.p);
		System.out.println("Value of p "+p);
	}
	public static void main(String ar[])
	{
		XYZ ob=new XYZ();
		ob.display(30);
	}
}
