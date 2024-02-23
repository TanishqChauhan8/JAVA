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
			if(s1.charAt(i)!=' ')
			{
				s2=s2+s1.charAt(i);
				c++;
			}
			else
			{
				for(int k=c-1;k>=0;k--)
				{
					s3=s3+s2.charAt(k);
				}
				
				while(j<c)
				{
				if(s3.charAt(j)==s2.charAt(j))
					System.out.print(s2.charAt(j));
				j++;
				}
			}
		}
	}
}