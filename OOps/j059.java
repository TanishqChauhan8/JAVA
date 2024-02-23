import java.util.Scanner;

class j059
{
	public static void main(String ar[])
	{
		Scanner sc=new Scanner(System.in);
		String s="";
		System.out.print("Enter the String : ");
		s=sc.nextLine();
			for(char ch ='A';ch<='Z';ch++)
			{
				int w=0;
				for(int i=0;i<s.length();i++)
				{
					if(ch==s.charAt(i))
						w++;
				}
				if(w!=0)
				System.out.println(ch+" - "+w);				
			}
	}
}