import java.util.Scanner;

class j051
{
	public static void main(String ar[])
	{
		Scanner sc=new Scanner (System.in);
		String s="",s1="";
		System.out.print("Enter the String : ");
		s=sc.nextLine();
		s=" "+s;
		for(int i=(s.length()-1);i>=0;i--)
		{
			char ch=s.charAt(i);
			if(ch!=' ')
				s1=ch+s1;
			else
			{
				System.out.print(s1);
				System.out.print(" ");
				s1="";
			}
		
		}
	}
}