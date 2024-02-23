import java.util.Scanner;

class j045
{
	public static void main(String ar[])
	{
	Scanner sc=new Scanner (System.in);
	String ch;
	int k;
	System.out.print("Enter the String : ");
	ch=sc.nextLine();
	for(int i=0;i<ch.length();i++)
	{
		System.out.print("ASCII of "+ch.charAt(i)+" = ");
		k=ch.charAt(i);
		System.out.print(k);
		System.out.println();
	}
	}
}