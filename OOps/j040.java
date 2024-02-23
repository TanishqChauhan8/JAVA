import java.util.Scanner;

class j040
{
	public static void main(String ar[])
	{
		String s;
		Scanner sc=new Scanner (System.in);
		System.out.print("Enter the Word : ");
		s=sc.nextLine();
		int v=0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)=='a' || s.charAt(i)=='A' || s.charAt(i)=='e' || s.charAt(i)=='E' || s.charAt(i)=='i' || s.charAt(i)=='I' || s.charAt(i)=='o' || s.charAt(i)=='O' || s.charAt(i)=='u' || s.charAt(i)=='U')
				v++;
			else
				System.out.print(s.charAt(i));
		}
	}
}