import java.util.Scanner;

class ABC
{
	int a,b;
	Scanner sc=new Scanner(System.in);
	void compare()
	{
		a=10;
		b=20;
		if(a<b)
		System.out.printf("Greater of two : %d\n",b);
		else
		System.out.printf("Greater of two : %d\n",a);
	}
}

class XYZ extends ABC 
{
	char ch1,ch2;
	void compare()
	{
		super.compare();
		System.out.print("Enter the Character 1 : ");
		ch1=sc.next().charAt(0);
		System.out.print("Enter the Charcter 2 : ");
		ch2=sc.next().charAt(0);
		int a=(int)ch1;
		int b=(int)ch2;
		if(a<b)
		System.out.printf("Greater of two : %c\n",ch2);
		else
		System.out.printf("Greater of two : %c\n",ch1);
	}
}

class PQR extends XYZ
{
	String s1=new String ("TanChan");
	String s2=new String ("Bigbro");
	void compare()
	{
	super.compare();
	if(s1.length()<s2.length())
		System.out.print("Greatest of two string : "+s2);
	else
	System.out.print("Greatest of two string : "+s1);
	}
	
	public static void main(String ar[])
	{
		PQR ob=new PQR();
		ob.compare();
	}
}