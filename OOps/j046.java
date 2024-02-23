import java.util.Scanner;
class j046
{
	public static void main(String ar[])
	{
		Scanner sc=new Scanner(System.in);
		String s="";
		System.out.print("Enter the Sentence in uppercase : ");
		s=sc.nextLine();
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(Character.toUpperCase(ch)=='A' || Character.toUpperCase(ch)=='E' || Character.toUpperCase(ch)=='I' || Character.toUpperCase(ch)=='O' || Character.toUpperCase(ch)=='U')
				System.out.print("*");
			else
				System.out.print(s.charAt(i));
		}
	}
}