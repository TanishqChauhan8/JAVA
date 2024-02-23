import java.util.Scanner ;

class ABC
{
	int s=10;
	void perimeter()
	{
		System.out.println("Perimeter of Square "+(4*s));
	}
}

class XYZ extends ABC
{
	int l=10,b=10;
	void perimeter()
	{
	super.perimeter();
	System.out.println("Perimeter of Rectangle "+(2*(l+b)));
	}
}

class PQR extends XYZ
{
	int r=10;
	void perimeter()
	{
		super.perimeter();
		System.out.printf("Perimeter of Circle %.2f",(2*(22.0/7.0)*r));
	}
	public static void main(String ar[])
	{
		PQR ob=new PQR();
		ob.perimeter();
	}
}