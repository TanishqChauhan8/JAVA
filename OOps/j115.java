import java.util.Scanner;

class ABC
{
	int b=10,h=20;
	void area()
	{
		System.out.println("The Are of Parralelogram = "+(b*h));
	}
}

class XYZ extends ABC
{
	int d1=10,d2=10;
	void area()
	{
		super.area();
		System.out.println("The Area of Rohmbus = "+((1.0/2.0)*d1*d2));
	}
}

class PQR extends XYZ
{
	int a=10,b=20,h=10;
	void area()
	{
		super.area();
		System.out.println("Area of Trapezium = "+((1.0/2.0)*(a+b)*h));
	}
	public static void main(String ar[])
	{
		PQR ob=new PQR();
		ob.area();
	}
}