import java.util.Scanner;

class j048
{
	public static void main(String ar[])
	{
		Scanner sc=new Scanner (System.in);
		String s="",w="";
		System.out.print("Enter the Sentence : ");
		s=sc.nextLine();
		s=s+" ";
		char temp;
		for(int i=0;i<s.length();i++)
		{
			int j=0,c=0;
			if(s.charAt(i)!=' ')
			{
				w.charAt(i)=s.charAt(i);
				c++;
			}
			else
			{
				for(int i=0;i<c/2;i++)
				{
					temp=w.charAt(i);
					w.charAt(i)=w.charAt(c-1);
					w.charAt(c-1)=temp;
				}
				
				while(j<c)
				{
				if(s.charAt(j)==w.charAt(j))
					System.out.print(w.charAt(j));
				j++;
				}
			}
		}
	}
}