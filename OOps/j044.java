import java.util.Scanner;
class j044
{
	public static void main(String ar[])
	{
		Scanner sc=new Scanner (System.in);
		String s="",max="",m="";
		System.out.print("Enter the Sentence - ");
		s=sc.nextLine();
		s=s+" ";
		
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(ch!=' ')
				m=m+ch;
			else 
			{
				if(max.length()<m.length())
					max=m;
				
				m="";
			}
			
		}
		System.out.print("The longest word is "+max);
		System.out.println();
		System.out.print("The length of word is "+max.length());
	}
}