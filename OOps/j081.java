import java.util.Scanner;

class Stringop
{
	String str;
	String str2="";
	Stringop()
	{
	  str="";
	}
	
	void accept()
	{
	  Scanner sc=new Scanner(System.in);
	  System.out.print("Enter the Sentence : ");
	  str=sc.nextLine();
	}
	
	void encode()
	{
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)!=' ')
			str2=str2+(char)(str.charAt(i)+1);
		
			else
			str2=str2+" ";		
		}
	}
	
	void print()
	{
		for(int i=0;i<str.length();i++)
			System.out.print(str2.charAt(i));
	}
	
	public static void main(String ar[])
	{
		Stringop ob=new Stringop();
		ob.accept();
		ob.encode();
		ob.print();
	}
}
		