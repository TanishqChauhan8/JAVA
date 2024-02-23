import java.util.Scanner;

class ABC
{
	void show()
	{
		System.out.println("This is show of ABC");
	}
}

class XYZ extends ABC
{
	void show()
	{
	super.show();
	System.out.println("This is the show of XYZ");
	}
	public static void main(String ar[])
	{
		XYZ ob=new XYZ();
		ob.show();
	}
}