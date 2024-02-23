import java.util.Scanner;

class j048
{
	public static void main(String ar[])
	{
		Scanner sc=new Scanner (System.in);
		String s1="",s2="",s3="";
		System.out.print("Enter the Sentence : ");
		s1=sc.nextLine();
		int j=0,c=0;
		char temp;
		for(int i=0;i<s1.length();i++)
		{
			char ch=s1.charAt(i);
			if(ch!=' ')
			{
				s2=s2+ch;
				s3=ch+s3;
				c++;
			}
			else
			{
				if(s3.equals(s2))
				{
					System.out.print(s3);
					s3=" ";
				    s2=" ";
				}
			}
		}
	}
}