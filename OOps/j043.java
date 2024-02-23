import java.util.Scanner;

class j043
{
	public static void main(String ar[])
	{
		String s;
		int j=0;
		Scanner sc=new Scanner (System.in);
		System.out.print("Enter the 3 words Name - ");
		s=sc.nextLine();
		
		for(int i=(s.length()-1);i>=0;i--)
		{
			if(s.charAt(i)==' ')
				break;
			j=i;
		}
		
		for(int i=j;i<s.length();i++)
			System.out.print(s.charAt(i));
		
		System.out.print(" ");
		for(int i=0;i<j-1;i++)
			System.out.print(s.charAt(i));
	}
}