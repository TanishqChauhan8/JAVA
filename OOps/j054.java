import java.util.Scanner;

class j054
{
	public static void main(String ar[])
	{
	Scanner sc=new Scanner (System.in);
	String s="",w="",m="";
	int c=0,mc=0;
	System.out.print("Enter the String : ");
	s=sc.nextLine();
	s=s+" ";
	for(int i=0;i<s.length();i++)
	{
		if(s.charAt(i)!=' ')
			w=w+s.charAt(i);
		else
		{
			for(int j=0;j<w.length();j++)
			{
				char ch=w.charAt(j);
				if(Character.toUpperCase(ch)=='A' || Character.toUpperCase(ch)=='E' || Character.toUpperCase(ch)=='I' || Character.toUpperCase(ch)=='O' || Character.toUpperCase(ch)=='U')
				{
					c++;
					if(c>mc)
					{
						mc=c;
						m=w;
					}
				}
			}
			c=0;
			w="";
		}
	}
	System.out.print(m);
	}
}