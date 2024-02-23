import java.util.Scanner;

class j052
{
	public static void main(String ar[])
	{
		Scanner sc=new Scanner (System.in);
		String s="";
		int m[]=new int[100];
		int w=0,j=1,l=1,count=1;
		System.out.print("Enter the Sentence : ");
		s=sc.nextLine();
		for(int i=0;i<s.length();i++)
		{	
		char ch=s.charAt(i);
		if(ch!=' ')
		{
			if(ch=='a' || ch=='e' ||ch=='i' ||ch=='o' ||ch=='u')
			{
			m[w]=j++;
			}
		}
		else
		{
			w++;
			j=0;
		}
		
		}
		int max=m[0];
		while(l<=w)
		{
			if(max<m[l])
			{
			  max=m[l];
			}
			l++;
		}
		for(int q=0;q<s.length();q++)
		{
			int c=0;
			if(s.charAt(q)!=' ')
				c=1;
			else
			{
				count++;
				if(count==max)
				{
					for(int i=q+1;i<s.length();i++)
					System.out.print(s.charAt(i));
				}
			}
		}
	}
}