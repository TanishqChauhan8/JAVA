import java.util.*;

interface A{
	double pi=3.14;
	abstract void volume();
}



class Cone implements A
{
	Scanner sc=new Scanner(System.in);

	public void volume(){
	System.out.println("Enter the Radius and height of the Cone : ");
	int r=sc.nextInt();
	int h=sc.nextInt();
	double v=(1.0/3.0)pi(Math.pow(r,2))*h;
	System.out.printf("%.1f\n",v);
	}
	
}

class Hemisphere implements A{
	
	Scanner sc=new Scanner(System.in);
	public void volume()
	{
		System.out.println("Enter the Radius of the Hemisphere : ");
		int r=sc.nextInt();
		double v=(2.0/3.0)pi(Math.pow(r,3));
		System.out.printf("%.1f",v);
	}
}

class Cylinder implements A{

	
	Scanner sc=new Scanner(System.in);
	public void volume()
	{
		System.out.println("Enter the r and h : ");
		int r=sc.nextInt();
		int h=sc.nextInt();
	
		double v=pi*(Math.pow(r,2))*h;
		System.out.printf("%.1f",v);
	}
	
	public static void main(String args[])
	{
		Cylinder ob1=new Cylinder();
		ob1.volume();
		Hemisphere ob2=new Hemisphere();
		ob2.volume();
		Cone ob3=new Cone();
		ob3.volume();
	}
}
