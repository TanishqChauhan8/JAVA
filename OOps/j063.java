import java.util.Scanner;

class j062
{
	public static void main(String ar[])
	{
		Scanner sc=new Scanner(System.in);
		String s="",m="",n="";
		System.out.print("Enter the Sentence : ");
		s=sc.nextLine();
		int f=0;
		for(int i=0;i<s.length()-1;i++)
		{
			char ch=s.charAt(i);
			char ch1=(char)(ch+1);
			
			if(ch1==s.charAt(i+1))
				f++;
		}
		
		System.out.print("Number of words containig consecutive letters - "+f);
	}
}