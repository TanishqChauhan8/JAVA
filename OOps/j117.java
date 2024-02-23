import java.util.Scanner;

class ABC
{
	String str="";
	int p;
	
	void manip()
	{
		System.out.print("Enter the String : ");
		Scanner sc=new Scanner(System.in);
		str=sc.nextLine();
		System.out.print("Enter the Value of p : ");
		p=sc.nextInt();
	
		if(p%2==0)
		{
			for(int i=0;i<str.length();i+=2)
			{
				System.out.print(str.charAt(i));
			}
		}
		else
		{
			for(int i=1;i<str.length();i+=2)
			{
				System.out.print(str.charAt(i));
			}
		}
	}
}

class XYZ extends ABC
{
	int a;
	char ch;

	void manip()
	{
		super.manip();
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the Charecter : ");
		ch=sc.next().charAt(0);
		System.out.print("Enter the Number : ");
		a=sc.nextInt();
		if(ch=='s'||ch=='S')
			System.out.print("Square root of the Number : "+(a*a));
		else
			System.out.print("Cube root of the Number : "+(a*a*a));
	}
	public static void main(String ar[])
	{
		XYZ ob=new XYZ();
		ob.manip();
	}
}