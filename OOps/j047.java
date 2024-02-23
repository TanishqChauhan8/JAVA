import java.util.Scanner;
class j047
{
	public static void main(String ar[])
	{
		Scanner sc=new Scanner(System.in);
		String s;
		System.out.print("Enter the Sentence : ");
		s=sc.nextLine();
		System.out.print(s.charAt(0));
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)==' ')
				System.out.print(s.charAt(i+1));
		}
	}
}	